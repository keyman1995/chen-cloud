package com.chen.cloud.chenribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
public class RibbonController {

    @Autowired
    private RestTemplate restTemplateT;

    @GetMapping("hello")
    @ResponseBody
    public String getObject() {
        restTemplateT.getForObject("http://helloclient/test",Object.class);
        return "Hello";
    }

}
