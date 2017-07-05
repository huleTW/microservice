package com.hd.mircoservices.demo;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoAController {

    @RequestMapping("/service-instances/{applicationName}")
    public String sayHello(@PathVariable String applicationName) {
        return "hello! " + applicationName;
    }
}
