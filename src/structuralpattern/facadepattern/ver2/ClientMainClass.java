package structuralpattern.facadepattern.ver2;

/**
 * @author Edmond Kacaj
 * @date 10/16/2019
 * @YEAR 2019
 * @Project Name DesignPattern
 *
 *  Facade Pattern is a structural pattern and is used when we have a complex system and we need for client
 *  to make it easy, so we hide the complexity from client and give them a simple way to interact with system
 *  so we create a class call Facade with a simplify code.
 */
public class ClientMainClass {

    public static void main(String[] args) {
        FacadeClass shapes = new FacadeClass();

        shapes.printCircle();
        shapes.printRectangle();
        shapes.printTriangle();
    }

}
