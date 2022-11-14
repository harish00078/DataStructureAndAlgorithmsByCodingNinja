package MileStone4.MileStone4Lecture37;

import java.util.Scanner;

public class Graphs {

    // here we are implementing a graph through: adjancey matrix:

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        // for implementing a graph through adjancency matrix or also for implementing graph:
        // we need two things vertices and edges:


        // so for getting vertices from the user we can use the (n);
        int n = s.nextInt();
        // so for getting edges from the user we can use the (e);
        int e = s.nextInt();
        
        // after getting the input of the vertices and edges:
        // know we can create the graph using adjanency matrix:

        // 1 = so for we can we need the(2d) array of the size of (n*n):
        int adjMatrix [][] = new int[n][n];
        // 2 = after that we need the edges of the graph;
        for(int i=0; i < e; i++){
            // 3 = so for defining edges we need two vertices:
            // 4 = starting vertex and end vertex of a particular edge:
            int v1 = s.nextInt();
            int v2 = s.nextInt();
            // 5 = after that we have to define the edge  values in the 2d array:that which vertices have edges:
            // 6 = for that we can simply  do that: if v1 vertex is equal or connected to v2 vertex then we put (1) in the 2d array on that two vertices space:
            adjMatrix[v1][v2] = 1;

            // 7 = same we have to do for the  v2 and v1 vertices: if they are connected then we also had to put (1) on that vertices spaces in the 2d array:
            adjMatrix[v2][v1] = 1;

        }

            // here we try to print our graph:
            // for that we need the two for loops:
            for(int i = 0; i < n; i++){
                for(int j =0; j<n; j++){
                    System.out.print(adjMatrix[i][j] + " ");
                }
                System.out.println();
            }




    }
}
