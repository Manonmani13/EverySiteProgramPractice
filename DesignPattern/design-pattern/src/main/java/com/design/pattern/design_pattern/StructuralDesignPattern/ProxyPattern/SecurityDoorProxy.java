package com.design.pattern.design_pattern.StructuralDesignPattern.ProxyPattern;

public class SecurityDoorProxy implements Door {
    private RealDoor realDoor;

    public SecurityDoorProxy() {
        this.realDoor = new RealDoor();
    }

    @Override
    public void open() {
        if (authenticate()) {
            realDoor.open();
        } else {
            System.out.println("Access denied. Security check failed.");
        }
    }

    private boolean authenticate() {
        // Simulate security check
        System.out.println("Performing security check...");
        return true; // Assume authentication is successful for simplicity
    }
    
}
