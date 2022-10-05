package Milestone1Lecture8;

public class QuestionOfScopeOfVariable1 {

    public static void func(int a) {
        int b = a;
        b = b +10;
        
    }
    public static void main(String[] args) {
        int a =10;
        func(a);
        // System.out.println(b);
    }
    
}
