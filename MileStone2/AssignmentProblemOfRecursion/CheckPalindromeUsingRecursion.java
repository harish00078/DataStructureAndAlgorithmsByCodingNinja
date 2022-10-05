package MileStone2.AssignmentProblemOfRecursion;

public class CheckPalindromeUsingRecursion {

    /// In this problem we check that the given string is palindrome or not.

    // 1. This is the simplest or fastest way to solve this problem :

    public static boolean isStringPalindrome(String input){

        if(input.length() <= 1){ // here we check the length of the string.
            // if string have a length of less than or equal to one it means we have to simply retrun the true:        
            return true;
        }
            
        
        if(input.charAt(0) == input.charAt(input.length() - 1)){ //IF 0th index  is similar to the last index.it means that our string have a palindrome quality
            // and we have check other charcters other characters of the string.
            return isStringPalindrome(input.substring(1, input.length() - 1)); // for checking the other characters off the string use recursion function it self:
        }else{  // if they are not similar then we simply return the output false:
            return false;
        }
    }
    // public static void main(String[] args) {
        
    //     String str = "racecah";
    //     System.out.println(isStringPalindrome(str));
    // }


    // 2. we also have other way to solve this problem : here we  use start or end index to solve this problem;
    
    public static boolean IsStringPalindrome(String input) {
		// // Write your code here
		// if(input.length() == 0){
		// return true;
		// }

        // String smalloutput = isStringPalindrome(input, si + 1, ed-1);
      
        // int si = 0;
        // int ed = input.length;
        
        
        // if(si == ed){
        //     return true;
        // }else{
        //     return false;
        // }
       return IsStringPalindrome(input, 0, input.length()-1);
	}
    
    public static boolean IsStringPalindrome(String input, int si, int ei){
        if(si >= ei){
            return true;
        }
        
        
        if(input.charAt(si) == input.charAt(ei)){
            input = input.substring(1, input.length()-1);
            return IsStringPalindrome(input, 0, input.length()-1);
        }
        return false;
    }
    public static void main(String[] args) {
        
        String str = "racecah";
        System.out.println(IsStringPalindrome(str));
    }
    
    
}
