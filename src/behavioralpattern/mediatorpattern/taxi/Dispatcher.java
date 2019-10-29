package behavioralpattern.mediatorpattern.taxi;

/**
 * @author Edmond Kacaj
 * @date 10/28/2019
 * @YEAR 2019
 * @Project Name DesignPattern
 */
public interface Dispatcher {

    void notifyTaxis(BaseDis baseDis, String message);

    void registerTaxi(BaseDis baseDis);

}
