package MileStone2.AssignmentProblemOfRecursion;

public class CountZerosUsingRecursion {

    public static int countZero(int input){

        if(input <= 10){
            // this is the calculation that we do for our self:
            if(input == 0){
                return 1; // here we return one because we only check the one value or the string array. 
            }else {
                return 0; // if  we did not have zero then we return the zero;
            }
            
        }
        // here we call the recursion  for count zero in the other left of array:
        if(input % 10 == 0){ // here it check we have zero remainder if we have zero remainder.
            // means we have zero in the input .
            return countZero(input/10) + 1; //after that we simply add 0 with 1. if we have zero .and return (1).
            // this sequnce will continue until we did not find all the zero in the array string.
        }else{
            return countZero(input/10);//if it is not  have   zero then  we simply return it division output:
        }
    }

    public static void main(String[] args) {
        
       int input = 1202309090;
       System.out.println(countZero(input));
    }
    
}
