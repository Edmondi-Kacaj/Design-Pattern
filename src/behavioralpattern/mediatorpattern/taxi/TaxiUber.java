package behavioralpattern.mediatorpattern.taxi;

/**
 * @author Edmond Kacaj
 * @date 10/28/2019
 * @YEAR 2019
 * @Project Name DesignPattern
 */
public class TaxiUber extends BaseDis {

    private TaxiInfo taxiInfo;

    public TaxiUber(TaxiInfo taxiInfo, Dispatcher dispatcher) {
        super(taxiInfo, dispatcher);
        this.taxiInfo = taxiInfo;
        this.setTaxi("UBER");

    }


    @Override public void sendMessage() {
        String message = " " + this.taxiInfo.getFreeNow();
        System.out.println(" Uber taxi send Message ==> " + message);
        this.dispatcher.notifyTaxis(this, "Uber-- taxi send Message ==> " + message);
    }

    @Override public void receiveMessage(String message) {
        System.out.println(" UBER taxi receive message ===> " + message);
    }


}
