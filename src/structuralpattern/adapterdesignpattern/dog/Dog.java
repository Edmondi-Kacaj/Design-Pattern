package structuralpattern.adapterdesignpattern.dog;

/**
 * @author Edmond Kacaj
 * @date 10/12/2019
 * @YEAR 2019
 * @Project Name DesignPattern
 */
public class Dog implements IDog {
    @Override
    public void walk() {
        System.out.println(" Dogs run  ");
    }

    @Override
    public void barks() {
        System.out.println(" Dogs barks ");
    }
}
