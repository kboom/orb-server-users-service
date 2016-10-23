package com.kbhit.orangebox.users.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories("com.kbhit.orangebox.users.domain.repository")
public class DatabaseConfiguration {
}
