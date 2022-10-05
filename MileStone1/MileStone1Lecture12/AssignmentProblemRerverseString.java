package MileStone1Lecture12;

public class AssignmentProblemRerverseString {
    // in this problem we have reverse each of the string:
    // for example if we have a string like this: Welcome to Coding Ninjas.
    // we have to convert it into in this way: emocleW ot gnidoC sajniN.

    // we also have topic related to this problem: his name is (reverse each word).

    public static String reverseEachWord(String str){  //using this word we can easily convert any string into the reverse string or each word.
        String ans="";
        int currentWordStart=0;
        int i=0;
        for(;i<str.length();i++){
            if(str.charAt(i)==' '){
                //Reverse Current Word
                int currentWordEnd=i-1;
                String reversedWord="";
                for(int j=currentWordStart;j<=currentWordEnd;j++){
                    reversedWord=str.charAt(j)+reversedWord;
                }
                //Add it final String(ans)
                ans+=reversedWord+" ";
                currentWordStart=i+1;
            }
        }
        int currentWordEnd=i-1;
        String reversedWord="";
        for(int j=currentWordStart;j<=currentWordEnd;j++){
            reversedWord=str.charAt(j)+reversedWord;
        }
        ans+=reversedWord;
        return ans;
    }
  
  public static void main(String args[]) {
      String str="abc def ghi jkl";
      System.out.println(reverseEachWord(str));
    } 
}
