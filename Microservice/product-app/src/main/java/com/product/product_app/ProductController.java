package com.product.product_app;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class ProductController {
    

    @GetMapping("/product")
    public String getProduct() {
        return "Product details";
    }
    
}
