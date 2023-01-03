package MileStone4.MileStone4Lecture37;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ProblemGetPathByBFS {

  // here we are writing the code for the (getPath) in graph by (BFS):
  public static ArrayList<Integer> getPathBFS(int adjMatrix[][], int s, int e) {

    Queue<Integer> pendingVertices = new LinkedList<>();
    HashMap<Integer,Integer> map = new HashMap<>();
    boolean visited[] = new boolean[adjMatrix.length];
    visited[s] = true;
    pendingVertices.add(s);

    // after visiting a (source = s) value in the graph. know we have to put that source value in the (hashmap) with its parent-value:
    // parent value for the (souce) of the graph is (-1):
    // parent value will we changes acc to the value that we put in the (source):
    map.put(s,-1);

    boolean pathFound = false;
    

    while(! pendingVertices.isEmpty()){
      int currentVertex = pendingVertices.poll();
      for(int i = 0; i < adjMatrix.length; i++){
        if(adjMatrix[currentVertex][i] == 1 && !visited[i]){
          pendingVertices.add(i);
          visited[i] = true;

          // when we are exploring the further vertices in the graph.we also have to gave them there parent-vertices using hashmap:
          // the current-vertex will become there (parent-vertex):
          map.put(i, currentVertex);

          if(i == e){

            pathFound = true;
            
            break;
          }
        }
      }
    }

    if(pathFound){
      ArrayList<Integer> path = new ArrayList<>();
      int currentVertex = e;
      while(currentVertex != -1){
        path.add(currentVertex);

        // here we are getting a parent of the (current-vertex)
        int parent = map.get(currentVertex);
        // and after that we are updating our current-vertex with the parent-vertex :so we can go to its top most vertex with the help of there parent-vertices:
        currentVertex = parent;
      }
      return path;


    }else{
      return null;
    }
     

  }


  // here we have the main file for our problem:
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

    int source  = s.nextInt();
    int end =  s.nextInt();
    ArrayList<Integer> path = getPathBFS(adjMatrix, source, end);
    for(Integer i : path){
      System.out.print(i + " ");
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
    // bfTraversal(adjMatrix);
  }
}
