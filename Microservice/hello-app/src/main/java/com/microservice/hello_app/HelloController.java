package com.microservice.hello_app;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class HelloController {
    
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/hello")
    public String getMethodName() {
        return restTemplate.getForObject("http://product-app:8082", String.class);
    }
    
}
