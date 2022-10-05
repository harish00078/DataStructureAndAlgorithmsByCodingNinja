package MileStone2.AssignmentProblemOfRecursion;

public class FindSumOfDigitsUsingRecursion {

    public static int sumOfDigits(int input){
		// Write your code here
        if(input == 0) {
			return 0;
		}
		int number=sumOfDigits(input / 10);  // here we use the (input/10) function to find the sum of the elements.
        // because are in the form of the string we have to convert them into the integer form. then we are able to add them. 
		int sum= number + input%10; // here we add the sum of the digits that is calculated why using recursion.we add that  with the last value of the string
        // for having the last vale by using the function module function(input%10);
        // in this way we are able to find the sum of the string numbers.
		return sum;// here we return the sum of the string.

	}


    public static void main(String[] args) {
        
        int input = 12345; //here these number are in the form of string
        System.out.println(sumOfDigits(input));
    }
    
}
