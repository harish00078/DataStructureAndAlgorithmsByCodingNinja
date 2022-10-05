package MileStone3.MileStone3Lecture26;

import MileStone3.MileStone3Lecture24.CreateBinaryTreeNode;

import java.util.Scanner;

public class ImprovedSolutionCheckIsBST {

    public static IsBSTReturn isBSTImproved(CreateBinaryTreeNode<Integer> root){

        // here we firslty write the base case:
        if(root == null){ // if root is null:
            IsBSTReturn ans = new IsBSTReturn(Integer.MAX_VALUE, Integer.MIN_VALUE, true); // here we create a object using constructor:
            // then constructor: will gave us a (ans):
            return ans;
            
        }

        // here we use recursion to check: that the left or right sub nodes of the root are BST or not:
        // here we are also use the (IsBSTReturn) class that we have created:
        // so recursion will use that class variables that we have created to check that the Tree is BST or not:
        IsBSTReturn leftAns = isBSTImproved(root.left);
        IsBSTReturn rightAns = isBSTImproved(root.right);

        // here we create our own min and max variable:
        //because when we use recusrion on the left or right side of the Tree:
        // we are use the class that we have created: or in that class we have min and max variable:
        // it means each side have its own min and max variables:
        // but we  did not want that: we want to use the min and max variable separatly as per our prefrence:
        // that why we create our own min and max variable:
        // so we can use them as per our prefrence or use:
        int min = Math.min(root.data, Math.min(leftAns.min, rightAns.min));
        int max = Math.max(root.data, Math.max(leftAns.max, rightAns.max));

        // here we have to pass four casees to declare that: the tree is BST or not:
        // for that we are creating the default value: that the BST is true:
        boolean isBST = true;
        // firstly we have to check that:if the left sub nodes values are greater than equal to the root.data:
        if(leftAns.max >= root.data){
            isBST = false; // then we simply have to return: Tree is false: means it is not a (BST):
        }
        // secondly we have to checl that: if the right sub nodes values  are smaller then: the root.data:
        if(rightAns.min < root.data){
            isBST = false; // then we simply have to return that : Tree is false: means it is not a (BST):
        }
        // thirdly we have to check that: if the left sub nodes are not (BST):
        if(!leftAns.isBST){ // if the left sub nodes of the root are not BST
            isBST = false; // then we simply have to return false:
        }
        //fourth we have to check that: if the right sub nodes of the root are not BST:
        if(!rightAns.isBST){
            isBST = false; // then we simply return false:
        }

        // after all the calculations we have to return that the Tree is BST not:
        IsBSTReturn ans = new IsBSTReturn(min, max, isBST);
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

        printTreeDetailed(root);

        // here we are using Improved function that we created : to check that the Tree is BST or not:
        IsBSTReturn ans = isBSTImproved(root); // here we check that the Tree is BST or not:
        System.out.println(ans.min + " " + ans.max + " " + ans.isBST); // here we print the BST TRee  values;
        

    }
    
    
}
