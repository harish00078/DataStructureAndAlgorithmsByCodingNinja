package MileStone2.MileStone2lecture23;



public class QueueUsingArray {

    private int data[]; // here we create array with private modifier:
    // so no one can break my logic:
    
    /// here we are definig other variables that we use in the queue operations:
    private int front;
    private int rear;
    private int size;

    // here we are  create a queue using construtor with array:
    public QueueUsingArray(){

        data = new int[5];  // here we create a queue  of with length five:
        front = -1;  /// here the initial front value of the queue is (-1):
        // because when we put our first value at queue we put in the 0th index:
        rear = -1; // here the initail value of the rear is also (-1):
        //because rear will move when we add values in the queue:
    }

    // here we also create other function were user can set capacity of the queue acc to there prefrences:

    public QueueUsingArray(int capacity){

        data = new int[capacity]; // here the queue will have the length of acc to the user entering capacity:
        front = -1;
        rear = -1;


    }

    // here we are returning the size of the queue using size variable:
    public int size(){

        return size;
    }

    // here we are checking that queue is empty or not:

    public boolean isEmpty(){
        return size == 0; // here we check that queue is empty or not using size variable:
    }
                                                                                                       
    // here we have enqueue fucntion that we use enter elements in the queue:
    public void enqueue(int elem){
        // here also have always check before entering the more elements in the queue that:
        // we have more space in queue for entering the more elements in the queue:
        if(size == data.length){ 
            // throw new queueFullException(); // here we throw the exception that we created:
            // if queue have no more space to enter more elements:

            doubleCapacity(); // here we use the dynammic array for entering value in the queue:
            //basically we are creating a dynammic queue:so when ever user get out of length of the queue:
            // this function will double the capacity of the queue:
        }

        if(size == 0){// here we are firstly working on the 0th index: before entering the  further values:
            // here if size of the queue is at 0th index:
            front = 0; // then first value should we enter at 0th position:
            // and that will become our front:
        }

        

        // this the simple method of inserting queue: but this method will fail when we are trying to insert new element in the queue:
        // instead of already inserted elements:

        // rear++; // after that we increase our rear:because other value will we enter in the rear variable:
        // data[rear] = elem; // here we enter other values in the rear:;
        // size++; // we also have to increase the size of the queue: while entering more and more elements in the queue:


        // for correcting this we have to use circular queue method:
        // in this method when user try to insert the new element the rear will jump on the zeroth index and then insert the value:
        // and this formation we call a circular queue method:

        rear++; /// here when user try to insert the new value: then rear will jump on the next index of the queue:
        if(rear == data.length){ //but while intering the new element in  the rear the length of rear  get full:
            rear = 0; // then we have to shift the rear at the zeroth index and then insert the new element in the queue:
        }
        // we can aslo write the circular method code in this way:
        // rear = (rear + 1) % data.length; 

        data[rear] = elem; // here we enter other values in the rear:;
        size++; // we also have to increase the size of the queue: while entering more and more elements in the queue:


    }


    // here we are  creating doubleCapacity function for the queue so making the queue dynammic:
    private void doubleCapacity(){
        int temp [] = data; // here we are creating the new array or we can say that new queue where we copy all the elements of the previous array or queue:
        data = new int[2* temp .length]; /// after copy all the elements of the previous array in the new arraY:
        // we are double the capacity of the new array:

        /// but here we have some problem we just did not direclty copy the elements of the previous queue into the new queue:
        //  because queue follow the (fifo) direction or we can say order while enter the elements in it:so it has two direction or we can say varaibles in it to enter elements in it :
        // so we have to carefull while copy the previous queue int the new queue:
        // and also these two direction or two variables have there own working the queue:\

        // so when we double the queue we have to we carefull for few things;
        // 1. when we copy the previous queue elements in the new queue: we should we copy then into the fifo order: 
        //2. we also have to sure that after copy the element  in the new queue: it two variables should we in its write position (front and rear):

        // here: In this way we can double the capacity of the queue:
        int index = 0;  // here we create index variable  for travelling through each variable of the queue
        // so we can easily travel throught the queue while copy the elements from the previous queue to new queue:

        // here we are only copy the elements of the previous queue to the new queue:
        // imp => from the front variable element  to the  end element of the queue:
        for(int i = front; i < temp.length; i++){  // here we firslty copy the element from the front variable element queue  to the last element queue in the new queue:
            data[index++] = temp[i]; // for traveling the elements we use the index variable or we can also use to track the elements of the previous queue:    
     
        }


        // And here we copy the (0th) index  element from the queue to the (front - 1) varible element of the queue into the new queue:
        // (front - 1) represent here (rear) varaible: means we are at the rear variable:
        // now further when use try to enter new element in the queue that will we handled why the rear:
        // because now rear will at the position of the recenlty added last element of the queue into the new queue:
        for(int i = 0; i < front - 1; i++){
            data[index++] = temp[i]; /// here it enter left elements in the new queue:

        }
        front = 0; //after  entering the elements we simply jump our front to the (0th) index:
        rear = temp.length - 1; // rear will we at the (new arrays length - 1):means at the second last postion of the queue          .
        // so we can enter new value next to him:
    }

    




    /// here we have front fucntion that we use to check the front value of the queue:

    public int front() throws QueueEmptyException{

        if(size == 0) { // here before printing the front element of the queue we have to check:
            // that are some element present  in the queue:
            throw new QueueEmptyException();  // here we are throws our own creating exception:
        }
        return data[front]; //after checking: if we have element present at the front of the queue then we simply print that element:


    }

    /// here we also have dequeue function that we use to remove elements from the queue:
    public int dequeue() throws QueueEmptyException{
        // we also have to check size of queue while decreasing  the queue:
        if(size == 0){
            throw new QueueEmptyException(); // while decreasing the queue size of queue get zero:
            // we simply have to gave the (queueEmptyException) that we are created:for user information:
        }

        int temp = data[front]; // here we firstly store the front variable value in the temp varaible:
        front++; // and then increase the  front value by one:or we can say that jump on the next value of the queue:
        // that will become our front:in this way the previous value will we automatically remove:

        //  here we also have one exception when we removing the elements from the queue:
        // when we are try to remove the elements from the queue we have (outofBound) exception:
        // because while inserting the element in the queue: we move rear to the 0th index:
        // now front does not have any thing that will stop him to not run forward after removing all the elements from the queue:
        // that why we have exception:for that exception we have to check the front variable while we are deleting the elements of the queue:
        if(front == data.length){ // here when we reach the total of the queue:
            front = 0;// we have to reset the front at the zeroth next again:
        }

        size--;

        // we decreasing queue size of queue get zero:
        // we also have to reset our front and rear end variable to the its starting position:
        if(size == 0){
            front = -1;
            rear = -1;
        }



        return temp;// and return then return that front: in this way we are simply able to remove:
        // the front value of the queue:
        // we will simply jump on the next value of the queue:that will become our front:
        //and the previous front value will we automatically get remove:


    }



    
}
