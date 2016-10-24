package com.kbhit.orangebox.users.tests.rest

import com.kbhit.orangebox.users.TestDataLoader
import org.springframework.beans.factory.annotation.Autowired

import static com.jayway.restassured.RestAssured.given
import static com.jayway.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath
import static org.hamcrest.core.IsEqual.equalTo

final class FindsUserByLoginRestTest extends RestTest {

    @Autowired
    TestDataLoader testDataLoader

    @Autowired
    SecurityFilter securityFilter


    def "Gets user by login"() {
        given:
        testDataLoader.createDummyUsers()
        def request = given()
                .filter(securityFilter)
                .accept("application/json");

        when:
        def response = request.when().get("/users/greg")

        then:
        response.then().statusCode(200)
                .body(matchesJsonSchemaInClasspath("user.json"))
                .body("username", equalTo("greguser"))
                .body("password", equalTo("gregpass"))
                .body("activated", equalTo("true"))
                .body("authorities[0]", equalTo("user"))

    }

}
