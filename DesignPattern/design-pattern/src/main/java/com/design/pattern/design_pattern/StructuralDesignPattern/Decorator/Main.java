package com.design.pattern.design_pattern.StructuralDesignPattern.Decorator;

public class Main {
    public static void main(String[] args) {
        Pizza pizza =new BasicPizza();
        pizza = new CheeseDecorator(pizza);
        System.out.println(pizza.getDescription());
    }
}