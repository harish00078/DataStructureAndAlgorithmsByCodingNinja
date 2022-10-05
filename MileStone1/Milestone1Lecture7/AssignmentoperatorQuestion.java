package Milestone1Lecture7;

public class AssignmentoperatorQuestion {

    public static void main(String[] args) {
        int a = 5;
        a += 5+(++a)+(a++); // here we have output of 22 .beacuse when we add a+5.after when we jump on (a++) and (++a) these both will become 6 + 6.
        System.out.println(a);
    }
    
}
