package SolveProblems;

import java.util.Scanner;

public class SumOfEvenAndOdd {
	
	public static void main(String[] args) {
		// Write your code here
        
        Scanner s = new Scanner(System.in);
            
            int n;
        
        n = s.nextInt();
        
      //  n = reverse(n);
        
        int sumOdd = 0, sumEven = 0;
 
        while (n > 0) {  // firstly here we check the number that is given by the user.
              int temp=n%10;  // here we do the module operation of the (n) numbers this will gave us a single number remainder of the last (n) number because we use the (n%10).
              // when we do n%10 with any number this will gave us a last of that numbers as  a remainder.
              // and using this method we only have  a one number to compare.in this way our number sequnce will work.  
            if (temp % 2 == 0){ // he we compare that remainder. that we have from that (n) numbers.
                
                sumEven += temp; // here it will add the even numbers.(this function show that => [sumeven = sumeven + temp] ). 
                
                
                
            }else{
                sumOdd += temp; // here it will add the odd numbers
                
            }
               
            n /= 10;  // (n/10) will cut the value of the (n) numbers by one. 
            // because when we divide any number with 10 it will cut its last number of that number series. 
            // it we will cut the n numbers value one by one . and this way our number sequence will we completed.
            //c++;
        }
 
      //  System.out.println(sumOdd);
        System.out.println(sumEven+" "+sumOdd);
    }


}
