package com.design.pattern.design_pattern.BehaviroalPattern.Interpeter;

public class Number  implements Expression {
    private int number;

    public Number(int number) {
        this.number = number;
    }

    @Override
    public int interpret() {
        return number;
    }
    
}
