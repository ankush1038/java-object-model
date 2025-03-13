// Main class to demonstrate composition and aggregation
public class UniversitySystem {

    public static void main(String[] args) {

        // Creating a university
        University university = new University("Chitkara University");

        // Adding departments
        university.addDepartments("Computer Science", "Mechanical Engineering");

        // Creating faculty members
        Faculty faculty1 = new Faculty("Dr. Sharma");
        Faculty faculty2 = new Faculty("Prof. Negi");

        // Associating faculty members with the university
        university.addFaculty(faculty1);
        university.addFaculty(faculty2);

        // Display university details
        university.displayUniversityDetails();
    }
}

// Class representing a University (Composition with Departments, Aggregation with Faculty)
class University {

    private String name;
    private Department department1;
    private Department department2;
    private Faculty faculty1;
    private Faculty faculty2;

    // Constructor
    public University(String name) {
        this.name = name;
    }

    // Method to add departments (Composition)
    public void addDepartments(String dept1, String dept2) {
        this.department1 = new Department(dept1);
        this.department2 = new Department(dept2);
    }

    // Method to add faculty (Aggregation)
    public void addFaculty(Faculty faculty) {
        if (faculty1 == null) {
            faculty1 = faculty;
        } else if (faculty2 == null) {
            faculty2 = faculty;
        }
    }

    // Method to display university details
    public void displayUniversityDetails() {
        System.out.println("University: " + name);

        if (department1 != null) {
            department1.displayDepartment();
        }

        if (department2 != null) {
            department2.displayDepartment();
        }

        if (faculty1 != null) {
            System.out.println("  Faculty: " + faculty1.getName());
        }

        if (faculty2 != null) {
            System.out.println("  Faculty: " + faculty2.getName());
        }
    }
}

// Class representing a Department (Composition - Exists only within University)
class Department {

    private String name;

    // Constructor
    public Department(String name) {
        this.name = name;
    }

    // Method to display department details
    public void displayDepartment() {
        System.out.println("  Department: " + name);
    }
}

// Class representing a Faculty (Aggregation - Can exist independently)
class Faculty {

    private String name;

    // Constructor
    public Faculty(String name) {
        this.name = name;
    }

    // Method to get faculty name
    public String getName() {
        return name;
    }
}
