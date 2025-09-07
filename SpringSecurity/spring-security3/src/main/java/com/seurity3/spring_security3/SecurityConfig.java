package com.seurity3.spring_security3;

import java.net.http.HttpClient;

import org.springframework.boot.autoconfigure.graphql.GraphQlProperties.Http;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .authorizeHttpRequests((requests) -> requests
                .requestMatchers("/api/public/**").permitAll()
                .requestMatchers("/api/resticted/**").authenticated()
                .anyRequest().denyAll()
            )
            .formLogin((form) -> form
                .loginProcessingUrl("/api/signin")
                .failureHandler(authenticationFailureHandler())
            )
            .csrf().disable();
        return http.build();
    }
 @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public AuthenticationFailureHandler authenticationFailureHandler() {
        return new CustomAuthenticationFailureHandler();
    }
    
}
