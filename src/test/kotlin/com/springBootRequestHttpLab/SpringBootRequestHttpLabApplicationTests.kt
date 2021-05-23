package com.springBootRequestHttpLab

import com.springBootRequestHttpLab.service.AgenciaGroupUseCase
import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class SpringBootRequestHttpLabApplicationTests(
        @Autowired val agenciaGroupUseCase: AgenciaGroupUseCase
) {

    @Test
    fun contextLoads() {
        Assertions.assertThat(agenciaGroupUseCase).isNotNull()
    }

    @Test
    fun isLoadingAgenciaGroup() {
        var agenciaGroup = agenciaGroupUseCase.getAgenciaGroupByState()
        Assertions.assertThat(agenciaGroup.size).isGreaterThan(0)
        Assertions.assertThat(agenciaGroup.get("SP")?.size).isGreaterThan(0)
    }
}
