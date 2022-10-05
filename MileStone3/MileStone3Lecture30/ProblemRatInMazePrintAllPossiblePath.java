package MileStone3.MileStone3Lecture30;

public class ProblemRatInMazePrintAllPossiblePath {


    
    // here we are only printing the one path:
    // here we are printing the path when we  reach the end cell: only  after checking that we pass the base values:
    // because that is also a condition one we have (true) solution for our problem:
    // its also means that we reach the end point:

    // here we create  constructor that will have the values of the maze:
    // and find out the solution for this problem:
    public static void ratInAMaze(int maze[][]){
        // here we firslty create the variable with name of (n)
        // and this variable will have maze values length in it:
        int n = maze.length;
        // we create this varaible(n) because we want the create other 2d array for our path  track:
        // while solving this problem to find the (rat in a maze):
        // and this path name 2d array should we have the same size of maze array:
        // that why we create variable(n) and this varaible will we equal to the (maze .length):
        int path[][] = new int[n][n]; // here we create path 2d array:
        PrintAllPaths(maze, 0, 0, path);
    }

        // but here we are creating the other constructor for this problem:
       // because of our logic related to this problem:
      // using this constructor we are solving this problem:
    public static void PrintAllPaths(int maze[][], int i, int j, int path[][] ){

        // here we firslty have to check that the i or j cell is valid or not:
        // or we can say that this is our base case:
        int n = maze.length;
        if(i < 0 || i >= n || j < 0 || j >= n || maze[i][j] == 0 || path[i][j] == 1 ){
            return;
        }
        // after passing out all this conditions:
        // we can say that: we are in the right path:
        path[i][j] = 1; // so we can convert the path value from zero to one:

        //or but if this path is our destination path:
        // then we simply return that we reach the destination path:
        if(i == n-1 && j == n -1){ // (n-1) represent that we are at the last value of the (maze)
            // and this is our end: and also means that we have a True path for this problem: 

            // this is the true path that why we are printing this path:
            for(int r = 0; r < n; r++){ // here we use(r) as  a row:
                for(int c = 0; c < n; c++){ // here we use(c) as a column:
                    System.out.print(path[r][c] + " "); // and here we are printing the its path:
                }
                System.out.println();
            }
            System.out.println();
            path[i][j] = 0;// after having the current path value:
            // or we can say that the path that we are exploring:if we reach the desitination cell in that path:
            // then  we have to  reseting the all current  path values to zero:
            // because we did not want that when we are exploring the other path to the end cell:
            // then our system gave us a error: because our previous path direction:
            // that why we change path values to zero again: for exploring the other paths:
            return;
        }

        // if that is not the case: we did not reach the end value:
        // then we have to explore other cells: if there is left any cell:

        // for that we have to move all the direction one by one and check that : which is the correct direction for the (end) point:

        // (Top):
        // fristly we have to check for (top):
        // in top (i) will equal to the (i -1) or (j) will we simple(j);
        PrintAllPaths(maze, i- 1, j, path);
        

        //(right):
        // if it is not the (top) direction: then we have to check for the other direction:
        // and that second direction is (right):
        // so when we move towards the (right) direction:then our (i) will we remain same but (j) we will become (j+1):
        PrintAllPaths(maze, i, j + 1, path);
        

        // (Down):
        // if the right also does not have the correct cell:
        // then we have to check in the other direction:
        // and that direction is (down) direction:
        // so when we move towards the (down)  direction:then our (i) will become (i + 1) and (j) will remain the same:
        PrintAllPaths(maze, i + 1, j, path);
        
        

        // (Left):
        // after that if (down) direction is not the direction: then we have to move for the other direction:
        // and that direction is (left) direction:
        // so when we move towards the left direction: then our (i) will remain same but (j) will become (j - 1):
        PrintAllPaths(maze, i, j- 1, path);

        path[i][j] = 0; // here we also have to do the path equal to zero:
        // for exploring  the other path to the end cell:

    }

    
    // but here we are creating the other constructor for this problem:
    // because of our logic related to this problem:
    // using this constructor we are solving this problem:
    public static Boolean solveMaze(int maze[][], int i, int j, int path[][] ){

        // here we firslty have to check that the i or j cell is valid or not:
        // or we can say that this is our base case:
        int n = maze.length;
        if(i < 0 || i >= n || j < 0 || j >= n || maze[i][j] == 0 || path[i][j] == 1 ){
            return false;
        }
        // after passing out all this conditions:
        // we can say that: we are in the right path:
        path[i][j] = 1; // so we can convert the path value from zero to one:

        //or but if this path is our destination path:
        // then we simply return that we reach the destination path:
        if(i == n-1 && j == n -1){ // (n-1) represent that we are at the last value of the (maze)
            // and this is our end: and also means that we have a True path for this problem: 
            return true;
        }

        // if that is not the case: we did not reach the end value:
        // then we have to explore other cells: if there is left any cell:

        // for that we have to move all the direction one by one and check that : which is the correct direction for the (end) point:

        // (Top):
        // fristly we have to check for (top):
        // in top (i) will equal to the (i -1) or (j) will we simple(j);
        if(solveMaze(maze, i- 1, j, path)){
            return true;
        }

        //(right):
        // if it is not the (top) direction: then we have to check for the other direction:
        // and that second direction is (right):
        // so when we move towards the (right) direction:then our (i) will we remain same but (j) we will become (j+1):
        if(solveMaze(maze, i, j + 1, path)){
            return true;
        }

        // (Down):
        // if the right also does not have the correct cell:
        // then we have to check in the other direction:
        // and that direction is (down) direction:
        // so when we move towards the (down)  direction:then our (i) will become (i + 1) and (j) will remain the same:
        if(solveMaze(maze, i + 1, j, path)){
            return true;
        }

        // (Left):
        // after that if (down) direction is not the direction: then we have to move for the other direction:
        // and that direction is (left) direction:
        // so when we move towards the left direction: then our (i) will remain same but (j) will become (j - 1):
        if(solveMaze(maze, i, j- 1, path)){
            return true;
        }
        return false;

    }
        
    
    
    





    public static void main(String[] args) {
        
        int maze [][] = {{1,1,0},{1,1,0},{1,1,1}};
        ratInAMaze(maze);
    }    
}
