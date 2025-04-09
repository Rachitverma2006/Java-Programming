public class Parameters {
    public static void main(String[] args) {
        int output = sumTwoNumbers(5,4);
        System.out.println(output);

    }

    // there 2 first and second are called parameters.
    // while defining function it is called parameters and while using in function it is called arguments.
    public static int sumTwoNumbers(int first , int second){
        return first+second;
    }
}
