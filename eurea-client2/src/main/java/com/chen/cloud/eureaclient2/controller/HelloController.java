package com.chen.cloud.eureaclient2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloController {


    @GetMapping("test")
    public Object getTest(){
        System.err.println("请求到了客户端2");
        Map<String,String> singleMap = new HashMap<>();
        singleMap.put("key","Hello");
        return singleMap;
    }
}
