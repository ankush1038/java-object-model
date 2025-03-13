// Main class to demonstrate Institute Management System relationships
public class InstituteManagement {

    public static void main(String[] args) {

        // Creating learners
        Learner learner1 = new Learner("Rachel");
        Learner learner2 = new Learner("Walter");

        // Creating instructors
        Instructor instructor1 = new Instructor("Dr. Green");
        Instructor instructor2 = new Instructor("Dr. White");

        // Creating subjects
        Subject subject1 = new Subject("Physics");
        Subject subject2 = new Subject("Chemistry");

        // Assigning instructors to subjects
        subject1.assignInstructor(instructor1);
        subject2.assignInstructor(instructor2);

        // Learners enrolling in subjects
        learner1.registerSubject(subject1);
        learner1.registerSubject(subject2);
        learner2.registerSubject(subject2);

        // Display subject details
        subject1.displaySubjectDetails();
        subject2.displaySubjectDetails();
    }
}

// Class representing a Learner
class Learner {

    private String name;
    private Subject subject1;
    private Subject subject2;

    // Constructor
    public Learner(String name) {
        this.name = name;
    }

    // Method to register in a subject
    public void registerSubject(Subject subject) {
        if (subject1 == null) {
            subject1 = subject;
        } else if (subject2 == null) {
            subject2 = subject;
        }
    }

    // Method to get learner name
    public String getName() {
        return name;
    }
}

// Class representing an Instructor
class Instructor {

    private String name;

    // Constructor
    public Instructor(String name) {
        this.name = name;
    }

    // Method to get instructor name
    public String getName() {
        return name;
    }
}

// Class representing a Subject (Aggregation with Instructors, Association with Learners)
class Subject {

    private String name;
    private Instructor instructor;
    private Learner learner1;
    private Learner learner2;

    // Constructor
    public Subject(String name) {
        this.name = name;
    }

    // Method to assign instructor to the subject
    public void assignInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    // Method to display subject details
    public void displaySubjectDetails() {
        System.out.println("Subject: " + name);

        if (instructor != null) {
            System.out.println("  Taught by: " + instructor.getName());
        }

        if (learner1 != null) {
            System.out.println("  Enrolled Learner: " + learner1.getName());
        }

        if (learner2 != null) {
            System.out.println("  Enrolled Learner: " + learner2.getName());
        }
    }
}
