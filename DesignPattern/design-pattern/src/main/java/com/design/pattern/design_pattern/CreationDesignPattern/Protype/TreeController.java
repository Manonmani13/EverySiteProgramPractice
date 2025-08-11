package com.design.pattern.design_pattern.Protype;

public class TreeController {
    public String createPlasticTree(){
        PlasticTree plasticTree = new PlasticTree();
        return "Created a " + plasticTree.getType();
    }

    public String createPineTree(){
        PineTree pineTree = new PineTree();
        return "Created a " + pineTree.getType();
    }
}
