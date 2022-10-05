package MileStone3.MileStone3Lecture27;


import MileStone3.MileStone3Lecture24.CreateBinaryTreeNode;

public class OwnBSTClass {

    // here we create (root) varaible but we keep it private:
    // because be did not want that any user will know about it:
    // they are only know about that this is the BST class:
    private CreateBinaryTreeNode<Integer> root;

    // size variable will also get private: becauser we did not want that any one can destory my code logic:
    private int size;

    // here we create different constructors to create different function in this class:
    
    // before creating functions for the BST class: we create a helper function for the (isPresentHelper) BST function:
    // that will we not shown to the user: this is for our code logic:
    // because here we only have one value that will we given by user:using this value we are not able to run the function:
    // that why we create helper function : that will handle our user given value: with the Tree: 

    private static boolean isPresentHelper(CreateBinaryTreeNode<Integer> node, int x){
        if(node == null){
            return false;
        }
        if(node.data == x){
            return true;
        }
        if(x < node.data){
            //if the x value is less than root value:
            // then we call recusrion on the roots left sub nodes
            return isPresentHelper(node.left, x);

        }else{ // if the value of the x is not less then the root value:
            // then we call recursion on the roots right sub nodes:
            return isPresentHelper(node.right, x);

        }
    }

    // firslty we create is (Present ) function: for check that the given value is present in the Tree or not:
    public boolean isPresent(int x){
        return isPresentHelper(root,x);
    }

    // here we create Insert function:This is our Helper function:
    // if we want to insert something in the BST:
    private static CreateBinaryTreeNode<Integer> insert(CreateBinaryTreeNode<Integer> node,int x){
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

    // secondly we create (Insert)function: for inserting value in the Tree:
    public void insert(int x){

       root =  insert(root, x);
       size++;
    }

    private static int minimum(CreateBinaryTreeNode<Integer> root){
        if(root == null){
            return Integer.MAX_VALUE;
        }

        int minLeft = minimum(root.left);
        int minRight = minimum(root.right);
        return Math.min(root.data, Math.min(minLeft, minRight));
        

    }


    // here we are creating a  deletehelper function:
    public static BSTDeleteReturn deleteDataHelper(CreateBinaryTreeNode<Integer> root, int x){

        if(root == null){
            return new BSTDeleteReturn(null, false);
        }
        if(root.data < x){
            BSTDeleteReturn outputRight = deleteDataHelper(root.right, x);
            root.right = outputRight.root;
            outputRight.root = root;
            return outputRight;
        }
        if(root.data > x){
            BSTDeleteReturn outputLeft = deleteDataHelper(root.left, x);
            root.right = outputLeft.root;
            outputLeft.root = root;
            return outputLeft;
        }

        //if root will have (0) childern:
        if(root.left == null && root.right == null){
            return new BSTDeleteReturn(null, true);
        }
        // if root will only have (left) children:
        if(root.left != null && root.right == null){
            return new BSTDeleteReturn(root.left, true);

        }
        // if root will only have (right) child:
        if(root.left == null && root.right != null){
            return new BSTDeleteReturn(root.right, true);

        }
        // if we have left or right both the childrens present:
        int rightMin = minimum(root.right);
        root.data = rightMin;
        BSTDeleteReturn outputRight = deleteDataHelper(root.right, rightMin);
        root.right = outputRight.root;
        return new BSTDeleteReturn(root, true);
    }

    // thirdly we create (delete) function: if we want to delete some data from the Tree:
    public boolean deleteData(int x){ 

        BSTDeleteReturn output = deleteDataHelper(root, x);
        root = output.root;
        if(output.deleted){
            size--;
        }
        return output.deleted;
    }
    
    // fourth we create (size)function: for check that what is the size of the Tree:
    public int size(){
        return size;
    }

    // here we create helper function for the printTree function:
    private static void printTreeHelper(CreateBinaryTreeNode<Integer> node){
        // firstly here we write the base case: For the root: this base case will also work for the child trees or we can say nodes also:
        if(node == null){
        return;
        }

        System.out.print(node.data + ":"); // here we are printing the root value of the tree:

        /// here we are printing the left child tree or right child tree with  details:
        // so we can see that values that we have in our output are from the tree structure that we are  created:
        // not from the any random tree structure:

        // so for that we can do is that we can print left or right node values in (details) with there parent node:
        // so we can check that the output that we have is from the right tree structure that we are created:


        // here we are printing the every root nodes with there left or right  child tree data:
        // so we can check our binary tree structure:
        if(node.left != null){
        System.out.print("L" + node.left.data + ", ");
        }
        if(node.right != null){
        System.out.print("R" + node.right.data);
        }
        System.out.println();

    
        // after printing  that here we are printing THAT   left or right child tree value of that parent tree or we can say that  root node:
        // so we can check that we are printing the right binary tree sturcture that we are created:

        printTreeHelper(node.left);
        printTreeHelper(node.right);
    }

    // fifth we create (printTree) function: here we create function for printing Tree:
    public void printTree(){
        printTreeHelper(root);
    }
    
}
