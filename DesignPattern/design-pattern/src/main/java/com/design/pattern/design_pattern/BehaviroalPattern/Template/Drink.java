package com.design.pattern.design_pattern.BehaviroalPattern.Template;

public abstract class Drink {
    final void make() {
        boilWater();
        brew();
        pour();
    }
    void boilWater() {
        System.out.println("Boiling water");
    }
    abstract void brew();
    void pour() {
        System.out.println("Pouring into cup");
    }
    
}
