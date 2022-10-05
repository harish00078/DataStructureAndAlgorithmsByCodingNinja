package MileStone1Lecture12;

public class ReverseEachWordOfString {

    // bascilly here we revsere each word of the string.

    // here we reverse the string in word wise manner. or means using each alphabet of the string
    
    // for eaxmple if we have  input of : abc def kgf
    // we have to convert it into reverse like : cba fed fgk.


    public static String reverseEachWord(String str){
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
