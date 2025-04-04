import java.util.Scanner;
public class Relational {
    public static void main(String[] args) {
        // == , != , > , < , >= , <=
        // These are relational Operators return value in true and false.
        // Order of Relational operator is less than arithmetic operator

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();

        if(age >= 18 ){
            System.out.println("You can drive");
        }
        else{
            System.out.println("Beta cycle chalao");
        }



    }
}
