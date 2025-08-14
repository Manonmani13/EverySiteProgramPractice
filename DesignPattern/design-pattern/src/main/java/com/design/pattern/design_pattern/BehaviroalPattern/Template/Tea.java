package com.design.pattern.design_pattern.BehaviroalPattern.Template;

public class Tea  extends Drink{

    @Override
    void brew() {
        // TODO Auto-generated method stub
        System.out.println("Steeping the tea");
        throw new UnsupportedOperationException("Unimplemented method 'brew'");
    }
    
}
