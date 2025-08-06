package com.criuitebreaker.spring_boot_name;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class NameController {

    @GetMapping("/name")
    public String getMethodName() {
        return "mano";
    }
    
    
}
