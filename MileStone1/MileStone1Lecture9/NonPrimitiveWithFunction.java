package MileStone1Lecture9;



public class NonPrimitiveWithFunction {

    // here we use non primitive datatype (array) to check.
    // that how the functions perform with the non primitive datatype (array)

    //after increment the array we have to print the array.
    // here we create printing array function.
    public static void printArray(int [] arr){
        int n = arr.length;
        for(int i = 0; i < n;i++){
            System.out.println(arr[i]);
        }
    }

    // in this array function we have a array then we increment that by one .after that we print that array.
    public static int [] incrementArray(int [] arr){ // here i change the void function to the datatype array function
        // System.out.println(arr);   // for example we can check the refrence number of the (arr) variable. also check the refrence number of the(arr) of the incrementArray function.
        // in this way we can check that they both only shares the  same memory address or refence numebr.
        arr = new int [7]; /// what happen if we gave a new values to the function. as comparing to the main function.
        for( int i = 0; i < arr.length; i++){
            arr[i] = arr[i] + 1;
        }
        return arr; // also return its value;
        // when i return its value now the  value of the arr will we change acc to the main function. 
        // beacsue we change the value of the arr in the increment function.
        // also return that change value. now the (arr) have different value or refrencce address ass compare to the main function (arr)value.
        // that why when we print the value of the (arr) it will have a different value acc to the main function.
    }

    // important points: 1.> non premitive data only shares the refrence number or memory address. they do not copy the values.
    //                   2.> in java we call it (pass by value).
    //                   3.> this refrence number or memory  address system works acc to the main funciton instructions or that other functions that we created.


    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        // for example we can check the refrence number of the (arr) variable in main function.
        // System.out.println(arr);
        arr = incrementArray(arr); // and store that increment returing value here in the (arr) variable.
        // that why when we print this arr value it will gave us a (arr) value of the incrementfunction.
        // beacuse in increment function we change the value or refrence of the main functions (arr) value.
        // and we also return that value or store that value.
        printArray(arr);  // print array will aslo shrares the same refrence or memory address as main funcntion or incrementArray function.
    }
    
}
