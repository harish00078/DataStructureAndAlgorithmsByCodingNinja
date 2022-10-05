package Milestone1Lecture8;

import java.util.Scanner;

public class ScopeOfVariable {
    
    // learn more about the scope of variable in function by the coding ninjas (funcrtion notes)


        // for example how the scope or variable work in the create a fucntion.
        // for example if we want to calculate ncr value:

        // IN basicallu simple way how the void and other datatypes work:
        // = void with printing statements:
        // a. system.out.println statement will only run with void function.
        // b. it will only show the output. donot store it any where thats why we did not use it further.
        // c .return statement will not work with the void function
        // = when we use datatypes in function.
        // a. only retrun statement will work with datatypes function.
        // b. in return statement it will gave us a output in the storage. that why we use it further.
        // c. system.out.println statement will not  work with the (int) like datatype functions.

    public static int factorail(int num){
        int fact = 1;

        for(int i = 1; i <= num; i++){
            fact = fact * 1;

        }
        // => using void function
        // return fact; here we can see that in void function we did not use the return statement beacuse void function will print the value not the store the value in it;
        // that why when we use void function we use the (system.out.println) function.

        // using data types like(int, double ,etc)
        // System.out.println(fact); // when we use the any datatypes in function we can also did not use the (system.out.println)Statement. 
        // beacuse it will only print the value not save that value that why we did not use that value further.

        return fact; // only the return  statement will gave the output with storage system .that we use futher.
    }
    public static int ncr(int n , int r){
        int factN = factorail(n);
        int factR = factorail(r);
        int factNR = factorail(n - r);
        int result = factN / (factR * factNR);
        return result;
    }
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int r = s.nextInt();
        int result = ncr(n, r);
        System.out.println(result);
    }

    
    
}
