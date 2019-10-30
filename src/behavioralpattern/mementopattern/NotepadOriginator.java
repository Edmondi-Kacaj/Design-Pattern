package behavioralpattern.mementopattern;

/**
 * @author Edmond Kacaj
 * @date 10/30/2019
 * @YEAR 2019
 * @Project Name DesignPattern
 *
 * the object for which the state is to be saved. It creates the memento and uses it in future to undo.
 */
public class NotepadOriginator {

    // text to write is the input
    private String textToWrite;

    public NotepadOriginator() {
    }

    public String getTextToWrite() {
        return textToWrite;
    }

    public void setTextToWrite(String textToWrite) {
        this.textToWrite = textToWrite;
    }

    public MementoNotepad save(){
        return new MementoNotepad(this.textToWrite);
    }

    public void restore(MementoNotepad mementoNotepad){
        this.textToWrite=mementoNotepad.getState();
    }


}
