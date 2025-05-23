public class NoOfOccurence {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,4,5,4,8,9,4,6,8,4,7,8,5,4};
        int count = 0;
        int toFound = 4;

        for(int i = 0 ; i<arr.length ; i++){
            if(arr[i] == toFound){
                count++;
            }
        }
        System.out.println("Number of occurences is of "+toFound+" is "+count);

    }
}
