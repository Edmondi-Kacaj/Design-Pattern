package behavioralpattern.mementopattern;

import java.util.ArrayList;

/**
 * @author Edmond Kacaj
 * @date 10/30/2019
 * @YEAR 2019
 * @Project Name DesignPattern
 *
 * the object that keeps track of multiple memento. Like maintaining savepoint.
 */
public class NotepadCareTaker {

    private ArrayList<MementoNotepad> notepads;
    private int currentState =-1;

    public NotepadCareTaker() {
        this.notepads=new ArrayList<>();
    }


    // add all notepad
    public void addNotepad(MementoNotepad mementoNotepad){
        this.notepads.add(mementoNotepad);
        this.currentState=this.notepads.size()-1;
    }

    public MementoNotepad undo(){
        if (this.currentState<=0){
            // we can't leave to go less than 0
            this.currentState=0;
            return getMemento(this.currentState);
        }
        this.currentState--;
        return getMemento(this.currentState);
    }


    public  MementoNotepad rendo(){
        if (this.currentState>=this.notepads.size()){
            this.currentState=this.notepads.size()-1;
            return getMemento(this.currentState);
        }

        this.currentState++;
        return getMemento(this.currentState);

    }


   public MementoNotepad getMemento(int index){
        return this.notepads.get(index);
   }


}
