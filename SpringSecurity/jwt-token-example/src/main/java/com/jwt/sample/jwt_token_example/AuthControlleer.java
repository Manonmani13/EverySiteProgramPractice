package com.jwt.sample.jwt_token_example;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/auth")
public class AuthControlleer {
    
    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JWTUtil jwtUtil;
    

    @PostMapping("/login")
    public ResponseEntity<Map<String, String>> login(@RequestBody Users entity) {
        //TODO: process POST request
        try{
 Authentication authentication= (Authentication) authenticationManager
        .authenticate(new UsernamePasswordAuthenticationToken(entity.getUsername(), entity.getPassword()));
        UserDetails userDetails= (UserDetails) authentication.getPrincipal();
        String tStringoken=jwtUtil.generateToken(userDetails);
        System.out.println("JWT Token: "+tStringoken);
        return ResponseEntity.ok(Map.of("token",tStringoken));
        }catch(Exception e){
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(Map.of("error","Invalid username or password"));     
        }
       
    }
    
}
