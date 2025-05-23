import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int num = n;
        int x = length(n);
        int res = 0;

        while(n!=0){
            int r = n%10;
            int y = (int) Math.pow(r, x);
            res += y;
            n = n/10;
        }

        if(res == num){
            System.out.println("The number is a armstrong number");
        }
        else{
            System.out.println(res);
            System.out.println("The number is not a armstrong number");
        }
    }
    public static int length(int n){
        int count = 0;
        while(n!=0){
            count++;
            n = n/10;
        }
        return count;
    }
}
