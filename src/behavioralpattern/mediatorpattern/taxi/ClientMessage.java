package behavioralpattern.mediatorpattern.taxi;

/**
 * @author Edmond Kacaj
 * @date 10/28/2019
 * @YEAR 2019
 * @Project Name DesignPattern
 */
public class ClientMessage extends BaseDis {

    public ClientMessage(TaxiInfo taxiInfo, Dispatcher dispatcher) {
        super(taxiInfo, dispatcher);
        this.setTaxi("CLIENT");
    }


    @Override public void sendMessage() {
        String message = "I want a taxi in this location : Abc 23 A, House 1  ";
        System.out.println(" Client send Message ==> " + message);
        this.dispatcher.notifyTaxis(this, "Client-- send Message ==> " + message);
    }

    @Override public void receiveMessage(String message) {
        System.out.println(" CLIENT receive message ===> " + message);
    }
}
