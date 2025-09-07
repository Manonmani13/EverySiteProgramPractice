package com.jwt.jwt;


import com.ey.springboot3security.filter.JwtAuthFilter;
import com.ey.springboot3security.service.UserInfoDetails;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
@Configuration
@EnableWebSecurity
public class SecurityConfig {

    private final JwtAuthFilter jwtAuthFilter;
    private final UserDetailsService userDetailsService;

    // Constructor injection for required dependencies
    public SecurityConfig(JwtAuthFilter jwtAuthFilter, 
                     UserDetailsService userDetailsService) {
    this.jwtAuthFilter = jwtAuthFilter;
    this.userDetailsService = userDetailsService;
}

    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
        http
        .csrf(csrf-> csrf.disable())
        .authorizeHttpRequests(auth ->auth
        .requestMatchers("/auth/welcome","/auth/addNewUser","/auth/generateToken").permitAll()
        .requestMatchers("/auth/user/**").hasAuthority("ROLE_USER")
        .requestMatchers("/auth/admin/**").hasAuthority("ROLE_ADMIN")
        .anyRequest().authenticated()   
        )
        .sessionManagement(sess -> sess.sessionCreationPolicy(sessionCreationPolicy.STATELESS))
        .userDetailsService(userDetailsService);

    }
}
