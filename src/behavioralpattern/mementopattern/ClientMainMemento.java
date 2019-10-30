package behavioralpattern.mementopattern;

/**
 * @author Edmond Kacaj
 * @date 10/30/2019
 * @YEAR 2019
 * @Project Name DesignPattern
 * Let's create a simple Notepad editor this is only console application
 *
 *
 *
 */
public class ClientMainMemento {

    public static void main(String[] args) {

        // lets create notepad ( example: open notepad  )
        NotepadOriginator openpad=new NotepadOriginator();
        // create the memento
        NotepadCareTaker notepadMemento=new NotepadCareTaker();

        // lets write some text first text
        openpad.setTextToWrite("This is a first line ");
        notepadMemento.addNotepad(openpad.save());
        System.out.println(openpad.getTextToWrite());

        // lets write the second line
        openpad.setTextToWrite("This is the second  line ");
        notepadMemento.addNotepad(openpad.save());
        System.out.println(openpad.getTextToWrite());


        System.out.println("----- I want to back to first line with  CTRL-Z--------------");
        openpad.restore(notepadMemento.undo());
        System.out.println(openpad.getTextToWrite());

        System.out.println("----- I want to go again to the last modification  with  CTRL-Y-Z--------------");
        openpad.restore(notepadMemento.rendo());
        System.out.println(openpad.getTextToWrite());





    }

}
