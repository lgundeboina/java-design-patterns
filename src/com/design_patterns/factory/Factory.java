package com.design_patterns.factory;

public class Factory {
    public Animal getAnimalInstance(String animal){
        try {
            switch (animal.toLowerCase()) {
                case "tiger": return new Tiger();
                case "monkey": return new Monkey();
                default: return null;
            }
        }catch(Exception e){
            System.out.println("Error while returning animal Type,"+e.toString());
            return null;
        }
    }
}
