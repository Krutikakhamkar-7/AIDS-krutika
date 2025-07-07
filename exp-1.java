import java.util.Scanner;

// Class definition
class Student {
    // Attributes (data members)
    String name;
    int rollNumber;
    float marks;

    // Method to input student details
    void inputDetails(Scanner sc) {
        System.out.print("Enter name: ");
        name = sc.nextLine();

        System.out.print("Enter roll number: ");
        rollNumber = Integer.parseInt(sc.nextLine());

        System.out.print("Enter marks: ");
        marks = Float.parseFloat(sc.nextLine());
    }

    // Method to display student details
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println();
    }
}

// Main class (must match file name in online compilers)
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Creating two Student objects
        Student student1 = new Student();
        Student student2 = new Student();

        // Taking input for both students
        System.out.println("Enter details for Student 1:");
        student1.inputDetails(sc);

        System.out.println("\nEnter details for Student 2:");
        student2.inputDetails(sc);

        // Displaying details of both students
        System.out.println("\nStudent Details:");
        student1.displayDetails();
        student2.displayDetails();

        sc.close();
    }
}




output-
Enter details for Student 1:
Enter name: alice
Enter roll number: 101
Enter marks: 88.5

Enter details for Student 2:
Enter name: bob
Enter roll number: 102
Enter marks: 79.0

Student Details:
Name: alice
Roll Number: 101
Marks: 88.5

Name: bob
Roll Number: 102
Marks: 79.0
