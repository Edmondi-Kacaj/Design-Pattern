package structuralpattern.bridgepattern.cartype;

import structuralpattern.bridgepattern.carcolor.CarColor;

/**
 * @author Edmond Kacaj
 * @date 10/12/2019
 * @YEAR 2019
 * @Project Name DesignPattern
 */
public class Volkswagen extends ModelCar{

    private String benzEngine;
    protected String carModel=" Volkswagen ".toUpperCase();
    protected String price="20 000 $";
    public Volkswagen(CarColor carColor,String engine) {
        super(carColor);
        this.carEngine=engine;
    }

    @Override
    public void printCar() {
        // some logic
        System.out.println(this.carModel +" {"+" Color="+this.carColor.setColor()+" || car-engine= "+this.carEngine+" || car-price= "+this.price+" }");    }
}
