package MileStone4.MileStone4Lecture37;

import java.util.Scanner;

public class Graphs {

    // here we are implementing a graph through (depth first traversal) method:

    // here we are writing the code for our (bepth first traversal) code:
    // we creaate this other function because: we always have to track our current
    // vertex:because of the recusion method that we are using in this method acc to
    // our code logic:
    public static void dftraversal(int adjMatrix[][], int currentVertex, boolean visited[]) {
        // here we put (true) in the boolean array of that visited vertex:
        visited[currentVertex] = true;
        // firslty we have check that which is our current vertex:
        System.out.print(currentVertex + " ");
        // after checking the current vertex:
        // 1 = know we have to find out its nearest vertex in its current vertex matrix:
        // 2 = the nearest vertex is that vertex which had (one) in it:
        for (int i = 0; i < adjMatrix.length; i++) {

            if (adjMatrix[currentVertex][i] == 1 && visited[i] == false) {
                // 1 = we also have to check;  that this vertex is not visited already:

                // 1 = if in current vertex's adjmatrix first vertex is have (one):
                // 2 = then means that (i) vertex is the nearest value of the current vertex:
                // 3 = if its not the case then we explore other vertices  of that current vertex's adjmatrix through recursion:
                dftraversal(adjMatrix, i, visited);
            }
        }

    }

    // we use that method only for input and output:
    public static void Dftraversal(int adjMatrix[][]) {
        // we also have to create the other boolean array that we use to track of our
        // vertices:
        // 1 = so we did not go on the same vertex again and again while we are checking
        // for the other vertices:
        // 2 = we use boolean array that will we the length of our adjmatrix:
        // 3 = when we visted the particular vertex: we simply put true in that vertex's
        // boolean array: so we did not go again on that same vertex:
        boolean visited[] = new boolean[adjMatrix.length];

        // under this method here we use the other methed were we write our (depth first
        // traversal) code:
        dftraversal(adjMatrix, 0, visited);
    }

    // here we are implementing a graph through: adjancey matrix:

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        // for implementing a graph through adjancency matrix or also for implementing
        // graph:
        // we need two things vertices and edges:

        // so for getting vertices from the user we can use the (n);
        int n = s.nextInt();
        // so for getting edges from the user we can use the (e);
        int e = s.nextInt();

        // after getting the input of the vertices and edges:
        // know we can create the graph using adjanency matrix:

        // 1 = so for we can we need the(2d) array of the size of (n*n):
        int adjMatrix[][] = new int[n][n];
        // 2 = after that we need the edges of the graph;
        for (int i = 0; i < e; i++) {
            // 3 = so for defining edges we need two vertices:
            // 4 = starting vertex and end vertex of a particular edge:
            int v1 = s.nextInt();
            int v2 = s.nextInt();
            // 5 = after that we have to define the edge values in the 2d array:that which
            // vertices have edges:
            // 6 = for that we can simply do that: if v1 vertex is equal or connected to v2
            // vertex then we put (1) in the 2d array on that two vertices space:
            adjMatrix[v1][v2] = 1;

            // 7 = same we have to do for the v2 and v1 vertices: if they are connected then
            // we also had to put (1) on that vertices spaces in the 2d array:
            adjMatrix[v2][v1] = 1;

        }

        // here we try to print our graph:
        // for that we need the two for loops:
        // for(int i = 0; i < n; i++){
        // for(int j =0; j<n; j++){
        // System.out.print(adjMatrix[i][j] + " ");
        // }
        // System.out.println();
        // }

        // here we are using the depth first traversal method:
        Dftraversal(adjMatrix);

    }
}
