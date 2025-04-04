import java.util.Scanner;

public class FloatingProduct {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double a = sc.nextDouble();
        System.out.println("Enter the second number: ");
        double b = sc.nextDouble();
        double pro = a * b;
        System.out.println("The Product of 2 numbers is" + pro);
    }
}
