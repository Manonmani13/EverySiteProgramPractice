package com.design.pattern.design_pattern.StructuralDesignPattern.FlyWeight;

public class Letter {
    char c;
    Letter(char c) {
        this.c = c;
    }
    void print() {
        System.out.print(c + " ");
    }
}
