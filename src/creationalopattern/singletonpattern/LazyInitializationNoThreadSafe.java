package creationalopattern.singletonpattern;

import java.util.Objects;

/*
 * This is a class to demostrate the Singleton Pattern
 * Singleton Pattern we have some Kategory (if we can say ) or way how we can create
 *
 *  1_ Eager Initialization
 *  2_ Lazy Initialization (No Thread Safe)   --OK--
 *  3_ Lazy Initialization ( Thread Safe)
 *  4_ Lazy Initialization (Double Locking)
 *  5_ Bill Phaogh
 *  6_ ENUM implementation
 *
 *  All Calls are in CreationalPatternMainMethod Class
 *
 * */
public class LazyInitializationNoThreadSafe {

    // here create the instanciate in start up which is static
    private static LazyInitializationNoThreadSafe INSTANCE_LAZY = null;

    private LazyInitializationNoThreadSafe() {
    }

    // Here we can make the instanciate when we need
    // this is no thread safe
    public static LazyInitializationNoThreadSafe getInstance() {
        if (Objects.isNull(INSTANCE_LAZY)) {
            INSTANCE_LAZY = new LazyInitializationNoThreadSafe();
        }
        return INSTANCE_LAZY;
    }


    // A example how we can call method or Properties if we have from Other Class
    public void printSomething() {
        System.out.println("Hello i'm a singleton Lazy instanciate (No Thread Safe)");
    }

}
