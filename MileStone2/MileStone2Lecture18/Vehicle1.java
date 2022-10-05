package MileStone2.MileStone2Lecture18;

public class Vehicle1 {

    // here we solve the question  of the inheritance private property:
    String colour;
    private int number;
    void set(int number)
    {
        // number=number;
    }
    int get()
    {
        return number;
    }
}

// class Car1 extends Vehicle1{
//     public static void main(String[] args) {
//         Vehicle v = new Vehicle();
//         v.colour = "white";
//         v.set(1010) ;
//         System.out.println(v.colour + " " + v.get());
//     }
    
// }
