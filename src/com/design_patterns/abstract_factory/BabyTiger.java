package com.design_patterns.abstract_factory;

public class BabyTiger extends Animal {
    @Override
    public void feed() {
        this.energyLevel += 4;
    }

    @Override
    public void play() {
        this.energyLevel -= 2;
    }

    @Override
    public void sleep() {
        this.energyLevel += 1;
    }

    @Override
    public int getEnergyLevel() {
        return this.energyLevel;
    }

    @Override
    public String makesSound() {
        return "Baby-Grrrrr";
    }
}
