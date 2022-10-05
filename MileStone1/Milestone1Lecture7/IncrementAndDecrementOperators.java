package Milestone1Lecture7;


public class IncrementAndDecrementOperators {

    public static void main(String[] args) {

        int a = 60, b = 80;

        // increment decrement operators are working acc to the equations.
        // also working acc to the post or pre increment and decrement operators.
        // for example:
        // 1. means this two AND operators equations were work differently.
        // if(a++ > 60 && b++ > 80)// here it only execute the (a) variable values 
        // if(++a > 60 && b++ > 80)// here it execute the (a) and (b) variables values.
        // 2. means this two OR operators equations were work differently
        // if(a++ > 60 || b++ > 80) // here it  execute both variables values.
        if(++a > 60 || b++ > 80) //  here it onlu execute the (a) vraibles values.


        {
            System.out.println(" inside if");
        }else{
            System.out.println("inside else");
        }
        System.out.println("a" + a + "b" + b);
        
        // int a = 60;
        // a = a + 1; //this is the one way to use increment and decrement operator.
        // int b = a++; //this is the other way to use the increment and decrement Operator.
        // System.out.println(a);
        // System.out.println(b);
    }
    
}
