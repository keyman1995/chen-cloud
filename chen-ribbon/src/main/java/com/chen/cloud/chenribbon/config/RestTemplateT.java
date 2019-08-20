package com.chen.cloud.chenribbon.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateT {

    @Bean
    @LoadBalanced
    public RestTemplate template() {
        return new RestTemplate();
    }


}
