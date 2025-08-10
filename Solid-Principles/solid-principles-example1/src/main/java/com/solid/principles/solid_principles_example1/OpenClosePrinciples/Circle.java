package com.solid.principles.solid_principles_example1.OpenClosePrinciples;

public class Circle  implements Shape {
    
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Additional methods can be added here if needed
    
}
