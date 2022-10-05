package Milestone1Lecture7;

import java.util.Scanner;

public class AssignmentQuestionDecimalToBinary {

    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        
        int n = scn.nextInt();
        
        // int num = n;
        
        // long pv = 0;
        
//         n = 7
//             1   1  1
//             2^2    2^1   2^0 = 4 + 2 + 1
        
//         7 -----> 1 => 7/2
//         3 -----> 1 => 3/2
//         1 -----> 1
        
//         12 ---> 0
//         6 ----> 0   0*10 + 0 = 0
//         3 -----> 1  1*100 + 0 => 100
//         1 -----> 1  1*1000 + 100 = 1100
        
//         int tensPower = 1;
//         while(num > 0){
//             long rem = num % 2;
            
//             num = num /2;
            
//             pv = rem*tensPower + pv;
            
//             tensPower =  tensPower*10;
//         }

//         System.out.print(pv);
        
        long ans = 0;
        for(int i=31;i>=0;i--){
            if(((n>>i)&1)==1)ans = ans*10+1;
            else ans = ans*10;
        }
        
        System.out.print(ans);
    }
    
}
