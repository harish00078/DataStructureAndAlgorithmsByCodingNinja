package MileStone3.MileStone3Lecture25;

import java.util.Scanner;

public class TreeIsBalancedImproved {

    // here we create better function to check that is Tree isBalanced or not:
    // for that we use the other class that we create: that class have a two variable:
    // for checking that the Tree is balanced or not: we only have to have a two things should we correct:
    // 1: height:
    // 2: is balanced:
    // so instead of creating these function in the ImprovedTreeBalanced class: 
    // we differently create there class: so we can improved the time complexity of the code:
    // that class will we our return class: 

    public static BalancedTreeReturn isBalancedBetter(CreateBinaryTreeNode<Integer> root){

        // here we are giving the base criteria to our return class that we are created:

        if(root == null){  // here we firstly have to check: if root is null:
            int height = 0; // then its height will will equal to zerO:
            boolean isBal = true; // if height is zero: then it is a balanced Tree:
            BalancedTreeReturn ans = new BalancedTreeReturn();  // after giving the criteria we have to define that:
            // criteria to our return class:

            // here we are connecting the (isBalancedBetter) class variables with the return class that we have created:
            ans.Height = height;  // here the our height variable value will we equal to the return Height vairable:
            ans.isBalanced = isBal; /// here our isBalm variable  value will we equal to the return isBalanced variable:
            return ans;
        }

        // here we checking that: left or right nodes of root are balanced or not:
        // here we call recursion so we check: each node of the left or right side that they are balanced or not: 
        BalancedTreeReturn leftOutput = isBalancedBetter(root.left); /// here we call recursion on the left side for checking each node of the left side:
        BalancedTreeReturn rightOutput = isBalancedBetter(root.right); // here we call recursion on the right side for checking each node of the right side: 

        // after checking the nodes: here we are gave default  True values to the vairiable: 
        // so we can create cases or we can say the statements:
        // for checking that the tree is balanced or not:
        // we gave default values as True: so if case is not true then we simply return false to that statement:
        // in this way we can check that Tree is balanced or not for each case:

        boolean isBal = true; // here we gave value (true): that (isbal) variable  is ture for default:
        int height = 1 + Math.max(leftOutput.Height, rightOutput.Height); // after checking the each node using recursion :
        // here we are calculating their hieght: so we can run all the cases:so that we can check the Tree is balanced or not:





        // after that we have to compare: there height with each other:
        // so we can check that: Tree is balanced or not:

        // here we check two things:
        // 1: height criteria of the Tree is True:
        // 2: or the each node of the Tree is balanced:
        // if these two conditions are true then we can say that: the Tree is balanced:


        // case:1
        if(Math.abs(leftOutput.Height - rightOutput.Height) > 1){ // if this height condition is true: then this is not a balanced Tree:
            isBal = false; // then we simply return:that (isBal) is false:
        }

        //case:2
        if(!leftOutput.isBalanced || !rightOutput.isBalanced){ // here we check that: if one of them is not balanced
            isBal = false; // then we simply return false:
        }

        // after checking all the values:
        // we have to return that values to our return class:

        BalancedTreeReturn ans = new BalancedTreeReturn();  // here we have our values to the return class:
        ans.Height = height;  // here our height value will we equal to the return class(Height) variable:
        ans.isBalanced = isBal; // here our isBal value will we equal to the return class(isBalanced) variable:
        return ans;





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

        System.out.println("is Balanced " + isBalancedBetter(root).isBalanced);
    }
    
}
