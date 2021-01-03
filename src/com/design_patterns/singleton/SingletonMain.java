package com.design_patterns.singleton;

/**
 * @author LGundeboina
 */
public class SingletonMain {

    public static void main(String[] args){
        /**
         * Single instance of an object across application, so, change in any object instance will change value in other instances.
         */
        SingletonObject obj1 = SingletonObject.getSingletonObject();
        SingletonObject obj2 = SingletonObject.getSingletonObject();

        System.out.println("Obj1 Count: "+obj1.getCount()); //0
        System.out.println("Obj2 Count: "+obj2.getCount()); //0

        obj1.setCount(100);

        System.out.println("Obj1 Count: "+obj1.getCount()); //100
        System.out.println("Obj2 Count: "+obj2.getCount()); //100

    }
}
