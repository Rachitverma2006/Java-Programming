public class LearningIf {
    public static void main(String[] args) {
        boolean isMale = true;
        String name = "Ram";
// if the statement is ony single line that it is allowed to not use {}.
        if(isMale){
            System.out.println("Mr." + name);
        }
        else{
            System.out.println("Ms." + name);
        }
    }
}