package milestone1lecture4;

import java.util.Scanner;

public class AssignementQuestionSumOfEvenAndOdd {

    public static void main(String[] args) {

             
        Scanner s = new Scanner(System.in);
            
            int n;
        
        n = s.nextInt();
        
      //  n = reverse(n);
        
        int sumOdd = 0, sumEven = 0;
 
        while (n > 0) {
              int temp=n%10;
            if (temp % 2 == 0){
                
                sumEven += temp;
                
                
                
            }else{
                sumOdd += temp;
                
            }
               
            n /= 10;
            //c++;
        }
 
      //  System.out.println(sumOdd);
        System.out.println(sumEven+" "+sumOdd);
        

    }
    
}
