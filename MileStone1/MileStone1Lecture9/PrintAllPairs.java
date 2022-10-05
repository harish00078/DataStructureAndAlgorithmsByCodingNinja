package MileStone1Lecture9;



public class PrintAllPairs {

    // print the all paris of the array;

    public static void printAllPairs(int [] arr){

        int n = arr.length;
        for(int i = 0; i < n - 1; i++){ // here i variable represent the index number value.

            for(int j = i + 1; j < n; j++){ // here j variable is used for add other values in the i. for printing the parirs of the array.
                // here j will we shifted when i variables will we jump on the next ith number.
                // in this way we print the  paris or the array.
                System.out.println("(" + arr[i] + "," + arr[j] + ")");
            }
        }
    }

    public static void main(String[] args) {
        
        int arr [] = {1,4,7,6,5};
        printAllPairs(arr);
    }
    
}
