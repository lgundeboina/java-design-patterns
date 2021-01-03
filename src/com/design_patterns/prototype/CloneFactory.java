package com.design_patterns.prototype;

public class CloneFactory {

    public Animal cloneAnimal(Animal animalToBeCloned){
        return  animalToBeCloned.makeCopy();
    }
}
