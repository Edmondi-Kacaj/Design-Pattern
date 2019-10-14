package structuralpattern.decoratorpattern.addspecification;

import structuralpattern.decoratorpattern.CarDecorator;
import structuralpattern.decoratorpattern.CarPrice;

/**
 * @author Edmond Kacaj
 * @date 10/14/2019
 * @YEAR 2019
 * @Project Name DesignPattern
 */
public class FullOptionsPrice extends CarDecorator {

    private String price = "3.000 $ ";

    public FullOptionsPrice(CarPrice price) {
        super(price);
    }

    @Override public void getPrice() {
        this.carPrice.getPrice();
        System.out
            .println(String.format(" You add full option so price grow with =%s%n  ", this.price));
    }

}
