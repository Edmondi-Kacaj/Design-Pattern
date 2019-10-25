package behavioralpattern.iteratordessignpattern;

import java.util.List;

/**
 * @author Edmond Kacaj
 * @date 10/25/2019
 * @YEAR 2019
 * @Project Name DesignPattern
 * <p>
 * here we create a Interface call ICompany,
 * this interface is for basic command we need , like:
 * addEmployee
 * removeEmployee
 * getEmployee
 * createIterator  (this is another interface used for itarator command like next,isLastEmployee,currentEmployee)
 */
public interface ICompany {

    List getEmployees();

    void addEmployee(Employee employee);

    void addEmployees(List<Employee> employees);

    void removeEmployee(Employee employee);

    Iterator createIterator(String sector);


}
