package com.solid.principles.solid_principles_example1.Liskov;

    public class Penguin extends Bird {
    @Override
    public void makeSound() {
        System.out.println("Squawk Squawk");
    }

    // Penguins cannot fly, so we do not implement FlyingBird
}   