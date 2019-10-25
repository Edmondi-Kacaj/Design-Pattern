package behavioralpattern.iteratordessignpattern;

/**
 * @author Edmond Kacaj
 * @date 10/25/2019
 * @YEAR 2019
 * @Project Name DesignPattern
 * <p>
 * in this interface we have the basic command for iterator like *
 * <p>
 * first
 * next
 * isLast
 * correct
 * foreach
 * last
 */
public interface Iterator {

    Employee firstEmployee();

    Employee lastEmployee();

    Employee currentEmployee();

    boolean isLast();

    Employee forEachEmployee();

    Employee NextEmployee();

}
