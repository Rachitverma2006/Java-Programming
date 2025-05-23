import java.util.Scanner;

public class ReverseArrayInPlace {
    public static void main(String[] args) {
        int[] arr = ArrayUtility.inputArray();
        reverse(arr);
        System.out.println("Your Reversed Array is");
        ArrayUtility.displayArray(arr);


    }
    public static void reverse(int[] arr){
        int i = 0;
        while(i<arr.length/2){
            int swap = arr[i];
            arr[i] = arr[arr.length - (i+1)]; // or arr[(arr.length-1) - i]
            arr[arr.length - (i+1)] = swap;
            i++;

        }

    }

}
