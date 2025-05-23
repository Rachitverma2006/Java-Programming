import  java.util.Scanner;
public class NumReverse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int d = 0;
        while(num!=0){
            int r = num%10;
            d = d*10 + r;
            num = num/10;

        }
        System.out.println(d);
    }

}
