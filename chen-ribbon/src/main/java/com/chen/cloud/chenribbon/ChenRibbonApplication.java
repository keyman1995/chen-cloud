package com.chen.cloud.chenribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChenRibbonApplication {

    /**
     * Ribbon 主要实现的是客户端的负载均衡 优点 针对多个服务提供者 可以采用负载均衡策略分发到每一台上，同时采用容错机制
     * 保证如果一台出现了问题不会影响到其他机器。但是需要同时维护多台机器，稳定性好。每个客户端都会有一个负载均衡器，维护成本高
     * 服务端的负载均衡就是Ngix的维护，如果nginx挂掉了所有的服务都会挂掉了，并发
     * @param args
     */
    //DynamicServerListLoadBalancer 对服务清单进行动态更新 IRule 负载均衡的策略

    /**
     *
     *
     * 权重算法的负载均衡：实现类为ResponseTimeWeightedRule
     * 权重值+总值-单个值。
     * 例如 A：70 B：10 C：90
     * A的权重 0+170-70 ------------（0,100）
     * B的权重 100+170-10-----------（100，260）
     * C的权重 260+170-90 ----------（260,340）
     *
     * 负载均衡最终取值的范围是从（0,340）取随机数时，落在（100,260）的区间概率更打一些
     *
     * @param args
     */
    /**  ServerList的实现方式 eureka关闭的时候RibbonClientConfiguration    eureka开启的时候： EurekaRibbonClientConfiguration
     * eureka 判断实例的方式是否存活的方式
     * ping Ribbon ping的实现方式 RibbonClientConfiguration
     * RibbonAutoConfiguration
     * @param args
     */

    public static void main(String[] args) {
        SpringApplication.run(ChenRibbonApplication.class, args);
    }

}
