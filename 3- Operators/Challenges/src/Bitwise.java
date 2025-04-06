public class Bitwise {
    public static void main(String[] args){
        int n1 = 5;
        int n2 = 6;

        // Bitwise And
        int and  = n1 & n2;
        System.out.println("Bitwise and of 5 and 6 is " + and);
        // Bitwise Or
        int or  = n1 | n2;
        System.out.println("Bitwise or of 5 and 6 is " + or);
        // Bitwise Xor
        int xor  = n1 ^ n2;
        System.out.println("Bitwise xor of 5 and 6 is " + xor);
        // Bitwise complement (one's Complement) returns [-(n+1)]
        int complement  = ~n1;
        System.out.println("Bitwise xor of 5 is " + complement);
        // bitwise left shift
        int left = n1 << 1;
        System.out.println("Bitwise left is " + left);
        // bitwise right shift
        int right = n2 >> 1;
        System.out.println("Bitwise right is " + right);


    }
}
