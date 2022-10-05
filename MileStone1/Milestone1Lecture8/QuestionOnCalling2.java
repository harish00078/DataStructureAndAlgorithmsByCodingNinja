package Milestone1Lecture8;

public class QuestionOnCalling2 {

    public static void func2(){
        System.out.print("#");
    }
    public static void func1(){
        System.out.print("*");
        func2();
    }

    public static void main(String[] args) {
        func2();
        func1();
    }
    
}
