package com.cricutebreaker.spring_boot_empl;

import java.sql.Time;
import java.time.Duration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.github.resilience4j.circuitbreaker.CircuitBreaker;
import io.github.resilience4j.circuitbreaker.CircuitBreakerConfig;
import io.github.resilience4j.timelimiter.TimeLimiterConfig;

@Configuration
public class ReselienceConfig {
    @Bean
    public TimeLimiterConfig timeLimiterConfig() {
        return TimeLimiterConfig.custom()
                .timeoutDuration(Duration.ofSeconds(5)) // Set the timeout duration
                .build();
    }

    @Bean
    public CircuitBreakerConfig circuitBreakerConfig() {
        return CircuitBreakerConfig.custom()
                .failureRateThreshold(50) // Set the failure rate threshold
                .waitDurationInOpenState(Duration.ofSeconds(30)) // Set the wait duration in open state
                .slidingWindowSize(10) // Set the sliding window size
                .build();
    }

    @Bean
    public org.springframework.cloud.client.circuitbreaker.Customizer<Resilence4jCricuitBreakerConfig> circuitBreakerCustomizer() {
        return config -> config
                .timeLimiterConfig(timeLimiterConfig())
                .circuitBreakerConfig(circuitBreakerConfig()).build();
    }
}
