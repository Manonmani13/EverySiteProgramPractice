package com.solid.principles.solid_principles_example1.Liskov;

public class Sprrow  extends Bird implements FlyingBird {
    @Override
    public void makeSound() {
        System.out.println("Chirp Chirp");
    }

    @Override
    public void fly() {
        System.out.println("Sparrow is flying");
    }
    
}
