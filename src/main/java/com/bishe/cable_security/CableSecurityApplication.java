package com.bishe.cable_security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.bishe.cable_security.repository")
@SpringBootApplication(scanBasePackages = {"com.bishe.cable_security"})
public class CableSecurityApplication {

    public static void main(String[] args) {
        SpringApplication.run(CableSecurityApplication.class, args);
    }

}
