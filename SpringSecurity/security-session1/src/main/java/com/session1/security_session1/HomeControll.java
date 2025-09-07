package com.session1.security_session1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HomeControll {

    @GetMapping("/home")
    public String home() {
        return "home";
    }
    @GetMapping("/login")
    public String login() {
        return "login";
    }
    
    
    
}
