package com.design.pattern.design_pattern.StructuralDesignPattern.Bridge;

public class SonyTv implements Tv {
    @Override
    public void turnOn() {
        System.out.println("Sony TV is now ON.");
    }

}
