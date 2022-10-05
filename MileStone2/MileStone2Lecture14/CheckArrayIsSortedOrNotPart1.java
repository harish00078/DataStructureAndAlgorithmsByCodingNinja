package MileStone2.MileStone2Lecture14;

public class CheckArrayIsSortedOrNotPart1 {

    public static boolean isSorted(int a[]){
        if(a.length==1){ // here we firstly check that the array.length is one or not
            // beacuse array with one length is always a sorted array.
            return true; //that why here we print true if array have length of one.
        }
        if(a[0]>a[1]){  //here we have other condition if  our arrays first value is greator than second value it means this is not a sorted array.
            
            return false; // and we simply return the false.
        }
        int smallArray[]=new int[a.length-1];  // here we create other small array using the current array.
        // because we also want to check the other values of the array that they are  sorted or not.
        for(int i=1;i<a.length;i++){
            smallArray[i-1]=a[i];  // every we create new array it will we become smaller then previous array.
            // at the end it will become one element array.
            // And one element array is always a sorted array.
        }
        boolean isSmallArraySorted=isSorted(smallArray);
        return isSmallArraySorted;
    }
    public static void main(String[] args) {

        int a [] = {1,2,3,4,5};

        System.out.println(isSorted(a));
    }
      
    
}
