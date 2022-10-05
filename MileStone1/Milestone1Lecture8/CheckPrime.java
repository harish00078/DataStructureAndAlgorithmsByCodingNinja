package Milestone1Lecture8;

import java.util.Scanner;

public class CheckPrime {

    public static boolean PrimeNumberCheck(int n){

        int div = 2;
        boolean isprime = true;
        while(div <=  n/2){
            if(n % div == 0){
                isprime = false;
                break; // here we can also use the break statement.
                // instead of using return value.
                // but this will only work acc to the function sequnce.
            }
            div = div + 1;
        }
        return isprime;
        
    }

    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        boolean isprime = PrimeNumberCheck(n);
        System.out.println(isprime);
    }
    
    // public static boolean PrimeNumberCheck(int n){

    //     int div = 2;
    //     while(div <=  n/2){
    //         if(n % div == 0){
    //             return false;
    //         }
    //         div = div + 1;
    //     }
    //     return true;
        
    // }

    // public static void main(String[] args) {
    //     int n;
    //     Scanner s = new Scanner(System.in);
    //     n = s.nextInt();
    //     boolean isprime = PrimeNumberCheck(n);
    //     System.out.println(isprime);
    // }
    
}
