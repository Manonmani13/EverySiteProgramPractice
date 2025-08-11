package com.design.pattern.design_pattern.Abstract;

public class ProductFactoryMain {
    public static void main(String[] args) {
        ProductFactory productAFactory = new ProductAFactory();
        Product productA = productAFactory.createProduct();
        System.out.println("Created: " + productA.getName());

        ProductFactory productBFactory = new ProductBFactory();
        Product productB = productBFactory.createProduct();
        System.out.println("Created: " + productB.getName());
    }
}
