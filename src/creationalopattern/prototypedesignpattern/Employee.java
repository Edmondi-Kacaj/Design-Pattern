package creationalopattern.prototypedesignpattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Prototype Design Pattern
 * <p>
 * Prototype pattern is used when the Object creation is a costly affair and requires
 * a lot of time and resources and you have a similar object already existing.
 * So this pattern provides a mechanism to copy the original object to a new object
 * and then modify it according to our needs
 *
 * @author Edmond Kacaj
 * @date 10/11/2019
 * @YEAR 2019
 * @Project Name DessignPattern
 * <p>
 * here we have a class which get all employees Name which implement Cloneable
 */
public class Employee implements Cloneable {

    private List<String> employees;

    public Employee(List<String> employees) {
        if (Objects.nonNull(employees))
            this.employees = employees;
    }

    public void addEmployee(String employee) {
        this.employees.add(employee);
    }

    @Override public String toString() {
        return "Employee{" + "employees=" + employees + '}';
    }

    @Override protected Employee clone() {
        List<String> tempEmployes = new ArrayList<>();
        this.employees.forEach(employee -> tempEmployes.add(employee));
        return new Employee(tempEmployes);
    }
}
