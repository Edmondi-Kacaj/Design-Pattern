package behavioralpattern.statepattern;

import behavioralpattern.statepattern.states.RingState;

/**
 * @author Edmond Kacaj
 * @date 11/5/2019
 * @YEAR 2019
 * @Project Name DesignPattern
 */
public class AlertStateContext {

    private AlertState alertState;

    public AlertStateContext() {
        this.alertState = new RingState();
    }

    public void setAlertState(AlertState alertState) {
        this.alertState = alertState;
    }

    public void alert() {
        this.alertState.alert(this);
    }

    public void alertTest() {
        this.alertState.alertTest(this);
    }

}
