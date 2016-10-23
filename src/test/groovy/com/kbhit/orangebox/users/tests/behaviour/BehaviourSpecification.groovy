package com.kbhit.orangebox.users.tests.behaviour

import com.kbhit.orangebox.users.TestDataLoader
import com.kbhit.orangebox.users.UsersApplication
import com.kbhit.orangebox.users.config.DummiesConfig
import com.kbhit.orangebox.users.config.StandaloneConfig
import com.kbhit.orangebox.users.config.TestServicesConfig
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ActiveProfiles
import spock.lang.Specification

@ActiveProfiles("dev")
@SpringBootTest(classes = [UsersApplication.class, DummiesConfig.class,
        StandaloneConfig.class, TestServicesConfig.class],
        webEnvironment = SpringBootTest.WebEnvironment.MOCK)
public abstract class BehaviourSpecification extends Specification {

    private static boolean testDataLoaded = false;

    @Autowired
    private TestDataLoader testDataLoader

    def setupSpec() {
        testDataLoaded = false
    }

    def cleanupSpec() {
        testDataLoaded = false
    }

    def setup() {
        if (!testDataLoaded) {
            testDataLoader.cleanTables()
            loadTestData(testDataLoader)
            testDataLoaded = true
        }
    }

    protected void loadTestData(TestDataLoader testDataLoader) {

    }

}
