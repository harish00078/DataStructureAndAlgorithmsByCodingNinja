package MileStone4.MileStone4Lecture37;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class ProblemHasPath {

  // here we are creating a function that we use to check that the (path) is
  // present in the graph or not:
  public static boolean hasPath(int[][] edges, int v1, int v2, boolean visited[]) {
    if (v1 > edges.length || v2 > edges.length) {
      return false;
    }
    if (edges[v1][v2] == 1) {
      return true;
    }

    Queue<Integer> q = new LinkedList<>();
    q.add(v1);
    visited[v1] = true;
    while(!q.isEmpty()){
      int n = q.remove();
      for(int i = 0; i <edges.length;i++){
        if(edges[n][i] == 1 && !visited[i]){
          q.add(i);
          visited[i] = true;
        }
      }
    }
    // after visiting the particular root of the graph.know we have to check that the (v2) vertex is present in that root:
    
    if(visited[v2] == true){
      // if it is present then we have to return the (true): 
      return true;
    }else{
      // if it is not then we have to return the (false):
      return false;
    }

  }

  // here we have our (main) file:
  public static void main(String[] args) throws NumberFormatException, IOException {
    Scanner s = new Scanner(System.in);
    int V = s.nextInt();
    int E = s.nextInt();
    int edges[][] = new int[V][V];
    for (int i = 0; i < E; i++) {
      int sv = s.nextInt();
      int ev = s.nextInt();
      edges[sv][ev] = 1;
      edges[ev][sv] = 1;

    }
    int v1 = s.nextInt();
    int v2 = s.nextInt();
    if (v2 >= V) {
      System.out.println("false");
      return;
    }

    boolean visited[] = new boolean[V];
    boolean ans = hasPath(edges, v1, v2, visited);
    System.out.println(ans);

  }
}
