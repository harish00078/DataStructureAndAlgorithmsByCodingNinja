package Milestone1Lecture8;

public class QuestionOfpassByValue2 {

    public static void func1(int a,int b){
        int ans = 1;
        for(int i = 0;i < b;i++){
            ans *= a;
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        func1(2, 5);
    }
    
}
