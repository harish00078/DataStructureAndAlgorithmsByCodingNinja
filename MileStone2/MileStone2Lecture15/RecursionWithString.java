package MileStone2.MileStone2Lecture15;

public class RecursionWithString {

    public static String replaceChar(String s,char a,char b){
        // here (s) represent the string;
        // here (a) represent the replacing character;
        // here (b) is replacable character with;
        if(s.length()==0){ // here we firstly check the string  length.
            return s; // if it is empty string  then we return the output (s);
        }
        // here we create the recursive function for small string  :
        String smallOutput=replaceChar(s.substring(1),a,b);
        // here (a) represent the replacing character;
        // here (b) is replacable character with;
        
        if(s.charAt(0)==a){ // here we check that string character at 0th index is (a)
            return b+smallOutput; // if it is (a) then return the output as b+smalloutput;
        }else{
            return s.charAt(0)+smallOutput; // else return string character at 0th index with smalloutput;
        }
    }
    public static void main(String[] args){
        System.out.println(replaceChar("abcxdxex",'x','y'));
    }
    
    
}
