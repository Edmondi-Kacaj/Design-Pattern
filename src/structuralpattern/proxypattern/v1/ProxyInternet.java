package structuralpattern.proxypattern.v1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Edmond Kacaj
 * @date 10/16/2019
 * @YEAR 2019
 * @Project Name DesignPattern
 */
public class ProxyInternet implements Internet {

    private Internet internetConnection;
    private List<String> serverDenid = new ArrayList<>();

    public ProxyInternet() {
        this.internetConnection = new RealInternet();
        this.serverDenid =
            Arrays.asList("www.aaaaa.com", "www.abc.com", "ww.cbb.com", "www.fff.com");

    }

    @Override public void connectTo(String serverHost) throws Exception {
        if (!serverHost.isEmpty()) {
            if (this.serverDenid.contains(serverHost)) {
                throw new Exception(String.format(" Access denied for ==> %s ", serverHost));
            } else {
                this.internetConnection.connectTo(serverHost);
            }
        }
    }
}
