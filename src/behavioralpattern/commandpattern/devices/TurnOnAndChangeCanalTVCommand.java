package behavioralpattern.commandpattern.devices;

import behavioralpattern.commandpattern.Command;

/**
 * @author Edmond Kacaj
 * @date 10/21/2019
 * @YEAR 2019
 * @Project Name DesignPattern
 */
public class TurnOnAndChangeCanalTVCommand implements Command {

    private TvClass tvClass;

    public TurnOnAndChangeCanalTVCommand(TvClass tvClass) {
        this.tvClass = tvClass;
    }

    @Override public void execute() {
        this.tvClass.turnOfTv();
        this.tvClass.turnChangeCanalUpTv();
    }
}
