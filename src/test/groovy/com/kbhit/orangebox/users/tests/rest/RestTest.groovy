package com.kbhit.orangebox.users.tests.rest

import com.github.tomakehurst.wiremock.WireMockServer
import com.jayway.restassured.RestAssured
import com.kbhit.orangebox.users.UsersApplication
import com.kbhit.orangebox.users.config.StandaloneConfig
import com.kbhit.orangebox.users.config.TestUtilsConfig
import com.kbhit.orangebox.users.dbsetup.DbSetupTestDataLoader
import com.kbhit.orangebox.users.security.jwt.TokenProvider
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ActiveProfiles
import spock.lang.Specification

@ActiveProfiles("dev")
@SpringBootTest(classes = [UsersApplication.class, StandaloneConfig.class, TestUtilsConfig.class],
        webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
abstract class RestTest extends Specification {

    @Value('${local.server.port}')
    int port

    @Autowired
    DbSetupTestDataLoader testDataLoader

    @Autowired
    WireMockServer wireMockServer

    @Autowired
    TokenProvider tokenProvider

    def setup() {
        RestAssured.port = port
        wireMockServer.start()
        testDataLoader.cleanTables()
    }

    def destroy() {
        wireMockServer.stop()
    }

}
