package com.kbhit.orangebox.trading.config;

import com.github.tomakehurst.wiremock.WireMockServer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.wireMockConfig;

@Configuration
public class StandaloneConfig {

    @Bean
    public WireMockServer wireMockServer() {
        return new WireMockServer(wireMockConfig().port(5000));
    }

}
