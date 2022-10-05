package MileStone3.MileStone3Lecture25;

import java.util.Scanner;


public class TreeIsBalanced {


    //  here we are creating the height function: for checking the height of the roots left or right nodes:

    public static int height(CreateBinaryTreeNode<Integer> root){
        if(root == null){
            return 0;
        }

        int leftHeight = height(root.left);
        
        int rightHeight = height(root.right);

        return 1+Math.max(leftHeight, rightHeight);
    }





    // here we create function for checking that Is the Tree is Balanced or Not:
    public static boolean isBalanced(CreateBinaryTreeNode<Integer> root){
        // firstly we have to check the (root);
        // if root does not have any nodes: than that is also a balanced Tree:
        if(root == null){ // here we check that if root is null:
            return true; // then that is also a balanced Tree: that why we are returning here :(true)
        }

        // here we use the hieght function: for calculating the height of the roots left nodes or roots right nodes:
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        // after that we have to compare   the left nodes height  or the right nodes height with each other:
        // acc to the balanced Tree parameter: for checking that root.left or root right is balanced or not:
        // for that we are using the (Math.absolute) fucntion:
        // because we want to check the hieght parameter from both the sides:
        // like:
        // 1: left to right hieght of the nodes camparison:
        // 2: right to left height of the nodes camparison:

        if(Math.abs(leftHeight - rightHeight) > 1){ // here what we are doing that with Math.absolute method:
            /// here we are checking the height from both the sides with balanced Tree parameter:
            
            return false; // if camparison from  both the sides are greater than (1): then we simply return false:
        }


        // after clearing the base case: we are using recursion for further checking the nodes of each sides:
        // that they  are balanced or not:  because we can only clear a Tree Structure is balanced if its each node is balanced:
        boolean isLeftBalanced = isBalanced(root.left);// that why here we are using the recusion function:
        // for all the other left sub nodes of the Tree: for checking each nodes: that they we balanced or not:
        boolean isRightBalanced = isBalanced(root.right); // same as the left Nodes:

        // after that we have to simply return its value:
        // here we are using the (AND) operator:
        // for comparing both the nodes:
        // like: if left or right is True then we return True:
        // if one of them is false: then we simply return (false): 

        return isLeftBalanced&&isRightBalanced;



    }








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

    public static void main(String[] args) {

        CreateBinaryTreeNode<Integer> root = takeTreeInputBetter(true, 0, true);

        System.out.println("Is Balanced " + isBalanced(root));
        
        System.out.println();

    }
    
}
