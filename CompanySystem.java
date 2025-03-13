// Main class to demonstrate composition
public class CompanySystem {

    public static void main(String[] args) {

        // Creating a company object
        Company company = new Company("Capgemini");

        // Adding departments
        company.addDepartments("Engineering", "HR");

        // Adding employees to departments
        company.getDepartment1().addEmployees("Ankush", "Ansh");
        company.getDepartment2().addEmployees("Jashan", "Aditya");

        // Displaying company details
        company.displayCompany();
    }
}

// Class representing a Company
class Company {

    private String name;
    private Department department1;
    private Department department2;

    // Constructor
    public Company(String name) {
        this.name = name;
    }

    // Method to add departments
    public void addDepartments(String dept1, String dept2) {
        this.department1 = new Department(dept1);
        this.department2 = new Department(dept2);
    }

    // Getters for departments
    public Department getDepartment1() {
        return department1;
    }

    public Department getDepartment2() {
        return department2;
    }

    // Method to display company details
    public void displayCompany() {
        System.out.println("Company: " + name);

        if (department1 != null) {
            department1.displayDepartment();
        }

        if (department2 != null) {
            department2.displayDepartment();
        }
    }
}

// Class representing a Department (Composition - Exists only within Company)
class Department {

    private String name;
    private Employee employee1;
    private Employee employee2;

    // Constructor
    public Department(String name) {
        this.name = name;
    }

    // Method to add employees
    public void addEmployees(String emp1, String emp2) {
        this.employee1 = new Employee(emp1);
        this.employee2 = new Employee(emp2);
    }

    // Method to display department details
    public void displayDepartment() {
        System.out.println("  Department: " + name);

        if (employee1 != null) {
            employee1.displayEmployee();
        }

        if (employee2 != null) {
            employee2.displayEmployee();
        }
    }
}

// Class representing an Employee
class Employee {

    private String name;

    // Constructor
    public Employee(String name) {
        this.name = name;
    }

    // Method to display employee details
    public void displayEmployee() {
        System.out.println("    Employee: " + name);
    }
}
