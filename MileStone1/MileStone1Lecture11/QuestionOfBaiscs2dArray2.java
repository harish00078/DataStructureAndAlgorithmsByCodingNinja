package MileStone1Lecture11;

public class QuestionOfBaiscs2dArray2 {

    public static void main(String[] args) {
        
        int arr [][] = new int[4][5];

        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 5; j++){
                arr[i][j] = i*j;
            }
        }
        System.out.println(arr[3][4]);
    }
    
}
