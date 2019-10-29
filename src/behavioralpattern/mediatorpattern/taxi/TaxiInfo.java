package behavioralpattern.mediatorpattern.taxi;

/**
 * @author Edmond Kacaj
 * @date 10/28/2019
 * @YEAR 2019
 * @Project Name DesignPattern
 */
public class TaxiInfo {

    private String name;
    private String freeNow;
    private boolean isClose;


    public TaxiInfo(String name, String freeNow, boolean isClose) {
        this.name = name;
        this.freeNow = freeNow;
        this.isClose = isClose;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFreeNow() {
        return freeNow;
    }

    public void setFreeNow(String freeNow) {
        this.freeNow = freeNow;
    }

    public boolean isClose() {
        return isClose;
    }

    public void setClose(boolean close) {
        isClose = close;
    }


}
