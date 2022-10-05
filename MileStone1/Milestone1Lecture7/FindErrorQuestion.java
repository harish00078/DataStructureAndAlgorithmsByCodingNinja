package Milestone1Lecture7;



public class FindErrorQuestion {

    public static void main(String[] args) {
        int a = 10,b = 20;
        System.out.println(a++ + --b);//line1
        System.out.println(a-- + ++b);//line2 // this line gave us a error.beacuse compiler get confuse with (+++) triple increment operators.

        System.out.println(a++ - ++b);//line3
        System.out.println(a++ + ++b);//line4// this line also gave us a error.here also complier get confuse beacuse of (+++++) five increment operators.
         
    }
    
}
