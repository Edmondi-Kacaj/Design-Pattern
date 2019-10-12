package structuralpattern.compositepattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Edmond Kacaj
 * @date 10/12/2019
 * @YEAR 2019
 * @Project Name DesignPattern
 */
public class BrainStormSolutionHead implements IBrainStormSolution {

    private List<IBrainStormSolution> iBrainStormSolutions = new ArrayList<IBrainStormSolution>();

    public BrainStormSolutionHead() {
    }

    @Override public void printEmployee() {
        iBrainStormSolutions.forEach(IBrainStormSolution::printEmployee);
    }

    public void addEmployee(IBrainStormSolution ibss) {
        this.iBrainStormSolutions.add(ibss);
    }

    public void removeEmployee(IBrainStormSolution ibss) {
        this.iBrainStormSolutions.remove(ibss);
    }

    public void clearAll() {
        System.out.println("You fire all employees in all branches");
        this.iBrainStormSolutions.clear();
    }
}
