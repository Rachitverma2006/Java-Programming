import java.util.Scanner;

public class DeletingElement {
    public static void main(String[] args) {
        int[] arr = inputArray();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element to be deleted");
        int target = sc.nextInt();
        int[] newArray = newArray(arr,target);
        displayArray(newArray);


    }
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
    public static int getOccurence(int[] arr,int target){

        int count = 0;
        for(int i = 0 ; i<arr.length ; i++){
            if(arr[i] == target){
                count++;
            }
        }
        return count;
    }

    public static int[] newArray(int[] arr , int target){
        int count = getOccurence(arr,target);
        if(count == 0){
            return arr;
        }
        int[] newArray = new int[arr.length - count];

        int i = 0 , j = 0;
        while(i<arr.length){
            if(arr[i] != target){
                newArray[j] = arr[i];
                j++;
            }
            i++;
        }
        return newArray;

    }
    public static void displayArray(int[] arr){
        for(int i = 0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }

}
