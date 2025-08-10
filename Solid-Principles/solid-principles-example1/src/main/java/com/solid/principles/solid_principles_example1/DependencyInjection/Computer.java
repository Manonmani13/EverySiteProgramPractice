package com.solid.principles.solid_principles_example1.DependencyInjection;

public class Computer {

    private Keyboard keyboard;

    public Computer(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public void connectKeyboard() {
        keyboard.connect();
    }

    // Additional methods for Computer can be added here
    
}
