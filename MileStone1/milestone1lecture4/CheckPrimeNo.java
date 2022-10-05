package milestone1lecture4;

import java.util.Scanner;

public class CheckPrimeNo {

    public static void main(String[] args) {

        // prime =  prime numbers are those numbers that are divisible by one or its own numbers.
        
        Scanner s = new Scanner(System.in);

        int n;


        n = s.nextInt();

        int div = 2;  //we started divisible with 2.because 1 can we divisible with any number. and it also a prime number(1).
        boolean isPrime = true; // here we gave a condition that boolean is prime beacuse. when we have the answer in the decimal number.its means that it not have a remiander zero.without using the decimal number.
        while(div <= n-1){   // here we gave a condition that.check the user input.if it is in the condition then continous with the loop.if it is not then terminated the loop.
            if(n % div == 0){   //after checking the number. it will check that if the remainder is zero.then it is not prime.
                isPrime = false;
            }
            div = div + 1;// after that it will add one to the (n) number to check that the other (n) numbers are prime or not.
        }
        if(isPrime){   // if the remainder is not zero then it will print output as "prime"
            System.out.println("prime");
        }else{  // if the reminder is zero it will print output "composite"
            System.out.println("composite"); // Composite => Numbers that have more than two factors.or it will also means that it can be divisible by other numbers.
        }
        
        
    }    


  

}
