import java.util.Scanner;

// Abstract class (Abstraction)
abstract class Student {
    protected String name;
    protected int id;
    protected double marks;

    // Constructor
    public Student(String name, int id, double marks) {
        this.name = name;
        this.id = id;
        this.marks = marks;
    }

    // Encapsulation (Getters & Setters)
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public double getMarks() { return marks; }
    public void setMarks(double marks) { this.marks = marks; }

    // Abstract Method (Must be implemented in child classes)
    public abstract double calculateScholarship();

    // Method Overloading (Polymorphism)
    public void displayInfo() {
        System.out.println("Student ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }

    public void displayInfo(String extraInfo) {
        displayInfo();
        System.out.println("Extra Info: " + extraInfo);
    }
}

// Subclass 1 - Inheritance
class GraduateStudent extends Student {
    private String researchTopic;

    public GraduateStudent(String name, int id, double marks, String researchTopic) {
        super(name, id, marks);
        this.researchTopic = researchTopic;
    }

    public String getResearchTopic() { return researchTopic; }

    // Method Overriding (Polymorphism)
    @Override
    public double calculateScholarship() {
        return (marks >= 80) ? 5000 : 2000;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Research Topic: " + researchTopic);
    }
}

// Subclass 2 - Inheritance
class UndergraduateStudent extends Student {
    private int semester;

    public UndergraduateStudent(String name, int id, double marks, int semester) {
        super(name, id, marks);
        this.semester = semester;
    }

    public int getSemester() { return semester; }

    // Method Overriding (Polymorphism)
    @Override
    public double calculateScholarship() {
        return (marks >= 75) ? 3000 : 1000;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Semester: " + semester);
    }
}

// Main Class
public class OOPWithStudentManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User Input
        System.out.print("Enter Student Type (Graduate/Undergraduate): ");
        String type = scanner.nextLine();

        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter ID: ");
        int id = scanner.nextInt();

        System.out.print("Enter Marks: ");
        double marks = scanner.nextDouble();

        Student student;
        if (type.equalsIgnoreCase("Graduate")) {
            scanner.nextLine(); // Consume newline
            System.out.print("Enter Research Topic: ");
            String topic = scanner.nextLine();
            student = new GraduateStudent(name, id, marks, topic);
        } else {
            System.out.print("Enter Semester: ");
            int semester = scanner.nextInt();
            student = new UndergraduateStudent(name, id, marks, semester);
        }

        // Display Info and Scholarship
        System.out.println("\nStudent Details:");
        student.displayInfo();
        System.out.println("Scholarship Amount: $" + student.calculateScholarship());

        scanner.close();
    }
}
