package MileStone1Lecture9;

public class QuestionOfNonPimitiveFunction2 {

    public static void change(int input[]){
        input[0] = 15;
    }

    public static void main(String[] args) {
        
        int arr [] = new int [5];
        change(arr);
        System.out.println(arr[0]);
    }
    
}
