package MileStone2.MileStone2Lecture14;

public class PrintFibonacciNumber {

    public static int fibo(int n){

        if(n == 1 || n ==2){  // here we gave him a  two two base cases. 
            // because for finding fibonacci number we have to created a two function
            // because we can only find the fibonacci number when we have a two numbers
            // or if we have a two function so we have to gave a two base cases or conditions. 
            return 1;  
        }
        int fib_n_1 = fibo(n-1); // here we created a first function for having first value.
        int fib_n_2 = fibo(n-2); // here we created a second function for having second value
        int output = fib_n_1 + fib_n_2; // here we add those two function or values for our output or for the next number of the fibonacci number.
        return output; // and that next number is our output.
    }
    public static void main(String[] args) {
        System.out.println(fibo(4));
    }
    
}
