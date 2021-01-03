package com.design_patterns.singleton;

public class SingletonObject {
    private static SingletonObject singletonObject = new SingletonObject();
    private int count;
    private SingletonObject(){}

    public static SingletonObject getSingletonObject() {
        return singletonObject;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
