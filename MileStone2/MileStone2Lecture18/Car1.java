package MileStone2.MileStone2Lecture18;

public class Car1 extends Vehicle1 {

    // here we solve the question  of the inheritance private property:

    public static void main(String[] args) {
        Vehicle1 v = new Vehicle1();
        v.colour = "white";
        v.set(1010) ;
        System.out.println(v.colour + " " + v.get());
    }
    
}
