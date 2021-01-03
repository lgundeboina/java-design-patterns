package com.design_patterns.abstract_factory;

public class BabyFactory extends Factory{

    @Override
    public Animal getAnimalInstance(String animal){
        try {
            switch (animal.toLowerCase()) {
                case "tiger": return new BabyTiger();
                case "monkey": return new BabyMonkey();
                default: return null;
            }
        }catch(Exception e){
            System.out.println("Error while returning animal Type,"+e.toString());
            return null;
        }
    }

}
