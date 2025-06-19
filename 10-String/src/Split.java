import java.util.Arrays;

public class Split {
    public static void main(String[] args) {

//        if patttern is not found it returns the original string
        String str = "apple,banana,grapes";
        String[] arr = str.split(",");
        System.out.println(Arrays.toString(arr));

//        split with limit
        String[] parts = str.split(",",2);
        System.out.println(Arrays.toString(parts));

//        Special character with regex

        String s1 = "one   two  three";
        String[] a1 = s1.split("\\s+");
        System.out.println(Arrays.toString(a1));

        String s2 = "192.168.1.1";
        String[] a2 = s2.split("\\.");
        System.out.println(Arrays.toString(a2));

        String s3 = "a,b;c,d";
        String[] a3 = s3.split("[,;]");
        System.out.println(Arrays.toString(a3));

/*
\\d	Any digit (0–9)
\\w	Word character (letters, digits, _)
[^abc]	NOT a, b, or c
[a-z]	Range: a to z
`	`
+, *, ?	Quantifiers
 */


    }
}
