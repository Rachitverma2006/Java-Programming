import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int n1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        int n2 = sc.nextInt();

        int max = n1*n2;

        int i = 1;
        while(i<=max){
            if(i%n1 == 0 && i%n2 == 0){
                System.out.println(i);
                break;
            }
            i++;
        }
    }
}
