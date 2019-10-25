package behavioralpattern.iteratordessignpattern;

/**
 * @author Edmond Kacaj
 * @date 10/25/2019
 * @YEAR 2019
 * @Project Name DesignPattern
 * <p>
 * Let's imagine we want to create a list of employees, and we have and also the category of sector the employees work.
 * So let's create a iterator Pattern,
 * we said the iterator pattern is a pattern part of behavior Pattern ,
 * and it's used for getting access to the elements of a collection object in sequential manner
 * without any need to know its underlying representation.
 * <p>
 * as iterator patter we can put List,Array,Map etc.
 */
public class ClientMainClass {

    public static void main(String[] args) {
        ICompany company = new Company();

        // add some employes to company
        company.addEmployee(new Employee("Edmond", "Kacaj", "IT"));
        company.addEmployee(new Employee("Ed", "Cacaj", "IT"));
        company.addEmployee(new Employee("Edmd", "Malaj", "IT"));
        company.addEmployee(new Employee("Edmo", "Nedaj", "IT"));
        company.addEmployee(new Employee("Ed", "Beba", "IT"));
        company.addEmployee(new Employee("Arsi", "Lum", "PM"));
        company.addEmployee(new Employee("Aln", "Aln", "PM"));
        company.addEmployee(new Employee("John", "Ca", "PM"));


        Iterator pmiterator = company.createIterator("PM");

        printData(pmiterator);

        System.out.println("-------------------------------------------------");
        Iterator ititerator = company.createIterator("IT");

        printData(ititerator);



    }

    private static void printData(Iterator pmiterator) {
        System.out.println(
            " First Employes ==> " + pmiterator.firstEmployee().getLastName() + "   " + pmiterator
                .firstEmployee().getSector());
        System.out.println(
            " Last Employes ==> " + pmiterator.firstEmployee().getLastName() + "   " + pmiterator
                .firstEmployee().getSector());
        while (pmiterator.isLast() == false) {
            System.out.println(" Emploee List " + pmiterator.NextEmployee().getName());
        }
    }


}
