package behavioralpattern.statepattern.states;

import behavioralpattern.statepattern.AlertState;
import behavioralpattern.statepattern.AlertStateContext;

/**
 * @author Edmond Kacaj
 * @date 11/5/2019
 * @YEAR 2019
 * @Project Name DesignPattern
 */
public class RingState implements AlertState {

    @Override public void alert(AlertStateContext alertStateContext) {
        System.out.println("Mobile is set to Ring State");
    }

    @Override public void alertTest(AlertStateContext alertStateContext) {
        System.out.println(" LaLaLaLaLaLaLalA ......");
    }
}
