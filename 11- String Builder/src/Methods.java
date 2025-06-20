public class Methods {
    public static void main(String[] args) {


        StringBuilder sb1 = new StringBuilder("Hello");


//      Length & Capacity
        System.out.println(sb1.length());
        System.out.println(sb1.capacity()); // default capacity is 16

//      Mutability
        sb1.append("World").append("!"); // allows chaining

        StringBuilder sb2 = new StringBuilder("Hello");
        sb2.insert(5," vxRachit");  //StringIndexOutOfBoundsException if not valid index
        System.out.println(sb2);

        sb2.delete(5,14); //IndexOutOfBoundsException if range is invalid.
        System.out.println(sb2);

        sb2.deleteCharAt(4);
        System.out.println(sb2);

        sb2.replace(2,4,"rr"); //(start index , end index , string)
        System.out.println(sb2);

        sb2.reverse(); // reverse the string
        System.out.println(sb2);

        char ch = sb2.charAt(3);
        System.out.println(ch); //IndexOutOfBoundsException if index invalid.

        sb2.setCharAt(3,'r');
        System.out.println(sb2);

        String str = sb2.toString();
        System.out.println(sb2);
        System.out.println(str);
        System.out.println(sb2.getClass().getSimpleName());





    }
}