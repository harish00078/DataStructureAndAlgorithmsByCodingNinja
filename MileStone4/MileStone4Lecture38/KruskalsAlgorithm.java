package MileStone4.MileStone4Lecture38;

import java.util.Arrays;
import java.util.Scanner;

// here we create class (Edge): from were we get our (edges):

// IMP = and we also have to sort the (edges) in asscending-order: acc to our code logic:
// for that have to use  the (comparable) method: and sort our (edges) throught that method:
class Edge implements Comparable<Edge> {

  int v1;
  int v2;
  int weight;

  // combination of these three things: will gave us a (one-Edge) for the graph:
  Edge(int v1, int v2, int weight) {
    this.v1 = v1;
    this.v2 = v2;
    this.weight = weight;
  }

  // here we are creating a (comparable) method to compare our (edges) and put them into the asscending order:

  @Override
  public int compareTo(Edge o) {
    // here we are doing that if upcoming (Edge) weight is greater than then (already) present (Edge) weight:
    // then we have to (add) that (Edge) in our asscending sequence:
    return this.weight - o.weight;
  }
}

// here we create a kruskal's algorithm class:
// were we write the (kruskal's algorithm) and also write the (main-file) or we can say (input) file  in it:

public class KruskalsAlgorithm {


  // here we are creating a (find-parent) function:
  // for finding our the (parent-value) of the vertex:
  private static int findParent(int v, int parent[]){

    // if (vertex-value) is equal to the (parent-index) value:
    if(v == parent[v]){

      // then that will we our (parent) value for that (vertex):

      return v;
    }

    // if that's not the case: then we have check futher values of the (parent-array):through recursion:
    // here we are using the (recursion): for finding our (parent) value:
    return findParent(parent[v], parent);
  }




  // here we are creating  a (kruskal's algorithm):
  // through this algorithm we can create our (MST) from the graph:
  public static Edge[] KruskalsAlgorithm(Edge[] edges, int n){

    // here we are sorting our (edges):
    Arrays.sort(edges);

    // after that we have to create our (MST):
    // edges that (mst) will is equal to the (n-1) number of (vertices):
    Edge mst[] = new Edge[n-1];

    // we also have to create the (array):
    // which have the values of  the (parent):
    int parent[] = new int[n];

    for(int j = 0; j < n; j++){

      // the parent will have the values from the (zero) to (n) number of (vertices)length:

      parent[j] = j;
    }


    //after that we have to create the two variables:
    int count = 0, i= 0;

    // until count is not equal to the (n-1): we can add more edges in our (mst):
    while(count != n-1){

      // here currentEdge will have the value of the (graph's edges):
      Edge currentEdge = edges[i++];

      // and after getting the edge or currentEdge: we have to get or find there (parentIndex) also:
      // for that we are using the (findParent) function on the (currentEdge's) v1 and v2 vertex:
      int v1parent = findParent(currentEdge.v1,parent);
      int v2parent = findParent(currentEdge.v2,parent);

      // after getting the parentIndex: if both the vertices have the different (parent-value) then we can add that  (currentEdge) in the (MST):
      if(v1parent != v2parent){

        // for defining the (index) of the (MST) where we want to that (currentEdge). we are using  the (count) variable:
        mst[count] = currentEdge;

        // and then we increment that (count) variable:
        count++;
        
        // if we add that (currentEdge) in the (MST): then we also have to change the one of the (parents-value):
        parent[v1parent] = v2parent;

      }



    }

    return mst;
  }




  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int e = s.nextInt();

    // here we create (array) named as (edges):
    // we create this (array) through (Edge) class that we have created:

    // IMP =  here we are storing our graph's (weighted-edges):
    // those we create through (Edge) class that we have created:
    // and that'S  why we called this array a (array.list):
    // this array will have a length of (edges) that we are getting from the (user) in the (e) variable:
    Edge edges[] = new Edge[e];

    // after getting a length of the (edges) through (e) variable:
    // know we haveto  create the (weighted-edges) with there (vertices): through the (Edge) class that we have created:
    for (int i = 0; i < e; i++) {
      int v1 = s.nextInt();
      int v2 = s.nextInt();
      int weight = s.nextInt();

      // here we created a (weighted-edge) with there (vertices): through the (Edge) class that we have created:
      Edge edge = new Edge(v1, v2, weight);

      // and then we store that (edge) in the (edges-array):that we have creted:
      edges[i] = edge;
    }

    // IMP = after that we can create our (MST) by using (kruskal's Algorithm) on those (edges):
    // (MST) will also created through the (Edge) class that we have created:
    Edge mst[] = KruskalsAlgorithm(edges, n);


    // here we are printing our (MST) to check that (kruskal's algorithm) is working fine or not:

    System.out.println("Here We Have Our MST");

    for(int i =0; i < mst.length; i++){


      if(mst[i].v1 < mst[i].v2){
        System.out.println(mst[i].v1 + " " +  mst[i].v2 +" " + mst[i].weight);
      }else{
        System.out.println(mst[i].v2 + " "+ mst[i].v1 +" " + mst[i].weight);

      }
    }

  }

}
