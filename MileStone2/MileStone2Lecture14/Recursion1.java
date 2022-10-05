package MileStone2.MileStone2Lecture14;

public class Recursion1 {

    // here we create or see the example of the recursion:
    // here we create a function to find factorial of (n) numbers.
    // and we use function itself to solve this problem. that why it is called recursion.
    

    // here we create function: find the factorail of (n) numbers

    public static int fact(int n){
        if(n == 0){  // here gave a condition to the function that we have to only run until the (n) is zero.
            // be did not go on the negative values . that why we gave him a condition.
            return 1;
        } 

        // factorial means that like we have (n) value is 5 = then factorial of the 5 is 5 * 4 * 3 * 2 * 1.
        int smalloutput = fact(n-1); // means minimise the value by one of the given number.
        int output = n *smalloutput;  // and also multiply them one by one.
        return output; // and here we have the output of the find the factorial of the (n) numbers. 

    }

    
    public static void main(String[] args) {
        
        System.out.println(fact(5));
    }
    
    
}
