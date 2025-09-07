package com.jwt.jwt;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

@Component
public class JwtAuthFilter extends OncePerRequestFilter {

    private final UserDetailsService userDetailsService;
    private final JwtService jwtService;
    

    @Override
    protected void doFilterInternal(javax.servlet.http.HttpServletRequest request,
            javax.servlet.http.HttpServletResponse response, javax.servlet.FilterChain filterChain)
            throws java.io.IOException, javax.servlet.ServletException {
        // TODO Auto-generated method stub
        
    }
    
}
