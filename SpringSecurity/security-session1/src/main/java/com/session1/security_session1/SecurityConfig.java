package com.session1.security_session1;

import org.springframework.boot.autoconfigure.graphql.GraphQlProperties.Http;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity)   throws Exception {
        httpSecurity
                .authorizeHttpRequests()
                        .anyRequest().authenticated()
                .and()
                .httpBasic()
                .loginPage("/login")
                .permitAll()
                .defaultSuccessUrl("/home", true)
                .and()
                .logout()
                .logoutSuccessUrl("/login?logout")
                .and()
                .sessionManagement()
                .maximumSessions(1)
                .maxSessionsPreventsLogin(true);    
        return httpSecurity.build();
    }
    
}
