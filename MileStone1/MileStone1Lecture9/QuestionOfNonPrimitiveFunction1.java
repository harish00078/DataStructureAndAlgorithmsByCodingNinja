package MileStone1Lecture9;

public class QuestionOfNonPrimitiveFunction1 {


    public static void mul(int arr[]){
        for(int i = 0; i < 5; i++)
        arr[i] *= i;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        mul(arr);
        for(int i = 0; i <5; i++){
            System.out.println(arr[i]);
        }
    }
    
}
