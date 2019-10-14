package structuralpattern.decoratorpattern.addspecification;

import structuralpattern.decoratorpattern.CarDecorator;
import structuralpattern.decoratorpattern.CarPrice;

/**
 * @author Edmond Kacaj
 * @date 10/14/2019
 * @YEAR 2019
 * @Project Name DesignPattern
 */
public class ZeroKMPrice extends CarDecorator {

    private String price = "5.000 $ ";

    public ZeroKMPrice(CarPrice price) {
        super(price);
    }

    @Override public void getPrice() {
        this.carPrice.getPrice();
        System.out
            .println(String.format(" You choose  0 km ,  so price grow with =%s%n  ", this.price));

    }


}
