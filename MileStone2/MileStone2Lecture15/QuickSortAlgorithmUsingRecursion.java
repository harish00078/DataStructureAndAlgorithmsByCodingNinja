package MileStone2.MileStone2Lecture15;



public class QuickSortAlgorithmUsingRecursion {

    /// we have to sort the array using quick sort algorithm with recursion.

    public static void quickSort(int a[], int si, int ei){

        if(si >= ei){   // here we firstly check the array length using start index or end index:
            return ;
        }
        int pivotIndex = partition(a,si,ei); /// here we call the partition function  to do the partition of the array.or basically create  pivot number.
        quickSort(a, si, pivotIndex - 1); // after do the partition we call quick sort function to sort on the first half of the array. using pivot number
        quickSort(a, pivotIndex + 1 ,ei);// after do the partition we call quick sort function to sort on the second  half of the array.using pivot number

    }
    public static int partition(int a [], int si, int ei){
        int pivotElement = a[si]; /// 1.> here we define the pivot number:

        int smallernumcount = 0; // 2.>here we create variable or loop to count that  which numbers are in the array are smaller then pivot number:
        for(int i = si + 1; i <= ei; i++){
            if(a[i] < pivotElement){
                smallernumcount++;
            }
        }
        /// 3.> here we create function for the swaping our  pivot element with other number.
        int temp = a[si + smallernumcount];
        a[si + smallernumcount] = pivotElement;
        a[si] = temp; 


        // 4.> here we create function for swaping other values of the array for sorting. using pivot elememt value;
        int i = si;
        int j = ei;
        while(i < j){
            if(a[i] < pivotElement){
                i++;
            }else if(a[j]  >= pivotElement){
                j--;
            }else{
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--; 
            }
        }
        return si + smallernumcount;

    }

    public static void main(String[] args) {
        int a [] = {10,3,5,6,8,9,4,7};
        quickSort(a,0, a.length - 1);
        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
    }


    
}
