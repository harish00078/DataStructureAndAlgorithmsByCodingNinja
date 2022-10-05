package MileStone1Lecture9;

public class PrimitivesWithFunction {

    // primitive datatypes with function:

    public static void increment(int i){
        i++;  // here it only increment the value of (i) using increment operator. it not print the value .
        // that why we did not use this value in any other  function .
    }
    public static void main(String[] args) {
        
        int i = 10;
        increment(i); // here we did not get any value from the increment function.because the increment function did not gave any output.
        // its only update the value using increment method.did not print that value. that why we did not use this value in anyother function.
        System.out.println(i); // this i will the value of main function (i)
    }
    
}
