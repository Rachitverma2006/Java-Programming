import java.util.Scanner;

public class ArraySearching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = {1,5,7,8,98,96,85,74,85,96,78,85};
        System.out.println("Enter the element to be searched: ");
        int num = sc.nextInt();
        boolean found = isFound(arr,num);
        System.out.println(found);

    }

    public static boolean isFound(int[] arr, int target) {
        int index = 0;
        while(index<arr.length){
            if(arr[index] == target){
                return true;
            }
            index++;
        }
        return false;
    }
}
