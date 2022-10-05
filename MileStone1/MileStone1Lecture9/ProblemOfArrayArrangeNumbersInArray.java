package MileStone1Lecture9;

public class ProblemOfArrayArrangeNumbersInArray {

    // problem = Arrange Numbers In Array.
    /// this problem will work acc to the problem question and its main function file:

    public static void arrange(int arr [], int n){

        int k = n;

        for(int i = 0; i < n; i++){

            // using this if statements we print the odd numberes.
            if(i < (n/2)){  // here it fristly check that i < n divided by 2.
                arr[i] = (2 * i) + 1;  // after checking that if statement is true.here we use increment  order to print the odd number in the array.
                // because firstly we print the smallest value of the odd number.
                // for exmaple n = 6:
                // then firslty we print 1 and then 3. means that we are inceasing the odd value.


                
            } 
            else if(i == n/2){   //  here we check that i == n/2.
                arr[i] = n; // if (else if) statement is true then print (n) value in the array
            }

            // using this if statements we print the even numbers:
            else if(i > n/2){  // here we use decrement order to print the even values. beacuse firlsty we start to print the biggest values of the even.
                // for example n = 6:
                //  then firslty we print the 6: then 4. means we are decreasing in the even values:
                if(k%2 == 0){
                    k = k -2;
                    arr[i] = k;
                }
                else{
                    k = k -1;
                    arr[i] = k;
                }
            }
        }
    }
    
}
