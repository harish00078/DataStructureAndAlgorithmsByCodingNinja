package MileStone2.MileStone2Lecture14;

public class FirstIndexOfANumberInAnArray {

    // for solving this problem we have two solutions;
    // 1.> the first one is that we will check the number by creating a small arrays of a particular given array.
    // 2.> the second  we can check the  given number directly in the array and return its index.

    // first solution for find the index number of the given number in array.acc to the recursion method
    public static int firstIndex(int a[],int x){ // here we have array (a) and find index value (x)
        if(a.length==0){ // here we have our base case check if array lenght is over.

            return -1; // then return the value -1;
        }
        if(a[0]==x){ // here we check the index number for the first value of the array .
            // means we took small value of the array and check the index number for the value that we have given.
            return 0; // if it have given value then return it values index number.
        }
        int smallArray[]=new int[a.length-1]; // after check the one  value of the array.  we create small array using the other left values .
        for(int i=1;i<a.length;i++){
            smallArray[i-1]=a[i];
        }
        int fi=firstIndex(smallArray,x);   // here we call (firstIndex) funtion were we  use small arrays that we create and then find the value (x) in that array.
        if(fi==-1){   // here we check that if (first index) have (-1) value in the array then we simply return value -1.
            return -1; // 
        }else{  // else we check the nextINdex value.
            return fi+1;
        }
       
    }
    // public static void main(String[] args) {
            
    //     int a [] = {1,2,3,4,5};
    //     int x = 3;
    //     System.out.println(firstIndex(a, x));
    // }



    

    // 2.> here we direclty check the given number in the array and print its  index value.acc to the recursion method
    public static int firstIndexBetter(int a[],int x,int si){
        if(si==a.length){
            return -1;
        }
        if(a[si]==x){
            return si;
        }
        int k=firstIndexBetter(a,x,si+1);
        return k;
    }
    public static void main(String[] args) {
            
        int a [] = {1,2,3,4,5};
        int x = 3;
        System.out.println(firstIndexBetter(a, x,0));
    }

}
