// Main class to demonstrate association and aggregation
public class SchoolSystem {

    public static void main(String[] args) {

        // Creating a school
        School school = new School("DAV Public School");

        // Creating students
        Student student1 = new Student("Ankush");
        Student student2 = new Student("Ansh");

        // Adding students to the school
        school.addStudent(student1);
        school.addStudent(student2);

        // Creating courses
        Course course1 = new Course("Physics");
        Course course2 = new Course("Chemistry");

        // Enrolling students in courses
        student1.enrollInCourse(course1);
        student1.enrollInCourse(course2);
        student2.enrollInCourse(course1);

        // Display school details
        school.displaySchoolDetails();
    }
}

// Class representing a School (Aggregation - contains students)
class School {

    private String name;
    private Student student1;
    private Student student2;

    // Constructor
    public School(String name) {
        this.name = name;
    }

    // Method to add students
    public void addStudent(Student student) {
        if (student1 == null) {
            student1 = student;
        } else if (student2 == null) {
            student2 = student;
        }
    }

    // Method to display school details
    public void displaySchoolDetails() {
        System.out.println("School: " + name);

        if (student1 != null) {
            student1.displayStudentDetails();
        }

        if (student2 != null) {
            student2.displayStudentDetails();
        }
    }
}

// Class representing a Student (Association with Course)
class Student {

    private String name;
    private Course course1;
    private Course course2;

    // Constructor
    public Student(String name) {
        this.name = name;
    }

    // Method to enroll in courses
    public void enrollInCourse(Course course) {
        if (course1 == null) {
            course1 = course;
        } else if (course2 == null) {
            course2 = course;
        }

        course.addStudent(this);
    }

    // Method to display student details
    public void displayStudentDetails() {
        System.out.println("  Student: " + name);

        if (course1 != null) {
            System.out.println("    Enrolled in: " + course1.getName());
        }

        if (course2 != null) {
            System.out.println("    Enrolled in: " + course2.getName());
        }
    }
}

// Class representing a Course (Association with Student)
class Course {

    private String name;
    private Student student1;
    private Student student2;

    // Constructor
    public Course(String name) {
        this.name = name;
    }

    // Method to add students
    public void addStudent(Student student) {
        if (student1 == null) {
            student1 = student;
        } else if (student2 == null) {
            student2 = student;
        }
    }

    // Method to get course name
    public String getName() {
        return name;
    }
}
