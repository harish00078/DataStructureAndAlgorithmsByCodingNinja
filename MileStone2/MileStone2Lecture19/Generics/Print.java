package MileStone2.MileStone2Lecture19.Generics;

public class Print {

    // here we write array : with generic method:
    // public static <T> void printArray(T arr[]){
    //     for(int i = 0; i < arr.length; i++){
    //         System.out.println(arr[i]);
    //     }
        
    // }

    // here we use the generic method array:

    // here use the generic method array for the Integer datatype;
    // public static void main(String[] args){
    //     Integer arr[] = new Integer[5]; // here we gave value  to the generic method Integer array:
    //     for(int i = 0; i < arr.length; i++){
    //         arr[i] = i + 1;
    //     }
    //     printArray(arr);


    //     // here we use the generic method array for the String Datatypes:
    //     String arrS [] = new String[5];
    //     for(int i = 0; i < arrS.length;i++){
    //         arrS[i]  = "abc";
    //     }
    //     printArray(arrS);
    // }









    // /// here we create array for the non-primitive datatypes:with generic method:

    // public static <T extends Vehicle> void printArray(T arr[]){ /// here in non primitive datatypes like Vehicle we created by our own self:
    //     // we will extend the generic class with the non_primitive data type class that  we are created:
    //     for(int i = 0; i < arr.length; i++){
    //         arr[i].print(); // when we extend generic class with non-primitive clas we will not simply print the output of the function:
    //     }  // here use the print function to print the function values:
        
    // }

    // public static void main(String[] args) {
        
    //     Vehicle v[] = new Vehicle[5];
    //     for(int i= 0; i < v.length; i++){
    //         v[i] = new Vehicle(10*i, "ab");
    //     }
    //     printArray(v);
    // }





    /// here we use the (print) interface: this interface will allow  any dataypes in the array;
    /// we do not have to change our code for primitive or non-primitive data types:
    public static <T extends PrintInterface> void printArray(T arr[]){ // here we extend generic class with interface function:
        for(int i = 0; i < arr.length; i++){
            arr[i].print();
        }
    }

    public static void main(String[] args) {
        
        Vehicle v[] = new Vehicle[5];
        for(int i= 0; i < v.length; i++){
            v[i] = new Vehicle(10*i, "ab");
        }
        printArray(v);// like here when we are use the interface class to print the generic class created array  we have to implement that class.
        // with the interface class that we are use in the generic class:
        /// that uses the interface class print function in the generic class:


        /// other example of generic classs with interface class print function;
        Student student[] = new Student[5];
        for(int i =0; i < student.length; i++){
            student [i] = new Student(10*i + 1);
        }
        printArray(student);  // here we can clearly see that here we use the inteface print function:

    }
   
    
}
