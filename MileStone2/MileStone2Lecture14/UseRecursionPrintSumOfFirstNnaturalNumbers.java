package MileStone2.MileStone2Lecture14;

public class UseRecursionPrintSumOfFirstNnaturalNumbers {

    public static int sumn(int n){
        if(n==0){  // here we gave him a condition. that  always check that n is equalto or not.
            // because when we minimize the (n) by one we did not want the our program will jump on the negative values.
            // that why we check here that n is equal to zero or mot.
            return 0;
        }
        int smallOutput=sumn(n-1); // here we  use sum function it self to find out the all values for the sum .acc to the given . 
        int output=n+smallOutput; // here we add all the values that we found using given number
        // we added that all values with given number.
        // because here we have to find the sum of first (n) natural numbers
        return output; // and here we print the output of the (n) natural number.
        
        
    }
    
    public static void main(String[] args){
    
        System.out.println(sumn(10));
    }
    
}
