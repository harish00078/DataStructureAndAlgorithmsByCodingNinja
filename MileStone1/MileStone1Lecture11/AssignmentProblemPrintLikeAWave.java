package MileStone1Lecture11;

public class AssignmentProblemPrintLikeAWave {
     
    /// here we have print the array in the wave manner;

    //  i.e, print the first column top to bottom, next column bottom to top and soon.

    public static void wavePrint(int mat[][]){
        //Your code goes here
        int row=mat.length;
        if(row==0)return;
        int col=mat[0].length;
        int x=0;
        for(int i=0;i<col;i++){
            if(x==0){
                for(int j=0;j<row;j++){
                    System.out.print(mat[j][i]+" ");
                    x++;
                }
            }
            else{
                for(int j=row-1;j>=0;j--){
                    System.out.print(mat[j][i]+" ");
                    x--;
                }
            }
        }
    }
    
}
