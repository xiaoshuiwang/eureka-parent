package com.xsw.serviceprovider.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class ProviderController {

    @RequestMapping("/query")
    @ResponseBody
    public Map query(){
        HashMap<String, String> map = new HashMap<>();
        map.put("name", "jack");
        map.put("age", "21");
        map.put("sex", "gril");

        return map;
    }
}
