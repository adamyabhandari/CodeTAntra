import java.util.Scanner;

class Person {
    Scanner sc = new Scanner(System.in);
    String name;

    public void inputName() {
        System.out.print("Enter name: ");
        name = sc.nextLine();
    }

    public void displayName() {
        System.out.println("Name: " + name);
    }
}

class Citizen extends Person {
    int age;

    public void inputAge() {
        Scanner s = new Scanner(System.in); // Moved Scanner declaration here
        System.out.print("Enter age: ");
        age = s.nextInt();
    }

    public void displayAge() {
        System.out.println("Age: " + age);
    }
}

public class MainPerson {
    public static void main(String[] args) {
        Citizen citizen = new Citizen();
        citizen.inputName();
        citizen.displayName();
        citizen.inputAge();
        citizen.displayAge();
    }
}
