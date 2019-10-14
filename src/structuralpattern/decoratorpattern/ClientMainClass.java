package structuralpattern.decoratorpattern;

import structuralpattern.decoratorpattern.addspecification.FullOptionsPrice;
import structuralpattern.decoratorpattern.addspecification.MoreThan100KmPrice;
import structuralpattern.decoratorpattern.addspecification.ZeroKMPrice;
import structuralpattern.decoratorpattern.basecar.AudiBasePrice;
import structuralpattern.decoratorpattern.basecar.BenzBasePrice;

/**
 * @author Edmond Kacaj
 * @date 10/14/2019
 * @YEAR 2019
 * @Project Name DesignPattern
 * <p>
 * Decorator is a structural Pattern , Decorator pattern is used to add new functionality to an existing object without changing its structure.
 * <p>
 * Let's take a example let's say we want to make a program for car selling
 * and we have only some car bases but for example we have ,
 * benz=10.000$ base {
 * if we want benz full option we add 3000 more ,
 * if we want with 0 KM we add 5000$ more,
 * if we want with 100KM -4000$ less
 * <p>
 * }
 * so for every specification we need to add a price, and that we need to make in Run-Time and without change the Behavior of others Class
 * so we use the Decorator Pattern
 */
public class ClientMainClass {

    public static void main(String[] args) {

        // for Benz i want with 0 km , and full option

        System.out.println("============== Base Price ===================");
        System.out.println();
        CarPrice priceOfCar = new BenzBasePrice("10.000 $");
        priceOfCar.getPrice(); // base price
        System.out.println("================= Full Option ================");
        System.out.println();
        CarPrice priceCarFullOption = new FullOptionsPrice(priceOfCar);
        priceCarFullOption.getPrice(); // base + full option
        System.out.println("================== Full Option and 0 km=============");
        System.out.println();
        CarPrice priceWithFullOptionAnd0km = new ZeroKMPrice(priceCarFullOption);
        priceWithFullOptionAnd0km.getPrice();


        // for Audi i want with >100 km , and not full option

        System.out.println("================== base price with more than 100 km=============");
        System.out.println();
        CarPrice audiPrice = new MoreThan100KmPrice(new AudiBasePrice("20.000 $ "));
        audiPrice.getPrice();



    }

}
