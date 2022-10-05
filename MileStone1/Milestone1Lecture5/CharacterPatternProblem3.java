package Milestone1Lecture5;
import java.util.Scanner;

public class CharacterPatternProblem3 {

    public static void main(String[] args) {
                
        Scanner scn = new Scanner(System.in);
        
        int n = scn.nextInt();
        
        int i = 1;
        
        while(i <= n){
            int j = 1;
            char ch = (char)('A' + n - i); // here we reverse the alphabet system.for printing reverse alphabet triangle pattern.
            while(j <= i){
                  
                
                System.out.print(ch);
                ch++;
                j++;
            }
            System.out.println();
            i++;
        } 
        
    }
    
}
