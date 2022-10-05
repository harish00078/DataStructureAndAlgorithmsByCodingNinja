package MileStone3.MileStone3Lecture24;

import java.lang.Thread.State;
import java.util.Scanner;

import MileStone2.AssignmentProblemOfRecursion.Staircase;

// here we are using the binary Tree class that we are created:
public class BinaryTreeUse {


    // know here we are creating the better function for taking input from the user:


    public static CreateBinaryTreeNode<Integer> takeTreeInputBetter(boolean isRoot, int parentData, boolean isLeft){

        // In this function: we are definig that which will value will our parent node value or we say that root value:
        // and which value is our child node values of the Tree:
        // In this way the user will better understand were they are put there Tree value:
        /// and using that value what kind of Treee structure they are building:
        
        // for building this input function we need there variables:
        //1: parent.
        //2: isRoot.
        //3: isLeft.
        //4: right = we are not using the right variable because: inseated of creating other variables:
        // we can use the (else) statement:

        // 1; firstly we have to check that we have  root value or not:
        if(isRoot){ // if in user input we have root value:
            System.out.println("enter root data"); // then that will become our root value:
        }else{ // after entering the root value: we have check left value for that root value or we can say for that  parent value:
            if(isLeft){ // if we have left value for that parent value:
                System.out.println("enter left child of " + parentData); // here when user input the left value: they can see that for which  parent node: they are put there left child value:
 
            }else{ // here if that value is not for the left child: then that will become our right child value:
                System.out.println("enter right child of " + parentData);

            }
        }





        // after that here we use Scanner function for having input from the user:
        Scanner s = new Scanner(System.in);

        // here we create a variable were we have our input for the tree:
        int rootData = s.nextInt();

        // after having the root input: we have to check that input before making the tree from that input:

        if(rootData == -1){  // here we check that if root input is (-1):
            return null; // then we are not able to make binary tree from that root input:
            // that why we simply returm null:
        }

        //after checking the input now we can make the tree structure using the input:
        // here we only have our data in the rootdata variables:
        // because every child is the root of its sub childs:

        // 1: here we firstly create root node using the input rootData:
        CreateBinaryTreeNode<Integer> root = new CreateBinaryTreeNode<Integer>(rootData); // here we create root Node for our tree structure using (rootData):
        // 2: here after creating the root Node using the rootData: now here we have another rootData input value:
        // that will become our left child Node:
        CreateBinaryTreeNode<Integer> leftChild = takeTreeInputBetter(false, rootData, true); // here we are defining our statements for the left child:
        // here we use recursion method:for having left child value:
        // 3: here after creating the left child Node using the rootData: now here we have another rootData input value:
        // that will become our right child Node:
        CreateBinaryTreeNode<Integer> rightChild = takeTreeInputBetter(false,rootData, false);  // here we are  defining our statements for the right child:
        // same here we do use recursion method: for having value for the right child:

        // here we gave (createBinaryTreeNode) class refrence to our left child or right child tree:
        // because we create them using a recursion not with the (binaryTreeClass):
        // so we have to define them using constructor that we created;
        root.left = leftChild;
        root.right = rightChild;
        return root;






    }









    


    /// here we are created function that will take tree input from the user:
    // this take input function have some exceptions for the user:
    // because in this function we only using the input to create tree;
    // not define that were we are putting the input values:
    // means which is our parent value or which is our child values: user have to handled it by it self:

    // public static CreateBinaryTreeNode<Integer> takeTreeInput(){

    //     // here we firstly tell user to enter the root value of the tree:
    //     System.out.println("enter root data");
    //     // after that here we use Scanner function for having input from the user:
    //     Scanner s = new Scanner(System.in);

    //     // here we create a variable were we have our input for the tree:
    //     int rootData = s.nextInt();

    //     // after having the root input: we have to check that input before making the tree from that input:

    //     if(rootData == -1){  // here we check that if root input is (-1):
    //         return null; // then we are not able to make binary tree from that root input:
    //         // that why we simply returm null:
    //     }

    //     //after checking the input now we can make the tree structure using the input:
    //     // here we only have our data in the rootdata variables:
    //     // because every child is the root of its sub childs:

    //     // 1: here we firstly create root node using the input rootData:
    //     CreateBinaryTreeNode<Integer> root = new CreateBinaryTreeNode<Integer>(rootData); // here we create root Node for our tree structure using (rootData):
    //     // 2: here after creating the root Node using the rootData: now here we have another rootData input value:
    //     // that will become our left child Node:
    //     CreateBinaryTreeNode<Integer> leftChild = takeTreeInput(); // here we use recursion method:for having left child value:
    //     // 3: here after creating the left child Node using the rootData: now here we have another rootData input value:
    //     // that will become our right child Node:
    //     CreateBinaryTreeNode<Integer> rightChild = takeTreeInput(); // same here we do use recursion method: for having value for the right child:

