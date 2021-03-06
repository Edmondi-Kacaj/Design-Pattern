package structuralpattern.decoratorpattern;

/**
 * @author Edmond Kacaj
 * @date 10/14/2019
 * @YEAR 2019
 * @Project Name DesignPattern
 */
public abstract class CarDecorator implements CarPrice {

    protected CarPrice carPrice;

    public CarDecorator(CarPrice carP) {
        this.carPrice = carP;
    }


}
