package com.kbhit.orangebox.users.config;

import com.kbhit.orangebox.users.TestDataLoader;
import com.kbhit.orangebox.users.dbsetup.DbSetupTestDataLoader;
import com.kbhit.orangebox.users.tests.rest.RestTestDriver;
import com.kbhit.orangebox.users.tests.rest.SecurityFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestUtilsConfig {

    @Bean
    public TestDataLoader testDataLoader() {
        return new DbSetupTestDataLoader();
    }

    @Bean
    public RestTestDriver restTestDriver() {
        return new RestTestDriver();
    }

    @Bean
    public SecurityFilter securityFilter() {
        SecurityFilter securityFilter = new SecurityFilter();
        securityFilter.setLogin("greg");
        securityFilter.setPassword("123");
        return securityFilter;
    }

}
