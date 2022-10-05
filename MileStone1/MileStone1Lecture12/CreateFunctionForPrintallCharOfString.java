package MileStone1Lecture12;

import java.util.Scanner;

public class CreateFunctionForPrintallCharOfString {

    //  here we create the funcion for printing the characters in the string.

      
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        printChars(str);
        
    }
    
    // here we create fucntion for printing the all the character in the string.
    public static void printChars(String str){
        for(int i=0;i<str.length();i++){
            System.out.println(str.charAt(i));
        }
    }
    
}
