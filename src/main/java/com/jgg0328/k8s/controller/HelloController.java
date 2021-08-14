package com.jgg0328.k8s.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() throws UnknownHostException {
        return "hello :: " + InetAddress.getLocalHost().getHostName();
    }

}
