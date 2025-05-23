public class SumOf2Diagonal {
    public static void main(String[] args) {
        // Assuming that it is a square matrix
        int [][] arr = SumAndAverage.InputArray();
        int rows = arr.length;
        int cols = rows;
        int diag1 = 0;
        int diag2 = 0;
        for(int i = 0 ; i < rows ; i++){
            for(int j = 0 ; j < cols ; j++){
                if(i == j){
                    diag1 += arr[i][j];
                }
                if(i+j == (cols-1)){
                    diag2+=arr[i][j];
                }
            }
        }
        if(rows %2 != 0){
            int cen = arr.length/2;
            System.out.println("Sum of diagonals is: " + (diag1+diag2-arr[cen][cen]));
        }
        else{
            System.out.println("Sum of diagonals is: " + (diag1+diag2));

        }




    }
}
