package com.chen.servers.eureaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EureaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EureaServerApplication.class, args);
    }

}
