package MileStone2.MileStone2Lecture17;

public class ProblemOfThisKeyword { /// here we create class that have properties or functions
    
    
        int a; 
        int b; 

    public void set(int a, int b) 
    {  
        b = a; 
        this.b = b; 
    } 

    void display() 
    { 
        System.out.println("a=" + a + " b=" + b); 
    } 
}







class T{ // In this we create objects:
    public static void main(String[] args) 
    { 
        ProblemOfThisKeyword object = new ProblemOfThisKeyword();
        object.set(10,20);
        object.display(); 
    } 
} 

