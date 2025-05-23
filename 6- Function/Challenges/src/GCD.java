import java.net.PasswordAuthentication;
import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();

        int result = gcd(a,b);
        System.out.println("GCD of 2 numbers is "+result);
    }

    public static int min(int a , int b){
        if(a>b){
            return a;
        }
        return b;
    }

    public static int gcd(int a, int b) {
        int gcd = 1;
        int i = 2;

        int least = min(a,b);
        while(i<least){
            if(a%i == 0 && b%i==0){
                gcd = i;
            }
            i++;

        }

        return gcd;
    }
}
