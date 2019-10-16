package structuralpattern.proxypattern.v1;

/**
 * @author Edmond Kacaj
 * @date 10/16/2019
 * @YEAR 2019
 * @Project Name DesignPattern
 */
public class RealInternet implements Internet {

    public RealInternet() {
    }

    @Override public void connectTo(String serverHost) {
        if (!serverHost.isEmpty())
            System.out.println(String.format(" Connection successful to ==> %s", serverHost));
    }
}
