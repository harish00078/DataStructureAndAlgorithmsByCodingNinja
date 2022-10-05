package Milestone1Lecture7;

public class GuessTheOutputForLoopVariation {

    public static void main(String[] args) { // the values which are divisible by 3 would result in finite loop.
        for(int i = 483 ; i > 0; i = i % 3){
            System.out.println("*");
        }
    }
    
}
