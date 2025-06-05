import java.util.Arrays;

public class ArrayMethods {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,51,4,7,9};

        for(int num:arr){
            System.out.println(num);
        }
        Arrays.sort(arr);



        System.out.println(Arrays.toString(arr));
    }
}
