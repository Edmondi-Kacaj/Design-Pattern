package structuralpattern.compositepattern;

/**
 * @author Edmond Kacaj
 * @date 10/12/2019
 * @YEAR 2019
 * @Project Name DesignPattern
 */
public class BrainStormSolutionHannover implements IBrainStormSolution {

    private String employeeName;
    private String position;

    public BrainStormSolutionHannover(String employeeName, String position) {
        this.employeeName = employeeName;
        this.position = position;
    }

    @Override public void printEmployee() {
        System.out.println(
            "Hannover [ Name=" + this.employeeName + " || position=" + this.position + " ]");
    }
}
