package com.kbhit.orangebox.users.domain;

import com.kbhit.orangebox.users.TestDataLoader;
import com.kbhit.orangebox.users.UsersApplication;
import com.kbhit.orangebox.users.config.StandaloneConfig;
import com.kbhit.orangebox.users.config.TestServicesConfig;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@ActiveProfiles("dev")
@SpringBootTest(classes = {UsersApplication.class, StandaloneConfig.class, TestServicesConfig.class},
        webEnvironment = SpringBootTest.WebEnvironment.MOCK)
public abstract class DomainTest {

    private static boolean testDataLoaded = false;

    @Autowired
    private TestDataLoader testDataLoader;

    @Before
    public void before() {
        if (!testDataLoaded) {
            loadTestData(testDataLoader);
            testDataLoaded = true;
        }
    }

    protected void loadTestData(TestDataLoader testDataLoader) {

    }

}
