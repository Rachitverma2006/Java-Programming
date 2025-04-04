import java.util.Scanner;

public class RectPerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Perimeter Calculator. Please enter the 4 sides in cms");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        System.out.println("Perimeter is " + (a+b+c+d));
    }
}
