package com.zhao.config.client.controller;

import com.zhao.config.client.config.ConfigInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

    @Autowired
    private ConfigInfo info;

    @GetMapping("/getinfo")
    public String getInfo(){
        return info.getName()+":"+info.getAddr();
    }
}
