package MileStone3.MileStone3Lecture24;


// here we are create our own binaryTree class: 
// with generic method: so while when we are using this class. we can use with any type of data type:
public class CreateBinaryTreeNode<T> {  // here (T) represent the generic method:


    // here for creating the binary tree: we need three variables:

    // 1. first = data variable: we can also say it parent tree or Root:
    public T data;

    // In binary tree we only have two nodes: we name them as left node or right node:

    // 2. second = left variables:  this is the one  child of the parent class: 
    public CreateBinaryTreeNode<T> left; 

    // 3. third = right variables: this is the other child of the parent class:
    public CreateBinaryTreeNode<T> right;


    // here we create  a constructor: we use this constructor to have a value of the (data) variables: 
    public CreateBinaryTreeNode(T data){
        this.data = data;
    }
    
}
