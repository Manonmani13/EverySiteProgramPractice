package com.solid.principles.solid_principles_example1.OpenClosePrinciples;

public class AreaCalculator {
    
    public double calculateArea(Shape shape) {
      return shape.calculateArea();
    }
}
