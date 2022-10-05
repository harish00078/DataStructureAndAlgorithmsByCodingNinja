package MileStone1Lecture11;

public class AssignmentProblemTotalSumOnTheBoundariesAndDiagonals {

    public static void totalSum(int[][] arr) {
		//Your code goes here
        int requiredSum = 0;
         int N = arr.length;
        // Traverse arr[][]
        // Loop from i to N-1 for rows
        for (int i = 0; i < N; i++) {
     
            // Loop from j = N-1 for columns
            for (int j = 0; j < N; j++) {
     
                // Condition for diagonal
                // elements
                if (i == j || (i + j) == N - 1) {
                    requiredSum += arr[i][j];
                }
     
                // Condition for Boundary
                // elements
                else if (i == 0 || j == 0 || i == N - 1|| j == N - 1) {
                    requiredSum += arr[i][j];
                }
            }
        }
     
        // Return the final Sum
        System.out.print(requiredSum);
        return ;
    }
    
}
