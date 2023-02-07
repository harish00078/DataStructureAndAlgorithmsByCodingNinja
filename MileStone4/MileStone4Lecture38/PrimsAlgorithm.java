package MileStone4.MileStone4Lecture38;

import java.util.Scanner;

public class PrimsAlgorithm {



  // here we create (findMinVertex) function:
  private static int findMinVertex(boolean[] visited, int[] weight) {
    int minVertex = -1;

    for (int i = 0; i < visited.length; i++) {
      if (!visited[i] && (minVertex == -1 || weight[i] < weight[minVertex])) {
        minVertex = i;
      }
    }
    return minVertex;
  }




  /// here we have our prim's algorithm:
  public static void prims(int adjMatrix[][]) {
    int n = adjMatrix.length;
    boolean visited[] = new boolean[n];

    int parent[] = new int[n];
    int weight[] = new int[n];

    // default values:if source vertex is (0):

    parent[0] = -1;
    weight[0] = 0;

    for (int i = 1; i < n; i++) {
      // here we set weight of all other vertices to (infinite).instead of (0):
      // because we did not visited them:
      weight[i] = Integer.MAX_VALUE;
    }

    for (int i = 0; i < n; i++) {
      // here we are getting the (minVertex)  from the (unvisited) vertices:
      //  minVertex is which that also should have  a (minimum weight):

      int minVertex = findMinVertex(visited, weight);

      // after gettiing minVertex: know we have to mark it to (visited):
      visited[minVertex] = true;

      // and then we have to explore its further neighbors (vertices):
      for (int j = 0; j < n; j++) {
        // we only explore futher neighbors  of the (minvertex):if they are not equal to the (0): means if they are not (explored) yet:
        // and they also not (visited) yet:

        if (adjMatrix[minVertex][j] != 0 && !visited[j]) {

          // after that we only use the  vertex in (mst):
          // if it has lesser weight:then the its already visited or present (edge):

          if(weight[j] > adjMatrix[minVertex][j]){

            weight[j] = adjMatrix[minVertex][j];
            parent[j] = minVertex;

          }

        }
      }
    }

    // here we have our (MST): or we can say printing our (MST):
    for (int i = 1; i < n; i++) {
      if (i < parent[i]) {
        System.out.println(i + " " + parent[i] + " " + weight[i]);
      } else {
        System.out.println(parent[i] + " " + i + " " + weight[i]);
      }
    }


  }






  // here we have our main-file:
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int n = s.nextInt();
    int e = s.nextInt();

    /// here we create a n * n (adjMatrix):

    int adjMatrix[][] = new int[n][n];

    // here we run for-loop from (0 to lessthan  edges):
    for (int i = 0; i < e; i++) {
      // here we get our both the (vertices)

      int v1 = s.nextInt();
      int v2 = s.nextInt();

      // here we get our (weight) for the vertices:
      int weight = s.nextInt();

      // here we create (graph) through adjMatrix:

      // if [v1] [v2] vertices are (connected):then we have to put there (edges) weight in the adjMatrix:

      adjMatrix[v1][v2] = weight;
      adjMatrix[v2][v1] = weight;
    }

    prims(adjMatrix);
  }
}
