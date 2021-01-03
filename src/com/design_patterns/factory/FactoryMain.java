package com.design_patterns.factory;

/**
 * @author LGundeboina
 */
public class FactoryMain {
    public static void main(String[] args){

        /**
         * Create a factory class with public method which accepts string as an argument.
         * Implement method to return new Instance of object based on argument value.
         */

        Factory animalFactory = new Factory();

        Animal tiger = animalFactory.getAnimalInstance("tiger");
        Animal monkey = animalFactory.getAnimalInstance("monkey");

        tiger.feed();
        monkey.feed();

        System.out.println("Tiger Energy Level: " + tiger.getEnergyLevel());
        System.out.println("Monkey Energy Level: " + monkey.getEnergyLevel());

        tiger.play();
        monkey.play();

        System.out.println("Tiger Energy Level: " + tiger.getEnergyLevel());
        System.out.println("Monkey Energy Level: " + monkey.getEnergyLevel());

    }


}
