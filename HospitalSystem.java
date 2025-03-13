// Main class to demonstrate association and communication
public class HospitalSystem {

    public static void main(String[] args) {

        // Creating a hospital
        Hospital hospital = new Hospital("Civil Hospital");

        // Creating doctors
        Doctor doctor1 = new Doctor("Dr. Gupta");
        Doctor doctor2 = new Doctor("Dr. Anand");

        // Creating patients
        Patient patient1 = new Patient("Jashan");
        Patient patient2 = new Patient("Aditya");

        // Establishing consultations
        doctor1.consult(patient1);
        doctor1.consult(patient2);
        doctor2.consult(patient1);

        // Display hospital details
        hospital.displayHospitalDetails();
    }
}

// Class representing a Hospital
class Hospital {

    private String name;
    private Doctor doctor1;
    private Doctor doctor2;

    // Constructor
    public Hospital(String name) {
        this.name = name;
    }

    // Method to display hospital details
    public void displayHospitalDetails() {
        System.out.println("Hospital: " + name);
    }
}

// Class representing a Doctor (Association with Patient)
class Doctor {

    private String name;
    private Patient patient1;
    private Patient patient2;

    // Constructor
    public Doctor(String name) {
        this.name = name;
    }

    // Method for consultation
    public void consult(Patient patient) {
        if (patient1 == null) {
            patient1 = patient;
        } else if (patient2 == null) {
            patient2 = patient;
        }

        System.out.println(name + " is consulting " + patient.getName());
    }
}

// Class representing a Patient (Association with Doctor)
class Patient {

    private String name;

    // Constructor
    public Patient(String name) {
        this.name = name;
    }

    // Method to get patient name
    public String getName() {
        return name;
    }
}
