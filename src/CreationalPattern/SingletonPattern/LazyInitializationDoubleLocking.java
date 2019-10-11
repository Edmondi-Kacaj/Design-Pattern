package CreationalPattern.SingletonPattern;

import java.util.Objects;

/*
 * This is a class to demostrate the Singleton Pattern
 * Singleton Pattern we have some Kategory (if we can say ) or way how we can create
 *
 *  1_ Eager Initialization
 *  2_ Lazy Initialization (No Thread Safe)
 *  3_ Lazy Initialization ( Thread Safe)
 *  4_ Lazy Initialization (Double Locking)    --OK--
 *  5_ Bill Phaogh
 *  6_ ENUM implementation
 *
 *  All Calls are in CreationalPatternMainMethod Class
 *
 * */
public class LazyInitializationDoubleLocking {

    // here create the instanciate in start up which is static
    private static LazyInitializationDoubleLocking INSTANCE_LAZY = null;

    private LazyInitializationDoubleLocking() {
    }

    // Here we can make the instanciate when we need
    public static LazyInitializationDoubleLocking getInstance() {
        if (Objects.isNull(INSTANCE_LAZY)) {
            synchronized (LazyInitializationDoubleLocking.class) {
                if (Objects.isNull(INSTANCE_LAZY)) {
                    INSTANCE_LAZY = new LazyInitializationDoubleLocking();
                }
            }

        }
        return INSTANCE_LAZY;
    }

    // A example how we can call method or Properties if we have from Other Class
    public void printSomething() {
        System.out.println("Hello i'm a singleton Lazy instanciate ( Double Locking)");
    }

}
