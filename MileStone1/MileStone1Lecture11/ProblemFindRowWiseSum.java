package MileStone1Lecture11;

public class ProblemFindRowWiseSum {

    
    // this problem will work acc to its question or main fucntion.
    // watch hint video for  better understanding of this question.

    // here we find the row wise sum of the 2d array.

    public static void FindRowWiseSum(int [][] mat){
        int nRows = mat.length;

        if(nRows == 0){
            return;

        }

        int mColms = mat[0].length;

        for(int i = 0; i < nRows; i++){
            int rowSum = 0;
            for(int j = 0; j < mColms; j++){
                rowSum += mat[i][j];
            }
            System.out.println(rowSum + " ");
        }
    }


    
}
