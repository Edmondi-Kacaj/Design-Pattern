package creationalopattern.singletonpattern;

/*
 * This is a class to demostrate the Singleton Pattern
 * Singleton Pattern we have some Kategory (if we can say ) or way how we can create
 *
 *  1_ Eager Initialization  --OK--
 *  2_ Lazy Initialization (No Thread Safe)
 *  3_ Lazy Initialization ( Thread Safe)
 *  4_ Lazy Initialization (Double Locking)
 *  5_ Bill Phaogh
 *  6_ ENUM implementation
 *
 *  All Calls are in CreationalPatternMainMethod Class
 *
 * */
public class EagerInitialization {

    // here create the instanciate in start up which is static
    private static EagerInitialization INSTANCE_EAGER = new EagerInitialization();

    private EagerInitialization() {
    }

    // Here we can make the instanciate when we need
    public static EagerInitialization getInstance() {
        return INSTANCE_EAGER;
    }


    // A example how we can call method or Properties if we have from Other Class
    public void printSomething() {
        System.out.println("Hello i'm a singleton Eager instanciate");
    }

}
