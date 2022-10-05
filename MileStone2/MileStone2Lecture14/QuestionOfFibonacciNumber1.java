package MileStone2.MileStone2Lecture14;

public class QuestionOfFibonacciNumber1 {

    public static int func(int num){  // this function will gave us a stackoverfollow error.
        // because here we did not define the base case for the function.
        // andit will run on infinite loop.
        return func(num- 1);
    }
    
    public static void main(String[] args) {
        int num = 5;
        int ans = func(num - 1);
        System.out.println(ans);
    }
    
}
