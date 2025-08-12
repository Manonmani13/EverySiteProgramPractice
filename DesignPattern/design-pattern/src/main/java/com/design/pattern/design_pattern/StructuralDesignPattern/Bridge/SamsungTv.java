package com.design.pattern.design_pattern.StructuralDesignPattern.Bridge;

public class SamsungTv implements Tv {
    @Override
    public void turnOn() {
        System.out.println("Samsung TV is now ON.");
    }
    
}
