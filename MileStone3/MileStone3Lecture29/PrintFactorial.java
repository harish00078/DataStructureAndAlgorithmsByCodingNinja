package MileStone3.MileStone3Lecture29;

public class PrintFactorial{

    // this is our old factorial function:
    // this is the returning value factorial function:
    public static int factorialHelper(int input){
        if(input == 0){
            return 1;
        }
        return input * factorialHelper(input - 1);
    }

    // but here we are creating the fatorial function:
    // those function are not returning any value:
    // they are just printing the values:
    // and here we can create that function in the two ways:

    // first factorial function that will just print the value:
    public static void factorial1(int input){
        // this factorial function will basically use  our old or we can say that the helper factorail function;
        // to do the factorial calculation:
        int out = factorialHelper(input);
        System.out.println(out);
    }


    /// second factorial function that will just print the value:
    public static void factorail2(int input, int answer){

        // here we have base case:
        if(input == 0){ // if input check zero:
            System.out.println(answer); // then we simply print our answer varianble value:
            return;
        }
        // if that not the case:
        answer = answer * input;  // then simply multiply our answer value with input value:
        // and for next input value that multiple will become our next  answer varaible value: 
        factorail2(input - 1, answer); // and we do that with input - 1 values:
        // means  until our input varaible values will not become zero:
        // that why we use recursion here;
    }


    public static void main(String[] args) {
        
        int n = 5;
        factorial1(n);

        factorail2(n,1);

    }
    
}
