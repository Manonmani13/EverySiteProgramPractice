package com.design.pattern.design_pattern.Protype;

public abstract class Tree  implements Cloneable {
    private String type;
    

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public abstract void copy();

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    
}
