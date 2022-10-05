package MileStone2.MileStone2Lecture22;

public class StackUsingArray {

    // here we create a stack system using array with creating its different operation and  function of the stack:

    // here we firstly define the array:

    private int data[];  // here we also convert our array into the private modifier.
    //if any buddy use my stack function. we did not  want any one or user to access my code.
    // because that will break myc logic:

    private int topIndex; // here we also create a other private variable call topIndex:
    // because this varaible is used add or remove values from the stack or use for other operations as well:
    // beacuse this varaible is at the top of the topIndex: or we can also call it (n):
    // # we can aslo say that this  is the {index of the top most element of the stack}:



    // here we create a array using a constructor:
    public StackUsingArray(){

        data = new int[10]; // here we create array of size(10);
        topIndex = -1; // initiall top index will we (-1) because when we add some value:
        // In stack we are added it at zeroth position.that why top index will we  at (-1);
    }

    // here we create the other constructor. In this constructor the user will gave the size of the stack acc to its prefrence:
    public StackUsingArray(int size){ // here the user will gave us a  size:
  
      data = new int [size]; // and here tha size will we equal to data.means equal to the array size;
      topIndex = -1;
    }



    // here we create function for check the size of the stack using (stacK) operations:
      public int size(){

        // for checking the size of the stack we can simply do that:we can add +1 in the topIndex variable:
        return topIndex + 1; 
        
    }
    
    // here we create  other function for that the stack is empty or not:
    public boolean isEmpty(){

      // we can  use this function to check the stack is empty or not:
      // if(topIndex == -1){
      //   return true;
      // }else{
      //   return false;
      // }

      // or we can also use the simply code to check that stack is empty or not:

      return topIndex == -1; 


    }


    // // here we create function for push operation:
    // public void push(int elem) throws StackFullException{
    //   // before inserting the element in the stack:
    //   // we  have to check that there are free space avialable in the stack:
    //   if(topIndex == data.length -1){
    //     // thow exception:  here i create my own exception class so user can understant the error in the better way:
    //     // here we use the exception that we created:
    //     StackFullException e = new StackFullException(); /// here we use the exception class that we created:
    //     throw e;  // and we throw that exception or we can say that print that exception:

    //     // we can also write exception in simple way:
    //     // throw new StackFullException();
      
    //   }
    //   topIndex++;/// here we firstly have to jump on the empty stack index
    //   data[topIndex] = elem; // then we are able to enter the element in the top of the stack
  
    // }



    // here we create the other push function that will automatically double its size when user try to enter more values in it:
    public void push(int elem){

      if(topIndex == data.length - 1){  /// here we are firslty check that size of the stack is full:

        // here we use the function that we are create  basically for double the capacity of the stack:
        doubleCapacity();// here we are using that function:


      }
      topIndex++;
      data[topIndex] = elem;
    }


    // this is the function that we are created for double the capacity of the stack acc to the user prefrences:

    private void doubleCapacity(){

      int temp [] = data;  /// here we create the new array: (temp) and that array is equal to the data:
      // or we say that  equal to the previous array:

      data = new int[2 * temp.length];// and here we are double the capacity of the array using the new array that we are created: 
      // here we are basically double the length of the new array: and that array is equal to the previous arraY;
      // in this way we are double the capacity of the  previous array:

      // now our previous array will become new array:
      // so we have to  copy all the values of the previous array into the new array:

      for(int i = 1; i < temp.length; i++){ // here we are use the new array length:
        data[i] = temp[i]; // and  here we are copy all the element of the previous array into the new array: 
      }



    }




  

    // here we create a function for check the top most element of the stack using (top) operation:
    public int top() throws StackEmptyException{
      // here  before printing the top most value of the stack we have to check.
      // that there is any value present in the stack or not:
      if(topIndex == -1){ /// here we check that stack is empty or not:
        // here if stack is empty then we have to throw the excepton that we are created:
        // for the better understanding of the user:

        // here we use the empty exception that we are created:
        StackEmptyException x = new StackEmptyException();
        throw x;

        // we can also write the exception in the simple way:
        // throw new StackEmptyException();


      }

      return data[topIndex]; // here we return the top value of the stack:




    }

    // here we create  other function for removing the top most element of the stack:
    // for that we are using the (pop) functions:
    public int pop() throws StackEmptyException{

      // here also have to check that stack is empty or not:
      if(topIndex == -1){  // if it is empty we have to simply return the empty exception that we are created:
        StackEmptyException y = new StackEmptyException();
        throw y;


      }
      // here we are removing the top element of the stack:
      // here we are simply minimize the index by one:in this way we are removing the top element of the stack:
      int temp = data[topIndex]; // here we store the stack in the temp variable:
      // because when we remove the index by one we have to also return it: for the  user so they  can access it in other class:
      topIndex--;  // here we minimize the index by one: and our top element value will we automatically remove from the stack:
      //because we remove that index:
      return temp; // here we  return that stack value after remove the top value  of the stack:




    }



    
}
