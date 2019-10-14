package structuralpattern.decoratorpattern.basecar;

import structuralpattern.decoratorpattern.CarPrice;

/**
 * @author Edmond Kacaj
 * @date 10/14/2019
 * @YEAR 2019
 * @Project Name DesignPattern
 */
public class AudiBasePrice implements CarPrice {

    private String basePrice;

    public AudiBasePrice(String price) {
        this.basePrice = price;
    }

    @Override public void getPrice() {
        System.out
            .println(String.format(" You choose Audi with base price =%s%n  ", this.basePrice));
    }
}
