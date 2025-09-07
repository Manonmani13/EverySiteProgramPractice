package com.securityfilterchain.spring_security_filter_chain;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GfgController {
      @GetMapping("/gfg")
    public String helloGfg() {
        return "hello-gfg";
    }
}
