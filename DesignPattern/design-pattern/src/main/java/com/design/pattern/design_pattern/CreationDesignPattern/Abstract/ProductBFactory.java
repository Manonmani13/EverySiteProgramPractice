package com.design.pattern.design_pattern.Abstract;

public class ProductBFactory implements ProductFactory {

    @Override
    public Product createProduct() {
        return new ProductB();
    }
    
    // Additional factory methods can be added here if needed
    
}
