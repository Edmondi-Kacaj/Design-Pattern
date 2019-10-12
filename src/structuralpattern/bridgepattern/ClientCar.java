package structuralpattern.bridgepattern;

import structuralpattern.bridgepattern.carcolor.BlackColor;
import structuralpattern.bridgepattern.carcolor.CarColor;
import structuralpattern.bridgepattern.carcolor.RedColor;
import structuralpattern.bridgepattern.cartype.Audi;
import structuralpattern.bridgepattern.cartype.Benz;
import structuralpattern.bridgepattern.cartype.ModelCar;

/**
 * @author Edmond Kacaj
 * @date 10/12/2019
 * @YEAR 2019
 * @Project Name DesignPattern
 */
public class ClientCar {

    public static void main(String[] args) {

        // create color for our car
        CarColor benzColor=new RedColor();
        CarColor audiColor=new BlackColor();

        // Let's get benz
        ModelCar benz=new Benz(benzColor,"Diesel");
        System.out.println("-------- BENZ ---------------");
        benz.printCar();
        System.out.println("------------------------------");
        System.out.println("-------- BENZ CHANGE COLOR ---------------");
        benz.setCarColor(audiColor);
        benz.printCar();
        System.out.println("------------------------------");


        // Let's get audi
        ModelCar audi=new Audi(audiColor,"Diesel");
        System.out.println("-------- AUDI ---------------");
        audi.printCar();
        System.out.println("------------------------------");
        System.out.println("-------- AUDI CHANGE COLOR ---------------");
        audi.setCarColor(benzColor);
        audi.printCar();
        System.out.println("------------------------------");
    }

}
