import java.util.Scanner;

public class EvenOddBitwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();

        // agar number ka bitwise and kerenge 1 ke sath to vo uski last bit return ker dega.4
        // ex- 10010 & 1 = 0
        // for even number = last bit 0 and for odd = last bit 1.

        boolean isEven = (num & 1) == 0;

        if(isEven){
            System.out.println("Number is even");
        }
        else{
            System.out.println("Number is odd");
        }

    }
}
