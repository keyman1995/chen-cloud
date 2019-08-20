package com.chen.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
//表示可以发现配置中心的发现者
@EnableDiscoveryClient
/**
 * 加了该注解的bean 之后表明当前bean EureaClientApplication的作用域 refresh 页面发送了post请求的 http://localhost:8080/refresh的时候
 * 当前bean实例中的属性就会从被刷新 从新从配置文件中获得，来满足热更新的效果
 */
//@RefreshScope
public class EureaClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(EureaClientApplication.class, args);
    }

}
