package com.security.security1_example;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class CustomController {

    @GetMapping("/delete")
    public String getMethodName() {
        return "This is the delete request";
    }
    
    
}
