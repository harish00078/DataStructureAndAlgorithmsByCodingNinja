package MileStone2.AssignmentProblemOfRecursion;

public class CheckABusingRecursion {

    // Suppose you have a string, S, made up of only 'a's and 'b's. 
    //Write a recursive function that checks if the string was generated using the following rules.
    // following rules are:
    //a. The string begins with an 'a'
    //b. Each 'a' is followed by nothing or an 'a' or "bb"
    //c. Each "bb" is followed by nothing or an 'a'

    // 1.> one way of solution for this problem:
    public static boolean check(String input,int si){
        if(si>=input.length()-1){
            return true;
        }
        if(input.charAt(si)!='a'){
            return false;
        }
        if(input.length()>=3){
            if(input.charAt(si+1)=='b'&& input.charAt(si+2)=='b'){
                boolean ans=check(input,si+3);
                return ans;
            }
            if(input.charAt(si+1)=='a'){
                boolean ans=check(input,si+1);
                return ans;
            }
        }else{
            if(input.charAt(si+1)=='a'){
                return true;
            }
        }
        return false;
        

    }
    public static void main(String[] args) {
        String str = "abb";
        System.out.println(check(str, 0));
    }
	

    /// 2.> other solution for this problem or simple solutin.

    public static boolean checkAB2(String str){

        if(str.length() == 0){
            return true;
        }
        if(str.charAt(0) == 'a'){
            if(str.substring(1).length() > 1 && str.substring(1,3).equals("bb")){
                return checkAB2(str.substring(3));

            }else{
                return checkAB2(str.substring(1));
            }
        }
        return false;
    }
    // public static void main(String[] args) {
    //     String str = "abb";
    //     System.out.println(checkAB2(str));
    // }

}
    

