package MileStone3.MileStone3Lecture26;

import MileStone3.MileStone3Lecture24.CreateBinaryTreeNode;

public class AnotherSolutionCheckIsBST {

    // minRange variables will equal to the (-infinite):
    // maxRange variable will equal to the (+infinite):

    public static boolean AnotherSolutionIsBST(CreateBinaryTreeNode<Integer> root,int minRange, int maxRange){
        if(root == null){ // here we firstly have to check that:if root is null:
            return true; // then we simply return true;
        }

        // here we gave criteria to the root.data:
        // if root.data is less than minRange or greater then the maxRange:
        if(root.data < minRange || root.data > maxRange){
            return false; // then we simply return false:
        }

        // here we use recursion on both side or the roots left or right subnodes to check that:
        // the Tree is BST or not:
        boolean isLeftWithInRange = AnotherSolutionIsBST(root.left, minRange, root.data - 1);
        boolean isRightWithInRange = AnotherSolutionIsBST(root.right, root.data, maxRange);
        // here we are returning that: if both the sides are BST: then we return that the TRee is BST:
        return isLeftWithInRange && isRightWithInRange;
    }
    
}
