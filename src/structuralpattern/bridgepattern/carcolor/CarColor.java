package structuralpattern.bridgepattern.carcolor;

/**
 * @author Edmond Kacaj
 * @date 10/12/2019
 * @YEAR 2019
 * @Project Name DesignPattern
 * <p>
 * Create a interface for color of cars
 * this is independently from type of car , in bridge we say implementation is separated from abstraction
 */
public interface CarColor {
    String setColor();
}
