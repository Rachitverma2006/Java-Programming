import java.util.Scanner;

public class ArrayUtility {
    public static int[] inputArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter the elements of array is space separated form");
        String s = sc.nextLine();

        String[] parts = s.split(" ");
        int[] arr = new int[n];
        for(int i = 0 ; i<parts.length; i++){
            arr[i] = Integer.parseInt(parts[i]);
        }
        return arr;
    }
    public static void displayArray(int[] arr){
        for(int i = 0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
