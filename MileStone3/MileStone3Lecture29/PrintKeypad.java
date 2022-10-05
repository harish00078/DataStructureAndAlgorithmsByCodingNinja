package MileStone3.MileStone3Lecture29;

import java.util.Scanner;

public class PrintKeypad {

    // here we create option function: that we can use in our keypad function:
    public static String getOptions(int digit){

        if(digit == 2){
            return "abc";
        }
        if(digit == 3){
            return "def";
        }
        if(digit == 4){
            return "ghi";
        }
        if(digit == 5){
            return "jkl";
        }
        if(digit == 6){
            return "mno";
        }
        if(digit == 7){
            return "pqrs";
        }
        if(digit == 8){
            return "tuv";
        }
        return "wxyz";
    }

    // after that here we are creating our printkeypad combination function;
    public static void  printkeypadCombinations(int input, String stringSoFar){
        if(input == 0){
            System.out.println(stringSoFar);
            return;
        }
        int lastDigit = input % 10;
        int smallInput = input/10;
        String optionsLastDigit = getOptions(lastDigit);
        for(int i = 0; i < optionsLastDigit.length(); i++ ){

            printkeypadCombinations(smallInput, optionsLastDigit.charAt(i) + stringSoFar);
        }
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("enter the number");
        int input = s.nextInt();
        printkeypadCombinations(input, "");
    }


    
}
