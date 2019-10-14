package structuralpattern.decoratorpattern.basecar;

import structuralpattern.decoratorpattern.CarPrice;

/**
 * @author Edmond Kacaj
 * @date 10/14/2019
 * @YEAR 2019
 * @Project Name DesignPattern
 */
public class BenzBasePrice implements CarPrice {

    private String basePrice;

    public BenzBasePrice(String price) {
        this.basePrice = price;
    }

    @Override public void getPrice() {
        System.out
            .println(String.format(" You choose Benz with base price =%s%n  ", this.basePrice));
    }
}
