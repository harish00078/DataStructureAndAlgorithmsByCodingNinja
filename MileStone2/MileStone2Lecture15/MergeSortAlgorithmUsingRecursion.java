package MileStone2.MileStone2Lecture15;

public class MergeSortAlgorithmUsingRecursion {

       // use merge sort to sort the array gave that output to the user;

    //1.> In this function we split the array and sorted them using recursion.

    public static void mergeSort(int a []){

        if(a.length <= 1){  // here we firstly define the length of the array.
            return;
        }
        int b []  = new int [a.length/2]; // here we create the first half of the  array.
        int c [] = new int[a.length - b.length]; // here we create the second half of the array.
 
        for(int i= 0; i < a.length/2;i++){ // here we define the length of the first half of the array.
            b[i] = a[i];// here we create the first of the array;
         }
 
         for(int i = a.length/2; i < a.length;i++){ // here we define length of the second half of the array:
             c[i - a.length/2] = a[i]; // here we create the second half of the array.
         }
         mergeSort(b);// here we sort first half of the array;
         mergeSort(c); // here we sort second half of the array;
         merge(b,c,a); // and here we merge the first soreted  half and second soerted half into the given array.
 
     }
 
     //2. here we compare the two split sorted arrays values and combine them into the given array.
     // we have to also merger them into the sorted form .
     // so in this function we aslo have to compare two sperated array values and then put them into the given array;
     //  gave output the user.
 
     public static void merge(int [] s1, int []s2, int []d){
         // here s1 = represent the first half of the array.
         // her s2 = represent the second half of the array.
         int i = 0; // here we create first vairable that represent the first half array length.
         int j = 0; // here we create second variable that represent the second helf arrray length.
         int k = 0; // here we create third variable that repersent the given array.were we put our values of the two sorted arrays.
         while(i < s1.length && j < s2.length){ // here we define the length of first half and second half sorted array
             if(s1[i] <= s2[j]){ // here  if first half value is less then equal to second half value:
                 d[k] = s1[i];  // then we put the first half value  in the given array [k];
                 i++; // and then jump on the next value of the first half.
                 k++; // and also jump on the next empty for having next value.
             }else{  // else if second sorted half value is less then the first sorted half then we put second sorted half value in the given array[k]
                 d[k] = s2[j]; // here we put the value in the given array[k].
                 k++; // and jump on the next empty index of the array.
                 j++; // and also jump on the next value of the second sorted half:
             }
         }
 
         // here we put the other left values of the first and second half.
         // because if any chance  one them is small then other it.
         // it means one of them will have left some values.
         // for put that values in the given array we simple copy them and put them in the given array
         // there is no need to sort them again because they  are already sorted.
         if(i < s1.length){ // here we define the length of the (i) varaible
             while(i < s1.length){   // here we use loop to put that left value of the first half into the given array.
                 d[k] = s1[i];
                 i++;
                 k++;
 
             }
         }
         if(j < s2.length){ // here we define the length of the (j) variable:
             while(j < s2.length){ // here we  use loop to put the left  values of the second half into the given array:
                 d[k] = s2[j];
                 k++;
                 j++;
             }
         }
 
     }
 
     public static void main(String[] args) {
 
         int a[] = {10,4,5,9,8,6,12,11,7};
         mergeSort(a); // here we have the output of the mergesort.
         // and using for loop we print the merge sort function output.
         for(int i = 0; i < a.length;i++){
             System.out.println(a[i]);// here we use the for loop to print the sorted array using merge sort with recursion.
         }
     }
    
}
