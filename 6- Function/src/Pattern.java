public class Pattern {
    public static void main(String[] args) {
//        for(int i=1;i<6;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print("* ");
//            }
//                System.out.println();
//
//        }

        int rows = 0;
        while(rows<4){
            System.out.print("*");
            int i = 0;
            while(i < rows) {
                System.out.print(" *");
                i++;

            };
            System.out.println();
            rows++;
        }

    }
//    public static void pattern1(){
//        int rows
//    }
}
