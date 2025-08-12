package com.design.pattern.design_pattern.StructuralDesignPattern.Decorator;

public class CheeseDecorator implements Pizza {
    private final Pizza pizza;

    public CheeseDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", with Cheese";
    }   
    
}
