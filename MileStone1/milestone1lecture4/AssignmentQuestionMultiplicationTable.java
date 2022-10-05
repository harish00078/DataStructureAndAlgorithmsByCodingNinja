package milestone1lecture4;

import java.util.Scanner;

public class AssignmentQuestionMultiplicationTable {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        int N;
        
        N  = s.nextInt();
        
        int i = 1;
        while(i <= 10){
            System.out.println(N*i);
            i++;
        }
    }
    
}
