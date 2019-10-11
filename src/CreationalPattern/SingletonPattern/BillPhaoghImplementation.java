package CreationalPattern.SingletonPattern;

/*
 * This is a class to demostrate the Singleton Pattern
 * Singleton Pattern we have some Kategory (if we can say ) or way how we can create
 *
 *  1_ Eager Initialization
 *  2_ Lazy Initialization (No Thread Safe)
 *  3_ Lazy Initialization ( Thread Safe)
 *  4_ Lazy Initialization (Double Locking)
 *  5_ Bill Phaogh   --OK--
 *  6_ ENUM implementation
 *
 *  All Calls are in CreationalPatternMainMethod Class
 *
 * */
public class BillPhaoghImplementation {

    private BillPhaoghImplementation() {
    }

    // here create the instanciate in start up which is static

    // Here we can make the instanciate when we need
    public static BillPhaoghImplementation getInstance() {
        return SingletonHolder.INSTANCE_EAGER;
    }

    // A example how we can call method or Properties if we have from Other Class
    public void printSomething() {
        System.out.println("Hello i'm a singleton Bill Phaogh Implementation");
    }


    // create a staitc class to make possibel to create the instance
    private static class SingletonHolder {
        private static BillPhaoghImplementation INSTANCE_EAGER = new BillPhaoghImplementation();
    }

}
