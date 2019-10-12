package structuralpattern.bridgepattern.cartype;

import structuralpattern.bridgepattern.carcolor.CarColor;

/**
 * @author Edmond Kacaj
 * @date 10/12/2019
 * @YEAR 2019
 * @Project Name DesignPattern
 */
public class Benz extends ModelCar {

    protected String carModel = " BENZ ";
    protected String price = "50 000 $";

    public Benz(CarColor carColor, String engine) {
        super(carColor);
        this.carEngine = engine;
    }

    @Override public void printCar() {
        // some logic
        System.out.println(
            this.carModel + " {" + " Color=" + this.carColor.setColor() + " || car-engine= "
                + this.carEngine + " || car-price= " + this.price + " }");
    }
}
