package CreationalPattern.SingletonPattern;

import java.util.Objects;

/*
 * This is a class to demostrate the Singleton Pattern
 * Singleton Pattern we have some Kategory (if we can say ) or way how we can create
 *
 *  1_ Eager Initialization
 *  2_ Lazy Initialization (No Thread Safe)
 *  3_ Lazy Initialization ( Thread Safe)   --OK--
 *  4_ Lazy Initialization (Double Locking)
 *  5_ Bill Phaogh
 *  6_ ENUM implementation
 *
 *  All Calls are in CreationalPatternMainMethod Class
 *
 * */
public class LazyInitializationThreadSafe {

    // here create the instanciate in start up which is static
    private static LazyInitializationThreadSafe INSTANCE_LAZY = null;

    private LazyInitializationThreadSafe() {
    }

    // Here we can make the instanciate when we need
    // this is  thread safe because he check for thread
    public static LazyInitializationThreadSafe getInstance() {
        if (Objects.isNull(INSTANCE_LAZY)) {
            synchronized (LazyInitializationThreadSafe.class) {
                INSTANCE_LAZY = new LazyInitializationThreadSafe();
            }

        }
        return INSTANCE_LAZY;
    }

    // A example how we can call method or Properties if we have from Other Class
    public void printSomething() {
        System.out.println("Hello i'm a singleton Lazy instanciate ( Thread Safe)");
    }

}
