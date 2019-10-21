package behavioralpattern.commandpattern.devices;

/**
 * @author Edmond Kacaj
 * @date 10/21/2019
 * @YEAR 2019
 * @Project Name DesignPattern
 */
public class TvClass {

    public void turnOnTv(){
        System.out.println(" Tv is turn On ");
    }

    public void turnOfTv(){
        System.out.println(" Tv is turn Off ");
    }

    public void turnChangeCanalUpTv(){
        System.out.println(" Canal has change  +1 Up ");
    }


    public void turnChangeCanalDownTv(){
        System.out.println(" Canal has change  +1 Down ");
    }

}
