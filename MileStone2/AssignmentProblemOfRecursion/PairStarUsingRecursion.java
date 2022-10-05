package MileStone2.AssignmentProblemOfRecursion;

public class PairStarUsingRecursion {

    	// Return the updated string
        public static String addStars(String s) {
            // Write your code here
            if(s.length() == 1){ // here we define the length of the string
                // if string hava only one value then we simply return value of the (s).
                return s;
            }
            String smallString=addStars(s.substring(1)); // here we call recursion function it self to add stars. at 1st index.
            // in the array.
            if(s.charAt(0) == smallString.charAt(0)){ /// here we check that if String 0th index or recusion function 0th index have some value.
                // then we basically add star in between that values. or means at 1st index.
                return s.charAt(0)+"*"+smallString; // here we add star after checking the values are same;
            }else{ // if the values were not same then we simply return the original value of the string without any change;
                return s.charAt(0)+smallString;
            }
          
    
        }
        public static void main(String[] args) {
            String s = "abbaabbcc";
            System.out.println(addStars(s));
        }

    
}