    //     // here we gave (createBinaryTreeNode) class refrence to our left child or right child tree:
    //     // because we create them using a recursion not with the (binaryTreeClass):
    //     // so we have to define them using constructor that we created;
    //     root.left = leftChild;
    //     root.right = rightChild;
    //     return root;

//}

    







    // // here we created a function for printing the Binary tree values:

    // In this print function we have exception: using this print function we are able to print the values of the tree:
    // but we are not able to see that we have  printed the values of the (tree) that we are created:
    // that why this function will surely able to print the values of the tree: also In right way:
    // but not the trees structure that we are created: that why we not only want the values in the right way:
    // we also want our tree structure in the correct waY:
    

    // public static void printTree(CreateBinaryTreeNode<Integer> root){

    //     // here we firslty print the root or the parent tree values:

    //     // root will change every time when we printed the one tree:
    //     // like: 1 = firslty we print parent class then parent class is our root:
    //     // it will print all the values of the parent class: like with  parent tree values or  left child  or right child tree values  of  the parent tree:

    //     // 2: = after printing these values now our root will become the next child class acc to our code:
    //     // and then we print its own value or we can say its root value  or after that  we print its left or right tree values:
    //     // System.out.println(root.data); // here we are printing the value of the root:or we can say parent tree



    //     // and here we call recursion function for printing  the  child classes values:  

    //     // here we write the base case for the left or right node or we can say child class:

    //     // here we have basecase for the left child tree:
    //     // if(root.left != null){
    //     // printTree(root.left);

    //     // }
    //     // // here we have base case for the right child tree:
    //     // if(root.right != null){

    //     // printTree(root.right);

    //     // }


    //     // Instead of writing the different base cases: for parent and child trees:
    //     // we can write the single base case for parent  and child trees:
    //     // here we write the base case for the root: and this will work for all child trees also:
    //     if(root == null){
    //         return;
    //     }
    //     System.out.println(root.data);
    //     printTree(root.left);
    //     printTree(root.right);
        

        
    // }

    


    // here we are created a other print function: that will not only print the values of the tree in right way:
    // but also tell us that we printed the right tree structure values:

    public static void printTreeDetailed(CreateBinaryTreeNode<Integer> root){

        // firstly here we write the base case: For the root: this base case will also work for the child trees or we can say nodes also:
        if(root == null){
            return;
        }

        System.out.print(root.data + ":"); // here we are printing the root value of the tree:

        /// here we are printing the left child tree or right child tree with  details:
        // so we can see that values that we have in our output are from the tree structure that we are  created:
        // not from the any random tree structure:

        // so for that we can do is that we can print left or right node values in (details) with there parent node:
        // so we can check that the output that we have is from the right tree structure that we are created:


        // here we are printing the every root nodes with there left or right  child tree data:
        // so we can check our binary tree structure:
        if(root.left != null){
            System.out.print("L" + root.left.data + ", ");
        }
        if(root.right != null){
            System.out.print("R" + root.right.data);
        }
        System.out.println();

        // after printing  that here we are printing THAT   left or right child tree value of that parent tree or we can say that  root node:
        // so we can check that we are printing the right binary tree sturcture that we are created:

        printTreeDetailed(root.left);
        printTreeDetailed(root.right);





    }


    // PROBLEM:
    // here we are doing the problem: (Number of Nodes present in the Binary Tree)
    public static int numNodes(CreateBinaryTreeNode<Integer> root){
        if(root == null){ // here we firstly have to check the  root input:if we did not have any root input:
            return 0; // then we simply return (0);
        }
        int leftNodeCount = numNodes(root.left); // and here we use recursion function for counting the nodes in the left of the root:
        int rightNodeCount = numNodes(root.right); // an d same here we use recursion function for counting the nodes:
        return 1 + leftNodeCount + rightNodeCount; // while returning the count of the node: we add extra one for the root Node:
    }



    // PROBLEM:
    // here we are doing the problem: (sum of Nodes present in the Binary Tree)
    public static int sumNodes(CreateBinaryTreeNode<Integer> root){
        if(root == null){ // here we firstly have to check the  root input:if we did not have any root input:
            return 0; // then we simply return (0);
        }



            
        int leftNodeCount = sumNodes(root.left); // and here we use recursion function for counting the nodes in the left of the root:
        int rightNodeCount = sumNodes(root.right); // and same here we use recursion function for counting the nodes:
        return root.data + leftNodeCount + rightNodeCount; // while returning the sum of the node: we add root node value:
    }


