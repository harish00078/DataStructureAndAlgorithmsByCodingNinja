package MileStone3.MileStone3Lecture26;

import MileStone3.MileStone3Lecture24.CreateBinaryTreeNode;

public class ConstructBst {

    // here we are creating Binary search Tree using Array:
    // public static CreateBinaryTreeNode<Integer> sortedArrayToBst(int[] arr, int n){
        // here we returing the value of this function acc to our next function:
    //     // that we want to create for constructing Bst using Array:
    //     return sortedArrayToBst(arr, 0, n - 1); // we do this because:
    //     // we want to use the start and end varaiable:so we can easily move around in the array values:
    //     // for finding out the mid value of the array that will become our root value of the Tree:

    // }

    // // here we create other function:for constructing bst using arrray:
    // // here we use the Start and End variable: we can easily mive around the array values:
    // public static CreateBinaryTreeNode<Integer> SortedArrayToBstHelper(int [] arr, int start, int end){
    //     // base case:
    //     if(start > end){ // here we check if start value is greater than end:
    //         return null; // then we simply return null:
    //     }

    //     // after that we have to find the mid value of the Array: that  will become our (root) value:
    //     int mid = start + (end - start) / 2;

    //     CreateBinaryTreeNode<Integer> temp = new CreateBinaryTreeNode<Integer>(arr[mid]); // here we are created our root for the Tree: with name temp using (mid) value of the array:
    //     temp.left = SortedArrayToBstHelper(arr, start, mid - 1); // here we create left sub nodes of the tree:using recursion on the first half of the array:
    //     // because the array is sorted: so all the smaller values of the array acc to the mid poind should in the left sub nodes of the Tree:
    //     temp.right = SortedArrayToBstHelper(arr, mid + 1, end);// same as the  left sub nodes:
    //     // here we are creating the right subnodes of the Tree using the array values acc to the mid point:
    //     // here we only have to put the greater values in the right sub nodes of the Tree acc to our root value:
    //     return temp; // after that we have to simply return value:
        
    // }

    
}
