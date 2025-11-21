package Task;

class Employee extends Person {
    private final int employeeId;
    private final String jobTitle;
    private int salary;

    public Employee(String n, int age, int employeeId, String jobTitle, int salary) {
        super(n, age);
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public void raiseSalary(int p) {
        salary += salary * (p / 100.0);
        System.out.println("New increse salary :" + salary);
    }

    public void showDetails() {
        super.showDetails();
        System.out.println("Empoly id:" + employeeId + ",jobtitle:" + jobTitle + " salary:" + salary);
    }
}
