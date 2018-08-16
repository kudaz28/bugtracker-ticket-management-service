package org.keysoft.bugtracker.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableAutoConfiguration
@EntityScan(basePackages = {"org.keysoft.bugtracker.domain"})
@EnableJpaRepositories(basePackages = {"org.keysoft.bugtracker.repository"})
@EnableTransactionManagement
public class RepositoryConfiguration {
}
