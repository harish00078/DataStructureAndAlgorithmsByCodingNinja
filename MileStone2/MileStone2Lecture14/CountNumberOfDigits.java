package MileStone2.MileStone2Lecture14;

public class CountNumberOfDigits {

    public static int count(int n){

        if(n==0)
        {
            return 0;
        }
        int smalloutput = count(n/10); // here we count the number those are given to us.
        // for example if we have (4) elements in the (n) then count will only count the 3. beacuse of the division by 10.
        int output = smalloutput + 1;  // that why here we add that smalloutput value with one.
        return output; // and we have the right output
    
    }



    public static void main(String[] args) {
        
        System.out.println(count(1434));
    }
    
}
