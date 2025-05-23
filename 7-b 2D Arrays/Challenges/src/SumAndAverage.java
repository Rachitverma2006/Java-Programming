import java.util.Arrays;
import java.util.Scanner;

public class SumAndAverage {
    public static void main(String[] args) {
        int [][] arr = InputArray();
        int [][] emptyArr = {};
        boolean isEmpty = Arrays.equals(arr, emptyArr);
        if(isEmpty){
            System.out.println("The sum of the array is: " + 0);
            System.out.println("The average of the array is: " + 0);
        }
        else{
            int sum = Sum(arr);
            double avg = Average(arr);
            System.out.println("The sum of the array is: " + sum);
            System.out.println("The average of the array is: " + avg);

        }


    }
    public static int [][] InputArray(){
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int [][] arr = new int[rows][cols];
        for(int row = 0 ; row < rows ; row++){
            for(int col = 0 ; col < cols ; col++){
                arr[row][col] = sc.nextInt();
            }
        }
        return arr;
    }
    public static int Sum(int[][] arr){
        int sum = 0;
        int rows = arr.length;
        int cols = arr[0].length;
        for(int i = 0 ; i<rows ; i++){
            for(int j = 0 ; j<cols ; j++){
                sum += arr[i][j];
            }
        }
        return sum;
    }
    public static double Average(int[][] arr){
        int sum = Sum(arr);
        int rows = arr.length;
        int cols = arr[0].length;
        int totalElements = rows * cols;
        int average = sum / totalElements;
        return average;

    }
}
