package MileStone2.MileStone2Lecture22;

public class StackUseWithLinkedList{
    public static void main(String[] args)throws StackEmptyException {
        StackUsingLinkedList<Integer> stack = new StackUsingLinkedList<>(); // here we are creating the stack using linked list:

        int arr [] = {5,6,7,1,9};
    
        for(int i = 0; i < arr.length; i++){
            stack.push(arr[i]);  // here we push all values of the array into the stack:
        }

        while(! stack.isEmpty()){ /// here checking the stack is empty or not:
            System.out.println(stack.pop()); // and here we removing the elements of the stack one by one:
            //  we have to remove the elements from the stack util the stack does not get empty:
        }
        


    }


}
