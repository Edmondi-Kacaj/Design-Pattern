package behavioralpattern.mediatorpattern.taxi;

/**
 * @author Edmond Kacaj
 * @date 10/28/2019
 * @YEAR 2019
 * @Project Name DesignPattern
 */
public class TaxiDeutsch extends BaseDis {

    private TaxiInfo taxiInfo;

    public TaxiDeutsch(TaxiInfo taxiInfo, Dispatcher dispatcher) {
        super(taxiInfo, dispatcher);
        this.taxiInfo = taxiInfo;
        this.setTaxi("DEUTSCH");
    }


    @Override public void sendMessage() {
        String message = " " + this.taxiInfo.getFreeNow();
        System.out.println(" Deutsch taxi send Message ==> " + message);
        this.dispatcher.notifyTaxis(this, "Deutsch-- send Message ==> " + message);
    }

    @Override public void receiveMessage(String message) {
        System.out.println(" DEUTSCH taxi  receive message ===> " + message);
    }


}
