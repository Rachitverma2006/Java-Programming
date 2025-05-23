import java.util.Scanner;

public class CheckSortedArray {
    public static void main(String[] args) {
        System.out.println("Welcome to Check Sorted Array system");
        int [] arr = inputArray();
        boolean isInc = inIncreasing(arr);
        boolean isDec = inDecreasing(arr);

        if(isInc || isDec){
            System.out.println("Array is Sorted");
        }
        else{
            System.out.println("Array is not Sorted");
        }
    }


    public static int [] inputArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = sc.nextInt();
        sc.nextLine(); // consumes the leftover space

        System.out.println("Enter the elements in the array in space separated form");
        // Input array in string format
        String line = sc.nextLine();
        // Split the array by space
        String[] parts = line.split(" ");

        // convert the string elements in array to int
        int [] arr = new int[n];
        for(int i = 0;i< parts.length;i++){
            arr[i] = Integer.parseInt(parts[i]);
        }
        return arr;

    }

    public static boolean inIncreasing(int[] arr){
        int i = 1;
        while(i<arr.length){

            if(arr[i] < arr[i-1]){
                return false;
            }
            i++;
        }
        return true;

    }
    public static boolean inDecreasing(int[] arr){
        int i = 1;
        while(i<arr.length){
            if(arr[i] > arr[i-1]){
                return false;
            }
        }
        return true;

    }
}
