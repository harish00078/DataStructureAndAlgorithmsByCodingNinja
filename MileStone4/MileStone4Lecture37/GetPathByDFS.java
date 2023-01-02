package MileStone4.MileStone4Lecture37;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class GetPathByDFS {

  // here we haave main file for the problen:
  public static void main(String[] args) throws NumberFormatException, IOException {
    Scanner s = new Scanner(System.in);
    int V = s.nextInt(); // here V is the no. of vertices
    int E = s.nextInt(); // here E is the no. of edges
    int edges[][] = new int[V][V]; // we have created an adjacency matrix of v*v
    // taking input for the graph, loop through the edges
    for (int i = 0; i < E; i++) {
      int sv = s.nextInt();
      int ev = s.nextInt();
      edges[sv][ev] = 1; // this works only in a undirected graph
      edges[ev][sv] = 1;
    }
    int V1 = s.nextInt(); // the source from where you need to find the path
    int V2 = s.nextInt(); // the destination to which you need to find the path
    boolean visited[] = new boolean[V]; // create a boolean Array of size V
    ArrayList<Integer> ans = getPathDFS(edges, visited, V1, V2);
    if(ans!= null){
      for(int elem: ans){
        System.out.println(elem + " ");
      }
    }

  }

  // here we are writing a code for the (getpath) problem with DFS:
  public static ArrayList<Integer> getPathDFS(int[][] edges, boolean[] visited, int v1, int v2) {
    if (v1 == v2) {
      ArrayList<Integer> ans = new ArrayList<>();
      visited[v1] = true;
      ans.add(v1);
      return ans;
    }
    visited[v1] = true;
    for (int i = 0; i < edges.length; i++) {
      if (edges[v1][i] == 1 && !visited[i]) {

        // here we are calling recursion on the childrens to get the path from (start)
        // to (end):
        ArrayList<Integer> arr = getPathDFS(edges, visited, i, v2);
        if (arr != null) {
          arr.add(v1);
          return arr;
        }
      }
    }
    return null;

  }
}
