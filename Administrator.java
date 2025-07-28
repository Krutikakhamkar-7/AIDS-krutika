class Person {
    String name;
    int age;

    void setPersonDetails(String n, int a) {
        name = n;
        age = a;
    }

    void displayPersonDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Subclass
class Administrator extends Person {
    String department;

    void setAdministratorDetails(String n, int a, String d) {
        setPersonDetails(n, a);
        department = d;
    }

    void displayAdministratorDetails() {
        displayPersonDetails();
        System.out.println("Department: " + department);
    }
}

// Main class to run the program
public class Main {
    public static void main(String[] args) {
        Administrator admin = new Administrator();
        admin.setAdministratorDetails("Krutika", 18, "Artificial Intelligence ");
        admin.displayAdministratorDetails();
    }
}


output:-
Name: Krutika
Age: 18
Department: Artificial Intelligence 
