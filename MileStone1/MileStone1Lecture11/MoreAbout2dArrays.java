package MileStone1Lecture11;

public class MoreAbout2dArrays {

        // here learn more about how the 2d array working and how it  store values in it.
    public static void main(String args[]) {
        // int[][] = new int[3][5];
        // System.out.pritnln(arr[0][0]);

        // int[][] arr = new int[4][];
        // System.out.pritnln(arr);

        // for(int i=0;i<arr.length;i++){
        //     System.out.println(arr[i]);
        // }
        // System.out.pritnln(arr[0][0]);

        // for(int i=0;i<arr.length;i++){
        //     arr[i]=new int[5];
        // }


        // here we print the jagged arrays.
        int[][] arr = new int[4][];

        for(int i=0;i<arr.length;i++){
            arr[i]=new int[i+2];
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");  // the output pattern of this array is called  a jaggad array.
                // because it has a different numbers columns in each row.
            }
        }System.out.println();
        
    
    }

}
