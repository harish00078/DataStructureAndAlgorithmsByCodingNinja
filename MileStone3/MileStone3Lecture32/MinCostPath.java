package MileStone3.MileStone3Lecture32;


public class MinCostPath {

    // this is only the recursion solution:

    public static int minCostPath(int cost[][],int i,int j){
        // here we are definig our m*n matrix:
        // here we create m or n varaible and gave them a values:
        // here (m) is number of rows:
        // here (n) is number of columns:
        int m = cost.length; // here (m) will we equal to the (cost.lenght)
        int n = cost[0].length; // and (n) will we equal to the (cost[0].length)

        // here we have our specail case:for check that we reach the end point:
        // here we right that when (i) check equal to the (m-1): or (j) check equal to the (n-1):
        // its means we reach the end cell of the martrix:
        // or we can aslo say that we completed our path:
        if(i == m-1 && j == n-1){
            return cost[i][j]; // after that we can simply return the value of cost[i][j]:
        }

        // here we have base case:
        // if i or j get greater then equal value to the m * n matrix: 
        if(i>=m || j >=n){
            return Integer.MAX_VALUE; // then we simply have to return the infinite value:
        }

        // here we are calculating the paths min cost from the each of the three sides:
        // basically we are exploring the each side: for calculating the paths minimum cost:
        int ans1 = minCostPath(cost, i+1, j);
        int ans2 = minCostPath(cost, i, j+1);
        int ans3 = minCostPath(cost, i+1, j+1);

        // and after exploring the each side of the matrix:
        // we have to find the minimum amongs them;
        // and after finding minimum amongs them we have to add that minimum with starting cell value:
        int myAns = cost[i][j] + Math.min(ans1, Math.min(ans2, ans3));
        // and after adding them with  each other we can simply return that value:
        return myAns;

    }

    public static void main(String[] args) {
        
        int [][] cost = {{1,5,11},{8,13,12},{2,3,7},{15,16,18}};
        int ans = minCostPath(cost,0,0);
        System.out.println(ans);
    }
    
}
