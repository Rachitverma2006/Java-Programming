import java.util.Arrays;

public class PalindromeArray {
    public static void main(String[] args) {
        int[] arr = {1,1,2,1,1};
        int [] reversedArray = new int[arr.length];
        reversedArray = reversedArray(arr);

        if(Arrays.equals(reversedArray, arr)){
            System.out.println("It is a Palindrome Array");

        }
        else{
            System.out.println("It is not a Palindrome Array");

        }

    }
    public static int[] reversedArray(int[] arr) {
        int length = arr.length;
        int [] reversedArray = new int[arr.length];

        for(int i = length-1 ; i>=0 ; i--){
            reversedArray[length-(i+1)] = arr[i];
        }
        return reversedArray;
    }
}
