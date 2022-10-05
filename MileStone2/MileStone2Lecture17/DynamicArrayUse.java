package MileStone2.MileStone2Lecture17;

public class DynamicArrayUse {

    public static void main(String[] args) {
         
        DynamicArray d = new DynamicArray(); // here we create array using dyamic array function:

        for(int i = 1; i < 100; i++){  // here use array to create elements for the array:
            d.add(100 + i); // here we add 100 plus value using  ith  for loop:
        }
        System.out.println(d.size());// here we use the size function to  check the  size of the array:
        System.out.println((d.get(2)));  // using this function we can get the array value: that what is the value present at this particular index:
        d.set(3, 170);// here we use set function for set the value in array at a particular index:
        System.out.println(d.get(3));  //after set the value in the array we call getter function. to check the value in the array that we set using setter function: 

        while(!d.isEmpty()){  // here we create a whilemloop  for util the  array is not equal to empty function.means zero;
            System.out.println(d.removeLast()); // then continously remove the every element of the array: using removelast function:
            System.out.println("size - " + d.size()); // we check the size of the array. that how much eelements are present in the array. we use size function:
        }
    }
    
}
