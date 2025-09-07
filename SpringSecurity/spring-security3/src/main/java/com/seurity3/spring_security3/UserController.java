package com.seurity3.spring_security3;

import org.springframework.boot.autoconfigure.couchbase.CouchbaseProperties.Authentication;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/api")
public class UserController {

    private final UserRepository userRepository;

    private final UserService userService;

    private final PasswordEncoder passwordEncoder;
    private final AuthenticationManager authenticationManager;
    public UserController(UserRepository userRepository, UserService userService, PasswordEncoder passwordEncoder, AuthenticationManager authenticationManager) {
        this.userRepository = userRepository;
        this.userService = userService;
        this.passwordEncoder = passwordEncoder;
        this.authenticationManager = authenticationManager;
    }

    @GetMapping("/public")
    public String getMethodName( ){
        return "This is a public endpoint accessible to everyone.";
    }
    
    @GetMapping("/restricted")
    public String restrictedEndpoint() {
        return "This is a restricted endpoint accessible only to authenticated users.";
    }

    @PostMapping("/signup")
    public ResponseEntity<User> signup(@RequestBody User entity) {
        //TODO: process POST request
        try{
            entity.setPassword(passwordEncoder.encode(entity.getPassword()));
            userRepository.save(entity);
            return ResponseEntity.ok(entity);
        }
        catch(Exception e){
            return ResponseEntity.status(500).build();
        }
    }

    @PostMapping("/signin")
    public ResponseEntity<User> signIn(@RequestBody User entity) {
        //TODO: process POST request
        try{
            Authentication auth =(Authentication) authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(entity.getUsername(), entity.getPassword()))
        
            SecurityContextHolder.getContext().setAuthentication((org.springframework.security.core.Authentication) auth);
            return ResponseEntity.ok(userService.findByUsername(entity.getUsername()));
                    }            catch(Exception e){
            return ResponseEntity.status(401).build();
        }
    }
    
    
}
