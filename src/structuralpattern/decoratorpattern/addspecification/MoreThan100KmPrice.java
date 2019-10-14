package structuralpattern.decoratorpattern.addspecification;

import structuralpattern.decoratorpattern.CarDecorator;
import structuralpattern.decoratorpattern.CarPrice;

/**
 * @author Edmond Kacaj
 * @date 10/14/2019
 * @YEAR 2019
 * @Project Name DesignPattern
 */
public class MoreThan100KmPrice extends CarDecorator {

    private String price = "4.000 $ ";

    public MoreThan100KmPrice(CarPrice price) {
        super(price);
    }

    @Override public void getPrice() {
        this.carPrice.getPrice();
        System.out.println(
            String.format(" You want with 100km or more so price reduce with =%s%n  ", this.price));
    }


}
