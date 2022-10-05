package MileStone1Lecture12;

public class ProblemStringisPlaindromeOrNot { 
    // this program will work acc to the problem questin or its main function file.
    

    // using this function we can check that the string is plaindrome or not.

    // palindrome =  palindrome means that the values those are same from the forword side or backword side.
    // for example = abba -> this value is same from the forword side or backword side.


    // function for palindrome string or not.

    
    
	public static boolean isPalindrome(String str) {
		//Your code goes here
        int i=0;
        int j=str.length()-1;
        while(i <j){
            if(str.charAt(i) != str.charAt(j))
                return false;
        
        i++;
        j--;
	}
    return true;
}
}
    

