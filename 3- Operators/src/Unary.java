public class Unary {
    public static void main(String[] args) {
        int x = 5;
        int y = -x;
        System.out.println(y);

        // x++ = post implementation - first use then increase.
        // ++x = pre implementation - first increase then use.
        // same in case of minus also (-) these 5 are the unary operators.

        int m = 5;
        System.out.println(m++);
        int n = 5;
        System.out.println(++n);
    }
}
