package com.microservice.hello_app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class HomeConfig {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
    
}
