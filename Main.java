package Task;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Tanvir", 22);
        person1.showDetails();

        System.out.println("Employe everything details ");
        Employee Employee1 = new Employee("Jamal", 22, 1000, "Software engineer", 60000);
        Employee1.showDetails();
        Employee1.raiseSalary(10);
        System.out.println("Customer details");
        Customer customer1 = new Customer("Lamin Yamal", 18, 1001, 15);
        customer1.showDetails();
        System.out.println("Discount Price:" + customer1.getDiscountPric(100));

    }
}
