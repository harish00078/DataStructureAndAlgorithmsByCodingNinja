package SolveProblems;

public class ReturnProblem {

    public static void main(String[] args) {
        
        int i = 10;
        while((i=i-1)>0){
            System.out.println(i);
            if(i%5==0)
            return;
        }
    }
    
}
