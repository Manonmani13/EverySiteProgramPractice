package com.security2.spring_security2_example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class LoginController {

    @GetMapping("/welcome")
    public String welcome() {
        return "welcome.html";
    }

    @GetMapping("/admin")
    public String user() {
        return "admin.html";
    }

    @GetMapping("/basic")
    public String basic() {
        return "basic.html";
    }
    
    @GetMapping("/login")
    public String login() {
        return "login.html";
    }
    
}
