public class Pattern5 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i < n+1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = 1 ; i<n+1 ; i++){
            for(int j = 0 ; j < n-i ; j++){
                System.out.print("* ");

            }
            System.out.println();

            }
    }
}
/*

 *
 **
 ***
 ****
 *****
 ****
 ***
 **
 *

 */
