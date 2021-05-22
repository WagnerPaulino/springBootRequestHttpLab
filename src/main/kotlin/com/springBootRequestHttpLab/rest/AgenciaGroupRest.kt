package com.springBootRequestHttpLab.rest

import com.springBootRequestHttpLab.model.AgenciaGroupModel
import com.springBootRequestHttpLab.service.AgenciaGroupUseCase
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/agencia-group")
class AgenciaGroupRest(@Autowired var agenciaGroupUseCase: AgenciaGroupUseCase) {

    @GetMapping("/by-state")
    fun getByState(): Map<String, MutableList<AgenciaGroupModel>> {
        return agenciaGroupUseCase.getAgenciaGroupByState()
    }
}
