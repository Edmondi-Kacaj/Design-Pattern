package behavioralpattern.statepattern;

import behavioralpattern.statepattern.states.RingAndVibrationState;
import behavioralpattern.statepattern.states.SilentState;
import behavioralpattern.statepattern.states.VibrationState;

/**
 * @author Edmond Kacaj
 * @date 11/5/2019
 * @YEAR 2019
 * @Project Name DesignPattern
 * <p>
 * Let's try to make a alert for Phone
 * type of alert will be Silent,Vibration,Ring,Ring and Silent
 * <p>
 * and client can activate the alert for his phone in base of State of alert
 */
public class ClientMainClass {

    public static void main(String[] args) {

        // default state is Ring
        AlertStateContext alertStateContext = new AlertStateContext();
        System.out.println("------------------ Ring ------------------ ");
        alertStateContext.alert();
        alertStateContext.alertTest();
        // let's change the state of alert to Silent
        alertStateContext.setAlertState(new SilentState());
        System.out.println("------------------ Silent ------------------ ");
        alertStateContext.alert();
        alertStateContext.alertTest();

        // let's change the state of alert to Vibration
        alertStateContext.setAlertState(new VibrationState());
        System.out.println("------------------ Vibration ------------------ ");
        alertStateContext.alert();
        alertStateContext.alertTest();

        // let's change the state of alert to Ring and Vibration
        alertStateContext.setAlertState(new RingAndVibrationState());
        System.out.println("------------------ Ring and Vibration ------------------ ");
        alertStateContext.alert();
        alertStateContext.alertTest();



    }

}
