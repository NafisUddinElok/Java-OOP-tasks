abstract class Employee {
    String name;
    int id;
    String department;

    Employee(String name, int id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }

    abstract double calculatePay(); // abstract method

    void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Department: " + department);
    }
}
class FullTimeEmployee extends Employee {
    double fixedSalary;

    FullTimeEmployee(String name, int id, String department, double fixedSalary) {
        super(name, id, department);
        this.fixedSalary = fixedSalary;
    }

    @Override
    double calculatePay() {
        return fixedSalary;
    }
}
class PartTimeEmployee extends Employee {
    double hourlyRate;
    int hoursWorked;

    PartTimeEmployee(String name, int id, String department,
                     double hourlyRate, int hoursWorked) {
        super(name, id, department);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    double calculatePay() {
        return hourlyRate * hoursWorked;
    }
}
class ContractEmployee extends Employee {
    String projectName;
    double contractAmount;

    ContractEmployee(String name, int id, String department,
                     String projectName, double contractAmount) {
        super(name, id, department);
        this.projectName = projectName;
        this.contractAmount = contractAmount;
    }

    @Override
    double calculatePay() {
        return contractAmount;
    }
}
public class p8a {
    public static void main(String[] args) {

        Employee e1 = new FullTimeEmployee("Nafis", 1, "SWE", 50000);
        Employee e2 = new PartTimeEmployee("Pranta", 2, "IT", 200, 50);
        Employee e3 = new ContractEmployee("Samia", 3, "SWE", "Project X", 80000);

        Employee[] employees = {e1, e2, e3};

        for (Employee e : employees) {
            e.display();
            System.out.println("Salary: " + e.calculatePay());
            System.out.println("----------------------");
        }
    }
}