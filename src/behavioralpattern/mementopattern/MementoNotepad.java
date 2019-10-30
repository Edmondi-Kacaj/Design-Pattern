package behavioralpattern.mementopattern;

/**
 * @author Edmond Kacaj
 * @date 10/30/2019
 * @YEAR 2019
 * @Project Name DesignPattern
 *
 * Memento is just a pojo Class we need to reminder
 *
 */
public class MementoNotepad  {

    private String state;

    public MementoNotepad(String state) {
         this.state=state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
