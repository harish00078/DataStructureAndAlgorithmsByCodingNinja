package MileStone1Lecture11;

public class ProblemLargestRowORColumn {

    // this problem will work acc to its question or main fucntion.
    // watch hint video for  better understanding of this question.

    // here we have to define that which row or column have the largest value.

    
	public static void findLargest(int mat[][]){
		int m = mat.length;
        if(m==0){
        	System.out.print("row "+m+" -2147483648");
          	return;  
        }    
        int n = mat[0].length;
        int row = Integer.MIN_VALUE;
        int column = Integer.MIN_VALUE;
        int indexi = 0;
        int indexj = 0;
        for(int i=0; i<m; i++){
            int sum = 0;
            for(int j=0; j<n; j++){
                sum += mat[i][j];
            }
            if(sum>row){
                row = sum;
                indexi = i;
            }
        }
        for(int j=0; j<n; j++){
            int sum = 0;
            for(int i=0; i<m; i++){
                sum += mat[i][j];
            }
            if(sum>column){
                column = sum;
                indexj = j;
            }
        }
        if(column>row){
            System.out.print("column "+indexj+" "+column);
        }
        else{
            System.out.print("row "+indexi+" "+row);
        }
        
	}
    
}
