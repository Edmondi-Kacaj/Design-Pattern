package behavioralpattern.commandpattern.lights.livingroom;

import behavioralpattern.commandpattern.Command;
import behavioralpattern.commandpattern.lights.Light;

/**
 * @author Edmond Kacaj
 * @date 10/21/2019
 * @YEAR 2019
 * @Project Name DesignPattern
 */
public class LightOffLivingRoom implements Command {

    private Light light;

    public LightOffLivingRoom(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {

        this.light.off("Living Room ");
    }
}
