package MileStone1Lecture11;

public class BasicsOfTwoArray {

    public static void main(String[] args) {
        
        // In this way we can create the array.
        int [] [] arr2d = new int[3][4]; // like here we create the array of 3rows and 4column.

        System.out.println(arr2d[1][2]); // in this way we can access the 2darray elements.

        arr2d[2][1] = 12; // In this way we can add the numbers or elements in the array. 
        // like here we add the 12 number in the 2row or 1column.
        System.out.println(arr2d[2][1]);



        // we can also did not access the row and columns out of the 2d array.
        // like in this output we try to access the 3row that is not avilable in the 2d array.
        System.out.println(arr2d[3][1]);

        
        // we can also did not access the row and columns out of the 2d array.
        // like in this output we try to access the 4column that is not avilable in the 2d array.
        System.out.println(arr2d[1][4]);


    }
    
}
