public class Pattern6 {
    public static void main(String[] args) {
        int n = 5;
        int i;
        for (i = 1; i < n+1; i++) {
            for (int j = 0; j < n - i ; j++) {
                System.out.print(" ");
            }
            for(int j = 0 ; j<i ; j++){
                System.out.print("*");
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

 */
