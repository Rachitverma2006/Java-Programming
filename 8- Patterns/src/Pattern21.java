public class Pattern21 {
    public static void main(String[] args) {
        int n = 5;
        int c = 1;
        for(int i = 1 ; i<n+1 ; i++){
            for(int j = 0 ; j<i ; j++){
                System.out.print(c + " ");
                c++;
            }
            System.out.println();
        }
    }
}

/*

1
2 3
4 5 6
7 8 9 10
11 12 13 14 15

 */
