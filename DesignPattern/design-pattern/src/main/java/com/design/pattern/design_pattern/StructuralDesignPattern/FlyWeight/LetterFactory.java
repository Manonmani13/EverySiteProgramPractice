package com.design.pattern.design_pattern.StructuralDesignPattern.FlyWeight;

public class LetterFactory {
    static Letter getLetter(char c) {
        return new Letter(c);
    }
}
