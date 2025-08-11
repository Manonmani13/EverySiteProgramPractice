package com.design.pattern.design_pattern.Abstract;

public class ProductAFactory  implements ProductFactory {

    @Override
    public Product createProduct() {
        return new ProductA();
    }
    
    // Additional factory methods can be added here if needed
    
}
