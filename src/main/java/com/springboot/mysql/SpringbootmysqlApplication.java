package com.springboot.mysql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.springboot.mysql.repository.jpa")
@SpringBootApplication
public class SpringbootmysqlApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootmysqlApplication.class, args);
    }
}
