import java.lang.reflect.Array;
import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String s1 = "Hello";

//        Length
        System.out.println(s1.length());
        System.out.println(s1.charAt(2));

//        Searching in Strings
        System.out.println(s1.indexOf('o')); // returns the first index of occurence and - if not found
        System.out.println(s1.lastIndexOf('o')); // same

//        checking
        System.out.println("Java".equals(s1)); // case senstive
        System.out.println("hello".equalsIgnoreCase(s1));
        System.out.println(s1.contains("lo"));
        System.out.println(s1.startsWith("He"));
        System.out.println(s1.endsWith("lo"));
        System.out.println(s1.isEmpty());


/*     comparing
      check for Lexicographical comparision
      a.compareTo(b)
      if
      equals = 0
      a < b = -1
      a > b = 1

 */
        System.out.println("hello".compareTo(s1));
        System.out.println("hello".compareToIgnoreCase(s1));

//        Transforming
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());
//
        System.out.println(" g l a  ".trim()); //Removes leading and trailing spaces (not internal).
        System.out.println(s1.substring(1, 2)); // (begin , end)
        System.out.println(s1.replace("h","H"));
        System.out.println(String.join(" ", s1,"World"));
        char [] s2 = s1.toCharArray();
        System.out.println(Arrays.toString(s2));





    }
}
