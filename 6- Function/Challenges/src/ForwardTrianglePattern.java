import java.util.Scanner;

public class ForwardTrianglePattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        for(int i=1; i<rows+1 ; i++){
            for(int j =0 ; j<i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
