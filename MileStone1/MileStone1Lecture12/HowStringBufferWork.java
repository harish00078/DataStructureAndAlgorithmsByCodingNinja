package MileStone1Lecture12;

public class HowStringBufferWork{

    public static void main(String[] args) {


        // string buffer is use to change or upgrade the string.
        
        // StringBuffer str = new StringBuffer("abc");
        // str.setCharAt(0,'d'); // here we change the (abc) string value .
        // here we change the 0th index of the string . means here (abc) will become (dbc)
        // System.out.println(str);

        // str.append("def");  // we can also use append function if we want to add something in our string.


        String s = "d";
        for(int i = 0; i <5; i++){  // we can also use for loop to change the some value in the sring continously.
            s = s + 'z';
        }System.out.println(s);
    }





}

          



