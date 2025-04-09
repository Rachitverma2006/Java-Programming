import java.util.Scanner;

public class Return {
    public static void main(String[] args) {
        greet();
        int num1 = readNumber();
        int num2 = readNumber();
        System.out.println(num1+num2);

    }

    public static void greet(){
        System.out.println("Welcome to Calculator.");
    }
    public static int readNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = sc.nextInt();
        return number;

    }

}
