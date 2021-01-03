package com.design_patterns.abstract_factory;

public class AbstractFactory {
    public static Factory getFactory(Boolean isBaby){
        if(isBaby){
            return  new BabyFactory();
        }else{
            return new ParentFactory();
        }
    }
}
