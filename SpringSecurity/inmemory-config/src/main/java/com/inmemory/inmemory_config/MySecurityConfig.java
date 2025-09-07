package com.inmemory.inmemory_config;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
public class MySecurityConfig {

    @Bean
    public UserDetailsService userDetailsService(){
        UserDetails aDetails=new User(
            "mano",
            "123",
            List.of(
                new SimpleGrantedAuthority("ROLE_USER"),
                new SimpleGrantedAuthority("ROLE_ADMIN")
            )
        );
        return new InMemoryUserDetailsManager(aDetails);
    }
    
      @Bean
    public PasswordEncoder passwordEncoder() {
        return NoOpPasswordEncoder.getInstance(); // Do NOT use in production!
    }

    // ✅ SecurityFilterChain Bean - HTTP Security Configuration examplegi
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .authorizeHttpRequests()
                .anyRequest().authenticated()
            .and()
            .formLogin()
                .loginPage("/customLogin")
                .loginProcessingUrl("/process-login")
                .permitAll()
            .and()
            .httpBasic()
            .and()
            .logout()
                .permitAll();

        return http.build();
    }
}
