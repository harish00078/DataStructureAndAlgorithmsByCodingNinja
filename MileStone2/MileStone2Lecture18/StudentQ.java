package MileStone2.MileStone2Lecture18;

public class StudentQ extends PersonQ {

    /// here we solve the other problem of the super keyword:

    void fun() 
    { 
        System.out.print("student class"); 
    } 
    void display() 
    { 
        fun(); 
        super.fun(); 
    } 
    
}
