package structuralpattern.facadepattern.ver2;

/**
 * @author Edmond Kacaj
 * @date 10/16/2019
 * @YEAR 2019
 * @Project Name DesignPattern
 */
public class ClientMainClass {

    public static void main(String[] args) {
        FacadeClass shapes = new FacadeClass();

        shapes.printCircle();
        shapes.printRectangle();
        shapes.printTriangle();
    }

}
