package behavioralpattern.mediatorpattern.taxi;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Edmond Kacaj
 * @date 10/28/2019
 * @YEAR 2019
 * @Project Name DesignPattern
 */
public class ConcreteDispatcher implements Dispatcher {

    private Map<String, BaseDis> regCompMap = new HashMap<>();

    @Override public void notifyTaxis(BaseDis baseDis, String message) {
        String senderName = baseDis.getTaxi();
        reactOnMessage(message);
    }

    private void reactOnMessage(String message) {
        System.out.println("Dispatcher send message to all system");
        for (Map.Entry<String, BaseDis> all : regCompMap.entrySet()) {
            if (!all.getKey().equals(message.split("--")[0].toUpperCase())) {
                all.getValue().receiveMessage(message);
            }
        }
    }


    @Override public void registerTaxi(BaseDis baseDis) {
        this.regCompMap.put(baseDis.getTaxi(), baseDis);
    }
}