    // PROBLEM:
    // here we are creating a fucnction for finding the the (largest Node) in the binary Tree structure:
    public static int largest(CreateBinaryTreeNode<Integer> root){
        if(root == null){ // firstly we have to check that if root is null:
            return -1; // then we simply return (-1):
        }
        // here we are using  recursion for finding the largest Node  in the tree Structure:
        
        int largestLeft = largest(root.left); /// here we are finding the largest Node in the left of the root:using recursion:
        int largestRight = largest(root.right); /// here we are finding the largest Node in the right  of the root:using recursion:

        // after finding the largest between the left or right node:
        // we aslo have to check for the largest in root Node:

        // so for that we can use (MATH) function: for compare the root value with the left or right Node largest value:
        // In this way we are able to find the largest node in the Bianry Tree Structure:

        return Math.max(root.data, Math.max(largestLeft, largestRight));//here we are doing that:
        // 1: firslty we check the largest between the left or right Node:
        // 2: after the we compare that largest Node with the root node:
        // then we simply return the largest Node between them:
    }




    // PROBLEM:
    // HERE we are counting the nodes those are greater than (X) variables value:
    public static int countNodesGreaterThanX(CreateBinaryTreeNode<Integer> root, int x) {
		
        


        
        if(root == null){ // here we firslty have to check that root is null or not:
            return 0; // if it is null then we simply return zero:
        }
        
        int leftCount = countNodesGreaterThanX(root.left,x); // here we call recusrion to count greater values in the left of the root:
        int rightCount = countNodesGreaterThanX(root.right,x); // here we call recusrion to count greater values in the right of the root:
        if(root.data > x){  // here we call check that if root value is also greater than the (x) variables value:
            // then we also add that value with the other Nodes values count  those are greater then the (x) variables values:
           return 1 + leftCount + rightCount;
        }else{ // if root value is not greater then (x) variable value then we simply return other Nodes count value:
            // those are greater than (X) varaibles values:
            return leftCount + rightCount;
        }

      
	}


    // PROBLEM:
    // here we are checking the hieght of the Tree:

    public static int height(CreateBinaryTreeNode<Integer> root){

        if(root == null){ // here we firstly check: if root is null:
            return 0; // then we simply return (0):
        }

        int leftHieght = height(root.left); // here use recursion for finding out the height of the left of the root:
        int rightHieght = height(root.right); // here use recursion for finding out the height of the right  of the root:
        
        return Math.max(leftHieght, rightHieght) + 1; // here we use (MATh.max) function  for checking out that which Node have a greater hieght:
        // after checking that we simply add (1) with in that height because of the root: 
        // because the (root) will also we count as height of (one):

    }

    // here we are  creating a function for counting leaves in the tree structure:
    
    public static int numLeaves(CreateBinaryTreeNode<Integer> root){

        // here we handle case-1:
        if(root == null){ // if root check null then we simply return (0);
            return 0;
        }

        // here we handle case-2:
        if(root.left == null && root.right == null){ // if roots left node or roots right node is null:
            return 1; // then we simply return (1);
        }

        // here we handle case-3:
        return numLeaves(root.left) + numLeaves(root.right); // here we use recursion:
        // for checking the number of leafs present in the left or right of the root Node:
    }


    // here we are creating function: using that function we can print the node of that particular depth:
    public static void printAtDepthK(CreateBinaryTreeNode<Integer> root, int K){

        if(root == null){  // here we check if root is nulll:
            return; // then we simply return nothing:
        }
        if(K == 0){ // here if the given depth if zero:
            System.out.println(root.data);  // then we simply print the root Node it self:
            return;
        }

        // here we use recusion function for printing the left or right NOdes   acc to given depth:
        printAtDepthK(root.left, K - 1); // here we use (k - 1) statement: because when this statement get zero:
        // our recursion will know that this is the depth we have given: to print its nodes:
        printAtDepthK(root.right, K - 1); // same as left node:
    }


    // here we create function: using this function we can print the depth value of the nodes acc to its Tree Structure: 
    public static void changeToDepthTree(CreateBinaryTreeNode<Integer> root, int depth)
    {
        if(root == null){  /// here we firslty check if root is null:

            return; // then we simply return null:
        }
            
        
        root.data = depth;  // if root we have root value then we return its depth value:
        depth = depth + 1; // after that we incerase the depth value:
        // and  depth value will we increasing as we doing down and down in the Tree structure:
        changeToDepthTree(root.left, depth); // here we use recursion function for checking or counting  the depth values of the roots left Nodes:
        changeToDepthTree(root.right, depth); // here we use recursion function for checking or counting  the depth values of the roots right Nodes:
    }


