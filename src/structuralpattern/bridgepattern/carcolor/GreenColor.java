package structuralpattern.bridgepattern.carcolor;

/**
 * @author Edmond Kacaj
 * @date 10/12/2019
 * @YEAR 2019
 * @Project Name DesignPattern
 */
public class GreenColor implements CarColor {

    public GreenColor() {
    }

    @Override
    public String setColor() {
        return " Green Color";
    }
}
