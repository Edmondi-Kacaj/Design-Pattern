package behavioralpattern.iteratordessignpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Edmond Kacaj
 * @date 10/25/2019
 * @YEAR 2019
 * @Project Name DesignPattern
 */
public class Company implements ICompany {

    private List animalList;

    public Company() {
        this.animalList = new ArrayList();
    }

    @Override public List getEmployees() {
        return this.animalList;
    }

    @Override public void addEmployee(Employee employee) {
        this.animalList.add(employee);
    }

    @Override public void addEmployees(List<Employee> employees) {
        this.animalList.addAll(employees);
    }

    @Override public void removeEmployee(Employee employee) {
        this.animalList.remove(employee);
    }

    @Override public Iterator createIterator(String sector) {
        if (sector.toLowerCase().equals("it")) {
            return new ItIterator(this.animalList);
        } else if (sector.toLowerCase().equals("pm")) {
            return new PmIterator(this.animalList);
        }
        return null;
    }
}
