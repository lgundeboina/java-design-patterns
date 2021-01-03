package com.design_patterns.factory;

public abstract class Animal {
    protected int energyLevel;
    public Animal(){
        this.energyLevel = 0;
    }
    public abstract void feed();
    public abstract void play();
    public abstract void sleep();
    public abstract int getEnergyLevel();
    public abstract  void makesSound(String sound);
}
