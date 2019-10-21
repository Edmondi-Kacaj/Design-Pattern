package behavioralpattern.commandpattern;

/**
 * @author Edmond Kacaj
 * @date 10/21/2019
 * @YEAR 2019
 * @Project Name DesignPattern
 */
public class RemoteControl {

    private Command command;

    public RemoteControl() {
    }

    public void setDevice(Command command) {
        this.command = command;
    }

    public void pressPowerButton(){
        this.command.execute();
    }


    public void pressUpButton(){
        this.command.execute();
    }

}
