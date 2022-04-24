package com.ns.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.aws.autoconfigure.context.ContextInstanceDataAutoConfiguration;
import org.springframework.cloud.aws.autoconfigure.context.ContextStackAutoConfiguration;
import org.springframework.cloud.aws.jdbc.config.annotation.EnableRdsInstance;

@SpringBootApplication(exclude = ContextStackAutoConfiguration.class)
public class PostgreSqlRdsDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(PostgreSqlRdsDemoApplication.class, args);
    }

}

