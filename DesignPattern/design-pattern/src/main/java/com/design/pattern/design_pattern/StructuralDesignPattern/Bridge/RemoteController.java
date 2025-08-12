package com.design.pattern.design_pattern.StructuralDesignPattern.Bridge;

public abstract class RemoteController {
    protected Tv tv;

    public RemoteController(Tv tv) {
        this.tv = tv;
    }

    abstract void pressButton();
}
