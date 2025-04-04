import java.util.Scanner;

public class ArithmeticCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int n1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        int n2 = sc.nextInt();
        int sum = n1 + n2;
        int diff = n1 - n2;
        int pro = n1 * n2;
        int div = n1 / n2;
        int rem = n1 % n2;


        System.out.println("The sum is: " + sum);
        System.out.println("The difference is: " + diff);
        System.out.println("The product is: " + pro);
        System.out.println("The division is: " + div);
        System.out.println("The remainder is: " + rem);
    }


}