    public static boolean isNodePresent(CreateBinaryTreeNode<Integer> root, int x) {
	    if (root == null){ // here we firstly check if root is null:
            return false; // then we simply return false
        }
        
        if(root.data == x){  // here we check that if root value  is equal to value of(x)
            return true; // then we simply return ture:
        }
        
        boolean leftIsNodePresent = isNodePresent(root.left, x); //  here we use recusrion: for checking that if  roots left nodes have value of (x):
        boolean rightIsNodePresent = isNodePresent(root.right, x); //  here we use recusrion: for checking that if  roots right nodes have value of (x):
        
    	if(leftIsNodePresent == true){  // here we check: if recursion function find out the (x) value in the left nodes of the root: 
            return true; // then we simply return ture: 
        }
        else if(rightIsNodePresent == true){ // we also  have to check for the right Nodes of the root:
            // if right nodes of root have a value of (x):
            return true; // then we simply return true:
        }
        return false; // else we can simply return false;
	}

    // here we create Insert function:
    // if we want to insert something in the BST:
    public static CreateBinaryTreeNode<Integer> insert(CreateBinaryTreeNode<Integer> node,int x){
        if(node == null){ // here we are writing our base case:
            // if node is check  null:
            CreateBinaryTreeNode<Integer> newRoot = new CreateBinaryTreeNode<Integer>(x); ;// then we create new root:
            // in that newroot we simply return the (x) value:
            return newRoot;
        }
        // here we do same thing in the left or right sub nodes of  the root or we can say node:
        if(x >= node.data){ // here we are doing:if the (x) value is greater than or equal to the node value:
            // then we call recursion on the right side of the TRee:
            //after that when we get that right sub node value: we put that value in the right sub node:
            // because when we go on the right sub node of the Tree: were we want to insert our value:
            // by default that will we a null: value that why we have to connect that recursion value with its root value:
            node.right = insert(node.right, x);
        }else{ // same thing we do on the left sub nodes of the Tree:
            node.left = insert(node.left, x);
        }
        return node; //after inserting the values  we are simply returning the   node:
    }


    



    




    public static void main(String[] args) {   

        // firslty we have to create the root of the binary Tree:
        // CreateBinaryTreeNode<Integer> root = new CreateBinaryTreeNode<>(1); // here we use the constructor that we created:
        // // for having the values of the  root: here(1) is our root value:

        // // here we use the default constructor  for creating a root:
        // // root.data = 1; // here we gave data to the root Node: we can say that to the parent Node:


        // //  here we create  other nodes for the Binary Tree: or we can also call them a child nodes:

        // CreateBinaryTreeNode<Integer> rootLeft = new CreateBinaryTreeNode<>(2);
        // CreateBinaryTreeNode<Integer> rootRight = new CreateBinaryTreeNode<>(3);
        // // here use a constructor  refrence for our two child classes:
        // root.left = rootLeft;
        // root.right = rootRight;


        
        // // these are  the futher sub classes  of the child classes:
        
        // // this is the right subclass of our left child class:
        // CreateBinaryTreeNode<Integer> LeftSubRightChild = new CreateBinaryTreeNode<>(4);
        // // this is the left subclass of our right child class:
        // CreateBinaryTreeNode<Integer> RightSubLeftChild = new CreateBinaryTreeNode<>(5);

        // // here we are connecting  rightsubclass with the left child class: using constructor:
        // rootLeft.right = LeftSubRightChild;

        // // here we are connecting  Leftsubclass with the Right child class: using constructor:
        // rootRight.left = RightSubLeftChild;


        // // here we are using the print function: for printing the tree values:
        // printTreeDetailed(root);


        


        /// now here we are using the take tree input function:for create a tree:
        // using this function we take input from the user for create our binary Tree:
        // CreateBinaryTreeNode<Integer> root = takeTreeInput(); // here we are using the take tree input:

        // // here we are using the print detail Tree function: that will basically print the tree that we are created;
        // printTreeDetailed(root);


        // here we are using the better function for taking input from the user for the tree structure:
        CreateBinaryTreeNode<Integer> root = takeTreeInputBetter(true, 0, true);
        printTreeDetailed(root);
        // here we are counting the nodes of  the Binary Tree structure that we are created:
        System.out.println("num of Nodes " + numNodes(root));
        // here we are finding the sum of nodes present in the binary Tree structure that we are created:
        System.out.println("sum of nodes " + sumNodes(root));

        // here we are using the   largest Node fucntion  for finding out the largest node in the Tree structure:
        System.out.println("Largest  Node " + largest(root));

        // here we are using the (height) function: for finding out the height of the Tree structure:
        System.out.println("height of Tree " + height(root));

        // here we are using the counting number of leafs function: for check that how many leafs we have in our tree structure:
        System.out.println("number of leaves " + numLeaves(root));

        // here we use the depth function: for printing the nodes of particular depth:
        System.out.println("print at depth k");
        printAtDepthK(root, 2);



        // here we use function: using this function we check that (this particular Node is present in the Binary Tree sturcture that we have created):
        System.out.println(isNodePresent(root, 5));

     


        
        
        

        




        

    }


    
}
