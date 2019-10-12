package structuralpattern.compositepattern;

/**
 * @author Edmond Kacaj
 * @date 10/12/2019
 * @YEAR 2019
 * @Project Name DesignPattern
 * <p>
 * Composite pattern is one of the Structural design patterns
 * and is used when we have to represent a part-whole hierarchy.
 * When we need to create a structure in a way that the objects in the structure have to be treated the same way,
 * we can apply the composite design pattern.
 * <p>
 * Let's think we have company which have some branch in other city, and we need to know how many employee we have
 * first create a interface
 * for each class we implement this interface (class is branch )
 * after we create a composite class to make possibility to count all employees we have
 * to add
 * to remove
 */
public class ClientMain {
    public static void main(String[] args) {

        // let's add some employees in Hannover
        IBrainStormSolution administratorHannover =
            new BrainStormSolutionHannover("Brik", "Administrator");
        IBrainStormSolution hrHannoer = new BrainStormSolutionHannover("Bimi", "HR");
        // let's add some in Berlin
        IBrainStormSolution analistBerlin = new BrainStormSolutionBerlin("Hans", "Analist");
        IBrainStormSolution itBerlin = new BrainStormSolutionBerlin("Beni", "IT ");

        BrainStormSolutionHead headOffice = new BrainStormSolutionHead();
        headOffice.addEmployee(administratorHannover);
        headOffice.addEmployee(hrHannoer);
        headOffice.addEmployee(analistBerlin);
        headOffice.addEmployee(itBerlin);

        // print info for employe in hannover
        administratorHannover.printEmployee();
        System.out.println("------------------------------------");
        // print all employees
        headOffice.printEmployee();

        System.out.println("-------- add Employes");
        headOffice.addEmployee(new BrainStormSolutionTirane("Arjan", "CTO"));
        headOffice.printEmployee();

        System.out.println("------- Remove Employes in Berlin");
        headOffice.removeEmployee(analistBerlin);
        headOffice.printEmployee();

        System.out.println("------ Fire All employees ");
        headOffice.clearAll();
        headOffice.printEmployee();

    }
}
