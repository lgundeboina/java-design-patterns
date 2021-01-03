package com.design_patterns.prototype;

public class Tiger extends Animal{

    public Tiger(){
        System.out.println("Created an object");
    }

    @Override
    public Animal makeCopy() {
        Tiger tigerCloneObject = null;
        try {
            tigerCloneObject = (Tiger) clone();
            System.out.println("Cloned an object");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return  tigerCloneObject;
    }
}
