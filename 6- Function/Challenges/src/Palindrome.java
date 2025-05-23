import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        boolean res = checkPalindrome(n);
        System.out.println(res);


    }
    public static boolean checkPalindrome(int n) {
        int d = 0;
        int num = n;
        while(n>0){
            int r = n%10;
            d = d*10 + r;
            n = n/10;
        }
        if(d == num){
            return true;
        }
        return false;
    }
}
