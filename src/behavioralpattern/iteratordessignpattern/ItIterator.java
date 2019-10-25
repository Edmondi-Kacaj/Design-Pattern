package behavioralpattern.iteratordessignpattern;

import java.util.List;

/**
 * @author Edmond Kacaj
 * @date 10/25/2019
 * @YEAR 2019
 * @Project Name DesignPattern
 */
public class ItIterator implements Iterator {
    private List<Employee> employees;
    private int position;

    public ItIterator(List employees) {
        this.employees = employees;
    }

    @Override public Employee firstEmployee() {
        for (Employee employee : this.employees) {
            if (employee.getSector().toLowerCase().equals("it")) {
                return employee;
            }
        }
        return null;
    }

    @Override public Employee lastEmployee() {

        for (int i = this.employees.size(); i > 0; i--) {
            if (this.employees.get(i).getSector().toLowerCase().equals("it")) {
                return this.employees.get(i);
            }
        }

        return null;
    }

    @Override public Employee currentEmployee() {
        if (this.position < this.employees.size() && this.employees.get(position).getSector()
            .toLowerCase().equals("it")) {
            return this.employees.get(position);
        }
        return null;
    }

    @Override public boolean isLast() {
        for (int i = this.position; i < this.employees.size(); i++) {
            if ("it".equals(this.employees.get(i).getSector().toLowerCase())) {
                return false;
            }
        }
        return true;
    }

    @Override public Employee forEachEmployee() {
        return null;
    }

    @Override public Employee NextEmployee() {
        Employee nextEmployee = null;
        for (; position < employees.size(); position++) {
            if (this.employees.get(position).getSector().toLowerCase().equals("it")) {
                nextEmployee = this.employees.get(position);
                position++;
                break;
            }
        }
        return nextEmployee;
    }
}
