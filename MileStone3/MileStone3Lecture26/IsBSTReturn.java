package MileStone3.MileStone3Lecture26;

public class IsBSTReturn {

    // here we create class for the improved function of check BST:

    // here we create Three variable: that we use in the Improved BST function:
    // we can simply use them with this simple class:
    // we did not have to write the same code again again in the BST function:
    /// so we can improve our checKBST function time complexity:

    int min;
    int max;
    boolean isBST;

    // here we create constructor: so we did not have to write these three variables again and again:
    public IsBSTReturn(int min, int max, boolean isBST){
        this.min = min;
        this.max = max;
        this.isBST = isBST;
    }
    
}
