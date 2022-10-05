package Milestone1Lecture8;

public class UpdatingTheValue {

    // correct way of writing the function in sequnce.
    
    // for example:

    public static int increment(int n){
        n++;
        return n; // if we want to use the create functions output in the main function we have to print it with any statement.
    } 
    public static void main(String[] args) {
        
        int n = 10;  
        int ans = increment(n); // here we always check that what kind of varaible our main function uses.
        // beacuse the function that we created and the main function have on identity of there variables.
        // if the both variables are same.
        //for example :
        // (n) of function that we created it has its on identity or storage.
        // (n) of main function have it on identity or storege thatS why they are different.
        System.out.println("main" + ans);
    }

    
}
