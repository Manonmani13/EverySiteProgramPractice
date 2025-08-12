package com.design.pattern.design_pattern.StructuralDesignPattern.Bridge;

public class BasicRemote    extends RemoteController {

    public BasicRemote(Tv tv) {
        super(tv);
    }

    @Override
    void pressButton() {
        System.out.println("Basic Remote: Pressing button to turn on TV.");
        tv.turnOn();
    }
    
}
