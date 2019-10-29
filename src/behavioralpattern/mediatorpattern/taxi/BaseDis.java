package behavioralpattern.mediatorpattern.taxi;

/**
 * @author Edmond Kacaj
 * @date 10/28/2019
 * @YEAR 2019
 * @Project Name DesignPattern
 */
public abstract class BaseDis {

    protected Dispatcher dispatcher;
    private TaxiInfo taxiInfo;
    private String taxi;

    public BaseDis(TaxiInfo tInfo, Dispatcher dSp) {
        this.taxiInfo = tInfo;
        this.dispatcher = dSp;
    }


    public abstract void sendMessage();

    public abstract void receiveMessage(String taxiInfo);

    public TaxiInfo getTaxiInfo() {
        return taxiInfo;
    }

    public String getTaxi() {
        return taxi;
    }

    public void setTaxi(String taxi) {
        this.taxi = taxi;
    }
}
