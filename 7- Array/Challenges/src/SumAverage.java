public class SumAverage {
    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5,6,7,8,9};
        int length = arr.length;
        int sum = 0;

        for(int i = 0 ; i<length ; i++){
            sum += arr[i];
        }

        System.out.println("Sum of Array is "+sum);
        System.out.println("Average of  array is "+sum/length);
    }
}