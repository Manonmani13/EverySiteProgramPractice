package com.solid.principles.solid_principles_example1.InterfaceSegegrigation;

public class Robot  implements Worker {
    @Override
    public void work() {
        System.out.println("Robot is performing tasks");
    }
    
    // Robots do not eat, so we do not implement Eatable
    
}
