package Milestone1Lecture7;

public class BitwiseOperator1Question {

    public static void main(String[] args) {
        
        int a = 10,b = 20;
        int c = a & b;
        System.out.print(c);
        int d = a | b;
        System.out.print(d);
        int e = a ^ b;
        System.out.print(e);
        int f = c + d + e;
        System.out.println(~f);
    }
    
}
