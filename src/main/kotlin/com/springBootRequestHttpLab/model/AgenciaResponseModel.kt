package com.springBootRequestHttpLab.model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
open class AgenciaResponseModel(
                @JsonProperty("CnpjBase") var cnpjBase: String?,
                @JsonProperty("CnpjSequencial") var cnpjSequencial: String?,
                @JsonProperty("CnpjDv") var cnpjDv: String?,
                @JsonProperty("NomeIf") var nomeIf: String?,
                @JsonProperty("Segmento") var segmento: String?,
                @JsonProperty("CodigoCompe") var codigoCompe: String?,
                @JsonProperty("NomeAgencia") var nomeAgencia: String?,
                @JsonProperty("Endereco") var endereco: String?,
                @JsonProperty("Numero") var numero: String?,
                @JsonProperty("Complemento") var complemento: String?,
                @JsonProperty("Bairro") var bairro: String?,
                @JsonProperty("Cep") var cep: String?,
                @JsonProperty("MunicipioIbge") var municipioIbge: String?,
                @JsonProperty("Municipio") val municipio: String?,
                @JsonProperty("UF") var uf: String?,
                @JsonProperty("DataInicio") var dataInicio: String?,
                @JsonProperty("DDD") var ddd: String?,
                @JsonProperty("Telefone") var telefone: String?,
                @JsonProperty("Posicao") var posicao: String?
)
