package behavioralpattern.commandpattern.lights;

/**
 * @author Edmond Kacaj
 * @date 10/21/2019
 * @YEAR 2019
 * @Project Name DesignPattern
 */
public class Light {

    private String room;

    public Light(String room) {
        this.room = room;
    }

    public void on(String room){
        System.out.println(String.format(" The light in %s  has ben turn ON ",room));
    }

    public void off(String room){
        System.out.println(String.format(" The light in %s  has ben turn OFF ",room));
    }

}
