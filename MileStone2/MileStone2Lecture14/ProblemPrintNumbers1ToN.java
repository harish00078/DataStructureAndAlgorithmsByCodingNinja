package MileStone2.MileStone2Lecture14;

public class ProblemPrintNumbers1ToN {

    public static void print(int n){  // here we use void function because we only want the output from the function.
        // did not want to use that output further.
		//Write your code here
        if(n==0)  // here we firstly gave him a condition. so our program will did not jump on the negative .
        // that why we gave him a condition always checkk that n = 0 or not.
        // when (N) touch the value zero it will stop the program.
        {
            return; // we did not need zero in our output that why we did not print here anything
        }
        print(n-1);  // here have all the number from 1 to (n-1)
        System.out.print(n + " "); // and here we print all the elements with the last element (n).
        // print1ton(n-1);
    }
    public static void main(String[] args) {
        
        print(6);
    }
    
}
