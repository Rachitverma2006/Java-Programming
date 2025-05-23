public class Pattern3 {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 1 ; i<n+1 ; i++){
            for(int j = 0 ; j<n-i+1 ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
