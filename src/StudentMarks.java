import java.util.*;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define student names and marks for an array (first 5 students)
        String[] studentNames = {"Karim", "Rahim", "Sakib", "Mamun", "Nafis"};
        int[] marks = new int[5];

        // ArrayList for extra students
        ArrayList<String> extraStudents = new ArrayList<>();
        ArrayList<Integer> extraMarks = new ArrayList<>();

        // Taking input for first 5 students
        for (int i = 0; i < studentNames.length; i++) {
            System.out.print("Enter marks for " + studentNames[i] + ": ");
            marks[i] = scanner.nextInt();
        }

        // Taking input for extra students
        String[] extraNames = {"Ammar", "Tamim"};
        for (String name : extraNames) {
            System.out.print("Enter marks for " + name + ": ");
            extraStudents.add(name);
            extraMarks.add(scanner.nextInt());
        }

        // Get individual student's average mark
        scanner.nextLine(); // Consume newline
        System.out.print("\nEnter a student name to check the average: ");
        String studentName = scanner.nextLine();
        double studentAvg = calculateAverage(studentName, studentNames, marks, extraStudents, extraMarks);
        System.out.println(studentName + "'s mark is: " + (studentAvg > 0 ? studentAvg : "Student not found!"));

        // Get class average mark
        System.out.println("Class average mark: " + calculateAverage(marks, extraMarks));

        scanner.close();
    }

    // Method Overloading: Calculate average for a specific student
    public static double calculateAverage(String name, String[] names, int[] marks, ArrayList<String> extraNames, ArrayList<Integer> extraMarks) {
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(name)) {
                return marks[i];
            }
        }
        for (int i = 0; i < extraNames.size(); i++) {
            if (extraNames.get(i).equalsIgnoreCase(name)) {
                return extraMarks.get(i);
            }
        }
        return 0.0; // If student not found
    }

    // Method Overloading: Calculate average for the whole class
    public static double calculateAverage(int[] marks, ArrayList<Integer> extraMarks) {
        double sum = 0;
        int count = 0;

        for (int mark : marks) {
            sum += mark;
            count++;
        }
        for (int mark : extraMarks) {
            sum += mark;
            count++;
        }

        return count == 0 ? 0 : Double.parseDouble(String.format("%.3f", sum / count));
    }
}
