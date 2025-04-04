import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Triangle Area Calculator");
        System.out.println("Enter the height of the triangle");
        double h = sc.nextDouble();
        System.out.println("Enter the base of the triangle");
        double b = sc.nextDouble();
        System.out.println("Area of Triangle is "+ (0.5 * b * h)+"cm2");
    }
}
