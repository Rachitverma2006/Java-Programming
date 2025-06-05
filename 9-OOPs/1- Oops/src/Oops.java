class Pen{
    String color;
    String type; // ballpoint , gel

    public void write(){
        System.out.println("Writting something");

    }
    public void printColor(){
        System.out.println(this.color);
    }
}

public class Oops {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.color = "blue";
        p1.type = "gel";

        p1.printColor();

        Pen p2 = new Pen();
        p2.printColor();
    }

}