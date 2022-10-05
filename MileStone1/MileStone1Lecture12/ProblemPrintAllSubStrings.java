package MileStone1Lecture12;

public class ProblemPrintAllSubStrings {
    // here we find all the substrings of the string.

    // this problem work acc to its question or main function

    public static void printSubstrings(String str){
        /* for(int start=0;start<str.length();start++){
             //We will be printing all substrings starting with char at index start
             for(int end=start;end<str.length();end++){
                 System.out.println(str.substring(start,end+1));
             }
         }*/
         for(int len=1;len<=str.length();len++){
             //We have to print all strings wih length as "len"
             for(int start=0;start<=str.length()-len;start++){
                 int end=start+len-1;
                 System.out.println(str.substring(start,end+1));
             }
         }
   }
       
       public static void main(String args[]) {
           String str="pqrs";
           printSubstrings(str);
   }
    
}
