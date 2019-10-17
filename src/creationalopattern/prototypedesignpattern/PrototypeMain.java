package creationalopattern.prototypedesignpattern;

import java.util.Arrays;

import static java.lang.System.out;

/**
 * @author Edmond Kacaj
 * @date 10/11/2019
 * @YEAR 2019
 * @Project Name DessignPattern
 */
public class PrototypeMain {

    public static void main(String[] args) {

        // Let's create first Object
        Employee employee = new Employee(Arrays.asList("William ", "Joe"));
        out.println(employee.toString());

        // now lets create second objet but with clone
        Employee employee1 = employee.clone();
        employee1.addEmployee("Smith");
        out.println(employee1.toString());


    }
}
