package behavioralpattern.iteratordessignpattern;

/**
 * @author Edmond Kacaj
 * @date 10/25/2019
 * @YEAR 2019
 * @Project Name DesignPattern
 * <p>
 * Here we create the object we want to use
 */
public class Employee {
    private String name;
    private String lastName;
    private String sector;

    public Employee(String name, String lastName, String sector) {
        this.name = name;
        this.lastName = lastName;
        this.sector = sector;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSector() {
        return sector;
    }
}
