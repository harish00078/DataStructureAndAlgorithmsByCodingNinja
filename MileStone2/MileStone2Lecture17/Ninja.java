package MileStone2.MileStone2Lecture17;

public class Ninja {

    // question of a constructor:

 
    Ninja(String name) 
    { 
        System.out.println("Constructor one " + name); 
    } 
    Ninja(String name, int age) 
    { 
        System.out.println("Constructor two " + name + " "+ age); 
    } 
    Ninja(long id) 
    { 
        System.out.println("Constructor three " + id); 
    } 
} 

class check 
{ 
    public static void main(String[] args) 
    {  
        // Ninja geek3 = new Ninja("Dharmesh", 26); 
    } 
}
    

