package com.design_patterns.prototype;

/**
 * @author LGundeboina
 */
public class PrototypeMain {

    public static void main(String[] args){
        /**
         * It creates a new object by cloning/copying another object during runtime.
         * From below, Tiger constructor gets called only once, even though we create second object.
         */
        Animal tiger = new Tiger();
        CloneFactory cloneFactory = new CloneFactory();
        Animal tiger2 = cloneFactory.cloneAnimal(tiger);

        System.out.println("Hash of Tiger: "+System.identityHashCode(System.identityHashCode(tiger)));
        System.out.println("Hash of Tiger2: "+System.identityHashCode(System.identityHashCode(tiger2)));
    }
}
