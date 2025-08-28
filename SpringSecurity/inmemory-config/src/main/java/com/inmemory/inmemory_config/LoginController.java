package com.inmemory.inmemory_config;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class LoginController {


    @GetMapping("/customLogin")
    public String getMethodName() {
        return "custom-login";
    }
    
    
}
