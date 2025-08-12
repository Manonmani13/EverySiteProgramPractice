package com.design.pattern.design_pattern.StructuralDesignPattern.ProxyPattern;

public class RealDoor implements Door {
    @Override
    public void open() {
        System.out.println("Door is opened");
    }
    
}
