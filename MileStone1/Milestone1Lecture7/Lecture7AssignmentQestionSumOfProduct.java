package Milestone1Lecture7;

import java.util.Scanner;



public class Lecture7AssignmentQestionSumOfProduct {

    public static void main(String[] args) {
        
        
    Scanner s = new Scanner(System.in);

    int n = s.nextInt();
    int c = s.nextInt();

    int i = 1;
    int pro = 1;
    int x = 1;
    int sum = 0;


    
    

    if(c == 1){
            
        while(x <= n){
            sum = sum + x;  
            x = x+1;   
        }
        System.out.println(sum); // in this way we can find the sum of (n) numbers
        
    }else if(c == 2)
    {
        
        
       while(i <= n){
           pro = pro * i;
           // n  = n/10;
           i++;
       }
       System.out.println(pro); // In this way we can find the Product OF (n) numbers
        
    }else{
        System.out.println(-1);
    }

System.out.println();
  i++;


    
    
    }




    
}
