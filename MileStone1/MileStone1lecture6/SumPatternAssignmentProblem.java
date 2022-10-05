package MileStone1lecture6;

import java.util.Scanner;

public class SumPatternAssignmentProblem {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        int currRow = 1;
        int sum = 0;
    
        while(currRow <= n) {
            sum += currRow;
            int currCol = 1;
            while(currCol <= currRow) {
                System.out.print(currCol);
                if(currCol == currRow) {
                    System.out.print("=");
                } else {
                    System.out.print("+");
                }
                currCol += 1;
            }
            
            System.out.println(sum);
            currRow += 1;
        }
    }
    
}
