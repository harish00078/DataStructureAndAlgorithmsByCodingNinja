package MileStone4.MileStone4Lecture37;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFTGraphs {

  public static void bfTraversal(int adjMatrix[][]) {
    // here we have to use the (queue) to keep track on the pending-vertices:
    // In java (queue) is just a Interface.for building (queue) we need the
    // (linkedlist).so we have to create a (queue) through linkedlist:
    Queue<Integer> pendingVertices = new LinkedList<>();

    // we also have to track on the visited-vertices:
    // for that we can use the (boolean):
    boolean visited[] = new boolean[adjMatrix.length];

    // first we have to mark the source-value as (visited);
    visited[0] = true;

    // after that we also had to add it on the (pendingVertices) queue .because yet
    // we did not explore its further-vertices:
    pendingVertices.add(0);

    // after adding (source-vertex) in the (pending-vertices). we have to print the
    // currentVertexs of the (pending-vertices) until (pendingVertices is not
    // empty).
    while (!pendingVertices.isEmpty()) {
      int currentVertex = pendingVertices.poll();
      System.out.println(currentVertex + " ");
      // and after that we have to explore its all further unvisited vertices:
      for (int i = 0; i < adjMatrix.length; i++) {
        // for that we have to check that the (current-vertices) is the neighbours of
        // the (i)th vertexs:
        // and also we have to take care of that the (i)th vertex should not be already
        // visited:
        if (adjMatrix[currentVertex][i] == 1 && !visited[i]) {
          // if that's the case.then we have to put that (vertex) in the
          // (pending-vertices)queue.so that it can we explored:
          pendingVertices.add(i);
          // after putting it into the (pending-vertices).we can put it into the (visited)
          // boolean as well.so it cannot we visited again:
          visited[i] = true;

        }
      }
    }
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

    // here we are using the Breadth first traversal method:
    bfTraversal(adjMatrix);
  }
}
