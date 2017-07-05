package com.hd.mircoservices.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DemoAController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/service-instances/{applicationName}")
    public String sayHello(@PathVariable String applicationName) {
        return "hello! " + applicationName;
    }

    @RequestMapping("/service-instances-b/{applicationName}")
    public String sayHelloToB(@PathVariable String applicationName) {
        final String bResult = restTemplate.getForObject("http://demo-b/service-instances/{applicationName}", String.class, applicationName);
        return "hello! " + applicationName + " " + bResult;
    }
}
