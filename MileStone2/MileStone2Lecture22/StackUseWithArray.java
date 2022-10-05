package MileStone2.MileStone2Lecture22;



public class StackUseWithArray {

    // here user will use our stack system that we created:

    public static void main(String[] args) throws StackEmptyException,StackFullException {
        
        // StackUsingArray stack = new StackUsingArray(100); /// here user pass the size of the stack: like here we gave him a size of 100:

        StackUsingArray stack = new StackUsingArray();
        // here we can also create a values using loop: instead of writing single values or single functions:
        // like here we firstly create the array:
        int arr[] = {5,6,7,1,9};// when we put these elements in the stack the first element of the array will become the last element of the stack:
        // and the last element of the array will become the top element of the stack:

        //after creating a array we have to push these values into  the stack:
        for(int i = 0; i < arr.length; i++){
            stack.push(arr[i]);  // here we push all values of the array into the stack:
        }
        // we can do the same thing for the pop function also:
        // so we donot have remove the each element one by one:
        while(! stack.isEmpty()){ /// here checking the stack is empty or not:
            System.out.println(stack.pop()); // and here we removing the elements of the stack one by one:
            //  we have to remove the elements from the stack util the stack does not get empty:
        }

        // stack.push(10);
       
        // // stack.top();
        // System.out.println(stack.top()); // here we check the top element of the stack:
        
        // // stack.size();
        // System.out.println(stack.size());  // here we check the size of the stack

        // // stack.isEmpty();
        // System.out.println(stack.isEmpty());// here we check that stack is empty or not:


        // stack.pop(); // here we are using the pop function:
        // // after pop function we print the size of the stack:
        // System.out.println(stack.size()); // it gave us a zero value:

        
    }
    
}
