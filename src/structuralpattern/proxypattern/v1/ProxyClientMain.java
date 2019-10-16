package structuralpattern.proxypattern.v1;

/**
 * @author Edmond Kacaj
 * @date 10/16/2019
 * @YEAR 2019
 * @Project Name DesignPattern
 * <p>
 * Proxy pattern intent is to “Provide a surrogate or placeholder for another object to control access to it”.
 * The definition itself is very clear and proxy pattern is used when we want to provide controlled access of a functionality
 * <p>
 * <p>
 * <p>
 * <p>
 * A very simple real life scenario is our college internet,
 * which restricts few site access. The proxy first checks the host you are connecting to,
 * if it is not part of restricted site list, then it connects to the real internet
 */
public class ProxyClientMain {

    public static void main(String[] args) {

        // lets check the host, if we can connect or not

        Internet internet = new ProxyInternet();
        try {
            // host not Denied
            internet.connectTo("www.google.com");

            // host Denied
            internet.connectTo("www.abc.com");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}
