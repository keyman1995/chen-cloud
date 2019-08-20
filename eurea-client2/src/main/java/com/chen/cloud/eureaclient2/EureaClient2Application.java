package com.chen.cloud.eureaclient2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EureaClient2Application {

    public static void main(String[] args) {
        SpringApplication.run(EureaClient2Application.class, args);
    }

}
