import java.util.Scanner;

public class Logical {
    public static void main (String[] args){
        // && = and , || = Or , ! = Not
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Ticket Discount Calculator.");
        System.out.println("Enter your age");
        int age = input.nextInt();
        System.out.println("Are you male or female?(true or false)");
        boolean isFemale = input.nextBoolean();

        if(age < 5){
            System.out.println("You got 75% discount");
        }
        else if (isFemale){
            System.out.println("You got 25% discount");

        }
        else{
            System.out.println("You got no discount");
        }
    }
}
