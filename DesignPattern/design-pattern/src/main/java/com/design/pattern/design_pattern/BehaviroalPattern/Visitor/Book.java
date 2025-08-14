package com.design.pattern.design_pattern.BehaviroalPattern.Visitor;

public class Book implements Item {
    
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    
    
}
