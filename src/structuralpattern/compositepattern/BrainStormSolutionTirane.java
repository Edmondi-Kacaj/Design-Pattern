package structuralpattern.compositepattern;

/**
 * @author Edmond Kacaj
 * @date 10/12/2019
 * @YEAR 2019
 * @Project Name DesignPattern
 */
public class BrainStormSolutionTirane implements IBrainStormSolution {

    private String employeeName;
    private String position;

    public BrainStormSolutionTirane(String employeeName, String position) {
        this.employeeName = employeeName;
        this.position = position;
    }

    @Override public void printEmployee() {
        System.out
            .println("Tirane [ Name=" + this.employeeName + " || position=" + this.position + " ]");
    }
}
