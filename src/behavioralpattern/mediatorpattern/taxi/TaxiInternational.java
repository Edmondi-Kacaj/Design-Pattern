package behavioralpattern.mediatorpattern.taxi;

/**
 * @author Edmond Kacaj
 * @date 10/28/2019
 * @YEAR 2019
 * @Project Name DesignPattern
 */
public class TaxiInternational extends BaseDis {

    private TaxiInfo taxiInfo;

    public TaxiInternational(TaxiInfo taxiInfo, Dispatcher dispatcher) {
        super(taxiInfo, dispatcher);
        this.taxiInfo = taxiInfo;
        this.setTaxi("INTERNATIONAL");
    }


    @Override public void sendMessage() {
        String message =
            " " + this.taxiInfo.getFreeNow() + " in 2 min you have a taxi to this location ";
        System.out.println(" send Message ==> " + message);
        this.dispatcher.notifyTaxis(this, "International-- taxi send Message ==> " + message);
    }

    @Override public void receiveMessage(String message) {
        System.out.println(" INTERNATIONAL taxi receive message ===> " + message);
    }


}
