import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name = sc.nextLine();
        System.out.println("Your name is " + name + "\nPlease enter your age");
        int age = sc.nextInt();
        System.out.println("Your age is " + age);


    }
}
