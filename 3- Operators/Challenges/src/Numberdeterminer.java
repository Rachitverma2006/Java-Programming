import java.util.Scanner;
public class Numberdeterminer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = input.nextInt();
        if(num<0){
            System.out.println("Number is negative");
        }
        else if (num == 0){
            System.out.println("Number is zero");
        }
        else{
            System.out.println("Number is Positive and greater that zero");
        }

    }
}
