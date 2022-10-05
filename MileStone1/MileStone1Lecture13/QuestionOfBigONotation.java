package MileStone1Lecture13;

public class QuestionOfBigONotation {

    public static void func(int n){
    int sum=0;
    for(int i=1;i<n;i++)
        {
            for(;i<n*n;i++)
            {
                sum+=i;
            }
        }
     System.out.println(sum);
    }
    public static void main(String[] args) {
        
        func(3);
    }
    
}
