package structuralpattern.bridgepattern.carcolor;

/**
 * @author Edmond Kacaj
 * @date 10/12/2019
 * @YEAR 2019
 * @Project Name DesignPattern
 */
public class BlackColor implements CarColor {

    public BlackColor() {
    }

    @Override public String setColor() {
        return " Black Color";
    }
}
