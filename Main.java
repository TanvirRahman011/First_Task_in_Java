package Task;

public class Main {
    public static void main(String[] args) {


        Person p1 = new Person("Nahiyan", 16);
        int personId = PersonDAO.savePerson(p1);


        Customer c1 = new Customer("Tuhin", 16, 101, 10);
        int customerPersonId = PersonDAO.savePerson(c1);
        CustomerDAO.saveCustomer(c1, customerPersonId);


        Employee e1 = new Employee("Rana", 25, 201, "Developer", 50000);
        int employeePersonId = PersonDAO.savePerson(e1);
        EmployeeDAO.saveEmployee(e1, employeePersonId);


        p1.showDetails();
        System.out.println();
        c1.showDetails();
        System.out.println();
        e1.showDetails();
    }
}