import java.util.Scanner;

class NumberIn {
    Scanner sc = new Scanner(System.in);
    int a;

    public void inputNumOne() {
        System.out.print("Enter number 1: ");
        a = sc.nextInt();
    }
}

class Product extends NumberIn {
    Scanner s = new Scanner(System.in);
    int b;

    public void inputNumTwo() {
        System.out.print("Enter number 2: ");
        b = s.nextInt();
    }

    public void displayProduct() {
        System.out.println("Product of the numbers: " + (a * b));
    }
}

public class MainFunction {
    public static void main(String[] args) {
        Product product = new Product();
        product.inputNumOne();
        product.inputNumTwo();
        product.displayProduct();
    }
}
