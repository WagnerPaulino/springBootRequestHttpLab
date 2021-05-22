package com.springBootRequestHttpLab.service

import com.springBootRequestHttpLab.model.AgenciaGroupModel
import com.springBootRequestHttpLab.model.ResponseModel
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate

@Service
class AgenciaGroupUseCase(@Autowired val restTemplate: RestTemplate) {

    val url: String =
            "https://olinda.bcb.gov.br/olinda/servico/Informes_Agencias/versao/v1/odata/Agencias?format=json"

    fun getAgenciaGroupByState(): Map<String, MutableList<AgenciaGroupModel>> {
        val response = restTemplate.getForObject(url, ResponseModel().javaClass)
        var group = mutableMapOf<String, MutableList<AgenciaGroupModel>>()
        response?.value?.forEach({ agencia ->
            run {
                var agenciaGroup =
                        AgenciaGroupModel(agencia.nomeIf, agencia.nomeAgencia, agencia.municipio)
                if (group.containsKey(agencia.uf)) {
                    group.get(agencia.uf)?.add(agenciaGroup)
                } else {
                    group.set(agencia.uf!!, mutableListOf<AgenciaGroupModel>(agenciaGroup))
                }
            }
        })
        group.entries.forEach({ (_, value) -> value.sortBy { it.city } })
        return group
    }
}
