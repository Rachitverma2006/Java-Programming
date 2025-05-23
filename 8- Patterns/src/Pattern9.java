public class Pattern9 {
    public static void main(String[] args) {
        // (n-i)*2 + 1
        int n = 5;
        for(int i = 1 ; i<n+1  ; i++){
            for(int j = 1 ; j<i ; j++){
                System.out.print("$");
            }
            for(int j = 0 ; j<(n-i)*2+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/*

*********
$*******
$$*****
$$$***
$$$$*

 */
