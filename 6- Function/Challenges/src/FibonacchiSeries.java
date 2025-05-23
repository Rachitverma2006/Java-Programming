import java.util.Scanner;

public class FibonacchiSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number upto which fibonacchi series be printed : ");
        int n = sc.nextInt();

        int a = 0 , b=1;
        System.out.print("Fibonacchi series : "+a);

        while(b<n){
            System.out.print(" "+b);
            int next = a+b;
            a = b;
            b = next;

        }
    }

}
