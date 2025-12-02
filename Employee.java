package Task;

public class Employee extends Person {
    private final int employeeId;
    private final String jobTitle;
    private int salary;

    public Employee(String name, int age, int employeeId, String jobTitle, int salary) {
        super(name, age);
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public int getEmployeeId() { return employeeId; }
    public String getJobTitle() { return jobTitle; }
    public int getSalary() { return salary; }

    public void raiseSalary(int percent) {
        salary += salary * percent / 100.0;
        System.out.println("New salary after increase: " + salary);
    }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Employee ID: " + employeeId + ", Job Title: " + jobTitle + ", Salary: " + salary);
    }
}
