public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int length = arr.length;
        int [] reversedArray = new int [length];

        for(int i = length-1; i>=0 ;i--){
            reversedArray[length-(i+1)] = arr[i];
        }
        for(int i = 0 ; i<length;i++){
            System.out.print(reversedArray[i] + " ");
        }




    }
}
