package MileStone1Lecture11;


public class How2dArraysAreStored {

    public static void main(String[] args) {

        int  arr [] = {1,2,3,4}; // in this way we can simply gave the values to the one- dimensional array or create one - dimensional array.
        System.out.println(arr.length); // here we check the length of the one dimensional array.
    
        int arr2d [][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}}; // in this way can simply gave  the value to the 2d array or create two 2d array.
        System.out.println(arr2d.length); // here we check the length of the two dimensional array.
        // how can we store the element in the 2d array. and how 2d array system work all the things i write down on the notes book.
        

        // here we check the how the values were stored in the 2d array or also it works.
        System.out.println(arr2d); // this will show us that this is 2d array.
        // and this array that we created to make 2d array are one dimensional array.
        // its output clearly tells that this is  a 2d array([[) .. because in output we have this sign with refrence number.
        // those were clearly tell that this 2d array


        System.out.println(arr2d[0]); // this array represent the zeroth row of the 2darray.
        // its output clearly tells that this is  a 1d array([) .. because in output we have this sign with refrence number.
        // those were clearly tell that this 1d array
        System.out.println(arr2d[1]); // this array represent the 1st row of the 2darray.
        // its output clearly tells that this is  a 1d array([) .. because in output we have this sign with refrence number.
        // those were clearly tell that this 1d array

        System.out.println(arr2d.length); // this will gave us  a numbers of rows. because 2d array will firslty check the row sequnce or number rows in the array.
        System.out.println(arr2d[0].length);// this will gave us a number of columns. because arr2d[0]. will represent one dimensional array.
        // that why this will gave us a column sequnce or number of columns in the array.

        
    }


  
}
