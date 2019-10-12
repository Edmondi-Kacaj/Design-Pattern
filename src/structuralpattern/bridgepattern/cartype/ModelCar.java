package structuralpattern.bridgepattern.cartype;

import structuralpattern.bridgepattern.carcolor.CarColor;

/**
 * @author Edmond Kacaj
 * @date 10/12/2019
 * @YEAR 2019
 * @Project Name DesignPattern
 */
public abstract class ModelCar {

    protected CarColor carColor;
    protected String carEngine;


    public ModelCar(CarColor carColor) {
        this.carColor = carColor;
    }

    public void setCarColor(CarColor carColor) {
        this.carColor = carColor;
    }

    abstract public void printCar();

}
