import java.util.Scanner; // Import Scanner class for user input

// Main class
public class StudentManagement {

    // Instance variables (data of a student)
    String name;
    int rollNumber;
    int marks1;
    int marks2;
    int marks3;

    // Constructor: runs automatically when object is created
    StudentManagement(String name, int rollNumber, int m1, int m2, int m3) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks1 = m1;
        this.marks2 = m2;
        this.marks3 = m3;
    }

    // Method to calculate average marks
    double calculateAverage() {
        return (marks1 + marks2 + marks3) / 3.0; // 3.0 to get decimal value
    }

    // Method to display student details
    void displayDetails() {
        System.out.println("\n--- Student Details ---");
        System.out.println("Name        : " + name);
        System.out.println("Roll Number : " + rollNumber);
        System.out.println("Marks       : " + marks1 + ", " + marks2 + ", " + marks3);
        System.out.println("Average     : " + calculateAverage());
    }

    // Main method: program execution starts here
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Scanner object for input

        // Taking input from user
        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter roll number: ");
        int roll = sc.nextInt();

        System.out.print("Enter marks in subject 1: ");
        int m1 = sc.nextInt();

        System.out.print("Enter marks in subject 2: ");
        int m2 = sc.nextInt();

        System.out.print("Enter marks in subject 3: ");
        int m3 = sc.nextInt();

        // Creating object of StudentManagement class
        StudentManagement student = new StudentManagement(name, roll, m1, m2, m3);

        // Display student details
        student.displayDetails();

        sc.close(); // Close scanner (good practice)
    }
}
