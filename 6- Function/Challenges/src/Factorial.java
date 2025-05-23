import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();
        int fact = 1;
        if(number == 0 || number == 1){
            fact = 1;
        }
        else{
            for(int i = 1 ; i<=number ; i++){
                fact = fact * i;
            }
        }
        System.out.println(fact);
    }
}
