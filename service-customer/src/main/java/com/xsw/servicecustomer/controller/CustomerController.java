package com.xsw.servicecustomer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
@ResponseBody
public class CustomerController {

    @Autowired
    public RestTemplate restTemplate;

    @GetMapping("hello")
    public String queryCustomer(){
        String respond = restTemplate.getForEntity("http://service-prodvider:8762/query",String.class).getBody();

        return respond;
    }
}
