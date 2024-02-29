import java.util.Scanner;

class NumberIn {
    Scanner sc = new Scanner(System.in);
    int num;

    public void inputNum() {
        System.out.print("Enter number: ");
        num = sc.nextInt();
    }
}

class SquareOut extends NumberIn {
    public void displaySquare() {
        System.out.println("Square of the number: " + (num * num));
    }
}

public class MainFunction {
    public static void main(String[] args) {
        SquareOut squareout = new SquareOut();
        squareout.inputNum();
        squareout.displaySquare();
    }
}
