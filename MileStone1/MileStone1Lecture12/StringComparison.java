package MileStone1Lecture12;

public class StringComparison {
    // here  we learn that how the string comparison works or what happen if we compare to strings.

    public static void main(String args[]) {

        // difference between the compare or equal fucntion:
        // compare =  comparison function will check the refrence of the strings or other datatypes
        // equal = equal function basically check there values or elements.
      
        String str="abc";
        String str1="abc";
        String str3=new String("abc");

        // if we compare two different string : means two strings those have different refrence address.
        // then they will gave us "both are not equal."
        // if(str==str3){ 
        //    System.out.println("Both are equal");
        // }
        // else{
        //     System.out.println("Both are not equal");
        // }
       
        // if we check they are (equal) means when we use (equal function): it means that they have same value or element . 
        //when we use equal function it will tell us that " both are equal".
        // if(str.equals(str3)){
        //     System.out.println("Both are equal");
        //  }
        // else{
        //     System.out.println("Both are not equal");
        // }



        // comparison function will only tell that (both the values are equal) when they both the values are sharing  a same refrence number.

        if(str1==str){
            System.out.println("Both are equal");
        }
        else{
            System.out.println("Both are not equal");
        }


        // here equal will also tells that both the values are equal.
        if(str1.equals(str)){
            System.out.println("Both are equal");
        }
        else{
            System.out.println("Both are not equal");
        }

      
        
      }
    
}
