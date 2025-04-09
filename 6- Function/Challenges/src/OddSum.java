import java.util.*;
public class OddSum {
    public static void main(String[] args) {
        greet();
        int number = oddSum();
        System.out.println(number);





    }
    public static void greet(){
        System.out.println("Welcome to odd sum calculator program\nPlease enter a number");
    }
    public static int oddSum() {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int i = 0;
        int sum = 0;
        while(i <= n){
            if(i % 2 != 0){
                sum += i;
            }

            i++;
        }
        return sum;
   }
}
