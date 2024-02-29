import java.util.Scanner;

class Student {
    Scanner sc = new Scanner(System.in);
    String name;
    int m1, m2, m3;

    public void inputStudentInfo() {
        System.out.print("Enter name: ");
        name = sc.next();
        System.out.println("Enter marks for three subjects:");
        System.out.print("Subject 1: ");
        m1 = sc.nextInt();
        System.out.print("Subject 2: ");
        m2 = sc.nextInt();
        System.out.print("Subject 3: ");
        m3 = sc.nextInt();
    }
}

class GradeCalculator extends Student { 
    float averageGrade;

    public void calculateAverageGrade() {
        averageGrade = (m1 + m2 + m3) / 3.0f;
        String f = String.format("%.2f", averageGrade);
        System.out.println("Average Grade for " + name + ": " + f); // Concatenate f
    }
}

public class MainGrade {
    public static void main(String[] args) {
        GradeCalculator gradeCalculator = new GradeCalculator();
        gradeCalculator.inputStudentInfo();
        gradeCalculator.calculateAverageGrade();
    }
}
