package MileStone3.MileStone3Lecture29;

import java.util.Scanner;

public class PrintSubSequences {

    public static void PrintSubsequences(String input, String stringSoFar){
        // here we have our base case:
        if(input.length() == 0){ // if input lenght check zero:
            System.out.println(stringSoFar); // then we simply print the value of the stringSOFar:
            return;
        }

        // here we create other variable name with smallInput:
        // here we use smallINput variable value  for the  recursion:
        // because we want call the recursion on the input index number(1) to last Index value:
        String smallInput = input.substring(1);  // here we create that variable:
        PrintSubsequences(smallInput, stringSoFar); // here we call recursion on the input index (1) value to the input index last value:
        // here we call recursion again on the smallInput value but with input index(0):
        PrintSubsequences(smallInput, stringSoFar + input.charAt(0));
        // so here we create all the subsequnces values  of the given String:
    }

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.println("enter string");
        String input = s.next();
        PrintSubsequences(input, "");
    }
}
