package com.design_patterns.abstract_factory;

/**
 * @author LGundeboina
 */
public class AbstractFactoryMain {
    public static void main(String[] args){

        /**
         * Abstract Factory -> Factory of Factories (Nested Factories)
         * Static method in Abstract Factory returns which Factory should instantiate based on argument value. Then, instantiated factory has getInstance method which returns new object type based on argument.
         */
        Factory parentFactory = AbstractFactory.getFactory(false);
        Factory bayFactory = AbstractFactory.getFactory(true);

        Animal parentTiger = parentFactory.getAnimalInstance("tiger");
        Animal babyTiger = bayFactory.getAnimalInstance("tiger");

        parentTiger.feed();
        babyTiger.feed();

        System.out.println("Tiger Energy Level: " + parentTiger.getEnergyLevel());
        System.out.println("Baby Tiger Energy Level: " + babyTiger.getEnergyLevel());

        parentTiger.play();
        babyTiger.play();

        System.out.println("Tiger Sounds: " + parentTiger.makesSound());
        System.out.println("Baby Tiger Sounds: " + babyTiger.makesSound());

    }


}
