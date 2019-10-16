package structuralpattern.facadepattern.ver2;

/**
 * @author Edmond Kacaj
 * @date 10/16/2019
 * @YEAR 2019
 * @Project Name DesignPattern
 */
public class FacadeClass {

    private Shapes circle;
    private Shapes rectangle;
    private Shapes triabgle;

    public FacadeClass() {
        this.circle = new Circle();
        this.rectangle = new Rectangle();
        this.triabgle = new Triangle();
    }

    public void printCircle() {
        this.circle.print();
    }

    public void printRectangle() {
        this.rectangle.print();
    }

    public void printTriangle() {
        this.triabgle.print();
    }

}
