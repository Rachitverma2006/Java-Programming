import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
//        int [] arr = {1,2,3,4,5,6,7,8,9};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers of elements in the array");
        int n = sc.nextInt();

        int [] arr = new int[n];

        for(int i = 0 ; i<n;i++){
            System.out.println("Enter the "+(i+1)+"th element");
            arr[i] = sc.nextInt();
        }

        int max = Max(arr);
        int min = Min(arr);
        System.out.println(max);
        System.out.println(min);
    }
    public static int Max(int[] arr){
        int max = 0;
        for(int i = 0 ; i<arr.length ; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    public static int Min(int[] arr){
        int min = arr[0];
        for(int i = 0 ; i<arr.length ; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
}
