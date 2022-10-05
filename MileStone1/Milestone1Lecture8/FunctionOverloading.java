package Milestone1Lecture8;

import javax.sound.sampled.BooleanControl;

public class FunctionOverloading {

    // function overloading means that we can write the one function in many ways and having  a mutliple outputs.

    // for eaxmple like

    // find number two sums:

    public static int sum(int a , int b){
        int result = a + b;
        return result;
    }

    // we can also add the add two boolean numbers

    public static double sum(double a , double b){
        double result = a + b;
        return result;
    }

    public static int sum(int a){

        return a + 1; // if user only want to gave a one input.
    }

    public static void main(String[] args) {
        
        int a = 10;
        int b = 5;

        // here we have different outputs of the functions.
        System.out.println(sum(a));
        System.out.println(sum(a, b));
        System.out.println(sum(10.6, 1.8));
    }

    
}
