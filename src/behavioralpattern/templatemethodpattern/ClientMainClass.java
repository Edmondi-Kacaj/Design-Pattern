package behavioralpattern.templatemethodpattern;

import behavioralpattern.templatemethodpattern.products.BreadMaker;
import behavioralpattern.templatemethodpattern.products.PizzaMaker;
import behavioralpattern.templatemethodpattern.skeleton.FoodMaker;

/**
 * @author Edmond Kacaj
 * @date 11/5/2019
 * @YEAR 2019
 * @Project Name DesignPattern
 */
public class ClientMainClass {
    public static void main(String[] args) {
        // we want to make some bread
        FoodMaker breadMaker = new BreadMaker();
        breadMaker.make();
        System.out.println("===========================================================");
        // we want to make a pizza
        FoodMaker pizzaMaker = new PizzaMaker();
        pizzaMaker.make();

    }
}
