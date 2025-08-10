package com.solid.principles.solid_principles_example1.OpenClosePrinciples;

public class DiffernetShape {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        AreaCalculator areaCalculator = new AreaCalculator();
        System.out.println("Circle Area: " + areaCalculator.calculateArea(circle));
    }
}
