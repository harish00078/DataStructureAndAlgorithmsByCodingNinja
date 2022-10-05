package MileStone2.MileStone2Lecture14;


public class CalculatePower {

    // here we create a recursion function .to calculate the power of number.
    public static int power(int x, int n){
        if(n == 0){  // here we gave the conition to the (n) so that they did not go on the negative values
            return 1;
        }
        int smalloutput = power(x, n-1); // in this way we can calculate the power values for all the( n - 1) elements.
       int output = x * smalloutput; // here we multiply our(x,n-1) value with last element of (x) . after that we have our output.
       return output; // and we retrun that output.


    }

    public static void main(String[] args) {
        System.out.println(power(5, 5));
    }
     
     
       

    
}
