package com.design.pattern.design_pattern.Singleton;

public class SingletonMain {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.displayMessage();
    }
}
