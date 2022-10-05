package MileStone2.MileStone2Lecture17;



public class DynamicArray {

    // DynamicArray = The dynamic array is a variable size list data structure. 
    // It grows automatically when we try to insert an element if there is no more space left for the new element. 
    // It allows us to add and remove elements. 
    // It allocates memory at run time using the heap. 
    // It can change its size during run time.


    private int data[]; // here we create the dynamic array.or we can say only create the refrence address of the array:
    // we create it using private modifier.because be did not want any one to break my logic.

    private int nextElementIndex; // here we create other property or variables we can say that to track the index of the array;
    // because here we using the dynamic array.so we  donot know how much values of the array were use by users. so its important to have track of the array.
    
    // here we create our dynamicarray using constructor:
    public DynamicArray(){
        data = new int[5]; // here we define the dynamic array: with index value of [5]
        nextElementIndex = 0; // here we use varible that we created for findind the index value of index element of the array for counting the array:
    }

    // here we create other function to check the size of the array:
    public int size(){
        return nextElementIndex; // heere we use that function that we created for the keep track counting on the array length;
    }


    // here we create  other function to check that  the array have any value in it or not:
    // means in array we have any value or not:
    public boolean isEmpty(){
        return nextElementIndex == 0; // here we also use the array length variable that we created for keep tracking on the array size:
    }

    // if we want to check the value of the particular index:
    // for that were using a getter function:
    public int  get(int i){ // here we put the index number:
        // here we write one other condition to check that the value of the array that  we want to check of the particular index of the array is have any value or not:
        if(i >= nextElementIndex){ // if the value of the i is greator than the array index length .then we simply return -1;
            return -1;
        }
        return data[i]; // here we simply get the value of that index:
    }

    // here we create a function for adding new elements in the array:
    public void add(int elem){ // here we create the fuunction for adding element in the array.
    if(nextElementIndex == data.length){ // here we check that our index value matches with the array length .if it matches it means we are out of the array lenth.
        // so we did not able to store more element in the array. 
            doubleCapacity();// that why here we use doublecapacity function that will help us to double the capacity of the array .
            // and we can add as much as elements that we want to add in the array.
        }
        data[nextElementIndex]= elem; // here we put our element in the array:
        nextElementIndex++;// and jump on the next element:
    }

    // here we create the function for if we want to double tthe  capacity of the array. for adding more elements in the array:

    public void doubleCapacity(){
        int temp [] = data;
        data = new int[2 * temp.length];
        for(int i = 0; i < temp.length; i++){
            data[i] = temp[i];
        }
    }

    // here we create a setter function using that fucntion we can basically set particular element at particular index;
    // use for if we want to add the particular value at a particular index
    public void set(int i, int elem){
        if(i >= nextElementIndex){  // here we check that if our given index have getter index value then our array index.
            // them we simply return nothing:
            return;
        }
        data[i] = elem; // here we convert change current array value with the new element:
    }

    // here we create other function (removelast) elements from the array: it  is used if we want to remove the last elements from the array:

    public int removeLast(){  // here we create function:
        if(nextElementIndex == 0){ /// here we firslty check if array index is zero. then we can simplpy.
            return -1; //  return the value -1;
        }
        int temp = data[nextElementIndex-1];  // here we firslty store the array refrence at temp variable:
        data[nextElementIndex-1] = 0; // after that we will remove every last value of the  array and put zero value there:
        nextElementIndex--; // here we use decrement operator to continue that operation:
        return temp; // and after all this function sequence we will represent our value to the user:
    }


    
}
