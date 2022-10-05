package Milestone1Lecture5;

import java.util.Scanner;

public class CharacterPatternproblem1 {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int i = 1;
    
        while(i <= n){
            int j = 1;
            
            while(j <= i){
                
                char alphachar = (char)('A' + i - 1);  // here we (i) to print this pattern. because if we use the (j) we will not we able to print the B B pattern and soon.
                //because when ever (j) came from the ith loop its value will starts from (1) and it will start printing the pattern from('A'). that's why we use (i) to print this pattern.
                // beacuse (i) will do not chnage it value by (1) in second loop . and will gave us B B pattern and soon.
               
               
                System.out.print(alphachar);
                j++;

            }
            System.out.println();
            i++;

        }
    }
    
}
