package com.cricutebreaker.spring_boot_empl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.circuitbreaker.CircuitBreaker;
import org.springframework.cloud.client.circuitbreaker.CircuitBreakerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class NameService {
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private CircuitBreakerFactory circuitBreakerFactory;

    public String getEmployeeName() {
        CircuitBreaker circuitBreaker = (CircuitBreaker) circuitBreakerFactory.create("nameServiceCircuitBreaker");
        return circuitBreaker.run(()->restTemplate.getForObject("http://localhost:8081/name", String.class),throwable -> handleFallback(throwable));
        // String name = restTemplate.getForObject("http://localhost:8081/name", String.class);
        // return name != null ? name: "No Name found";

    }

    private String handleFallback(Throwable throwable) {
        return "Default Name";
    }
    // @Bean
    // public RestTemplate restTemplate() {
    //     return new RestTemplate();
    // }
    
}
