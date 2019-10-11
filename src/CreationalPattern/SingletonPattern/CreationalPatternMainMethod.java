package CreationalPattern.SingletonPattern;

public class CreationalPatternMainMethod {

    public static void main(String[] args) {

        // Here we make the call for Eager initialization
        EagerInitialization.getInstance().printSomething();

        // Here we make the call for lazy initialization not thread safe
        LazyInitializationNoThreadSafe.getInstance().printSomething();

        // Here we make the call for lazy initialization  thread safe
        LazyInitializationThreadSafe.getInstance().printSomething();

        // Here we make the call for lazy initialization Double locking
        LazyInitializationDoubleLocking.getInstance().printSomething();


        // Here we make the call for lazy initialization Double locking
        BillPhaoghImplementation.getInstance().printSomething();

    }

}
