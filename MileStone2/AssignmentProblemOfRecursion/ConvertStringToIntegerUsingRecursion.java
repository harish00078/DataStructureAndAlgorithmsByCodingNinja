package MileStone2.AssignmentProblemOfRecursion;

public class ConvertStringToIntegerUsingRecursion {

    public static int convertStringToInt(String input){
		// Write your code here

        
            if(input.length()==1)// here we check that string have a value or not:
            // if string have a value of one:
        {
            // this is the basic calculation that is done by me:
            return input.charAt(0) - 48;// then we basically convert the 0th string value into the 0th of integer value.
            // using ASCII system . here basically minimise the 0th string value with 48.and at result have (1) in the form of the integer.
        }
        int ld=input.charAt(0) - 48; /// here we save that (1) integer value in (ld) variable.
        // here create recursion that will work on the other values
        int smallAns=convertStringToInt(input.substring(1)); // recursion start from the 1th index value:
    
        int pow=(int)Math.pow(10,input.length()-1); // here we basically create a power sequnce for the addition.
        // with value that we created or values that is created by recursion it self.
        return ld*pow + smallAns; // here we add that all values and return that conversion from string to integere to the user.
        
	}
    public static void main(String[] args) {
        
        String input  = "0012320";
        System.out.println(convertStringToInt(input));
    }
    
}
