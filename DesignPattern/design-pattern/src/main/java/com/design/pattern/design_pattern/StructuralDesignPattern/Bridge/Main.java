package com.design.pattern.design_pattern.StructuralDesignPattern.Bridge;

public class Main {
    public static void main(String[] args) {
        RemoteController samsungRemote = new BasicRemote(new SamsungTv());
        samsungRemote.pressButton();    
    }
    
}
