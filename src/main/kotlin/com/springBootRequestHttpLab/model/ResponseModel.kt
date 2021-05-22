package com.springBootRequestHttpLab.model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
open class ResponseModel(
                @JsonProperty("@odata.context") var dataContext: String? = null,
                @JsonProperty("value")
                var value: List<AgenciaResponseModel> = mutableListOf<AgenciaResponseModel>()
)
