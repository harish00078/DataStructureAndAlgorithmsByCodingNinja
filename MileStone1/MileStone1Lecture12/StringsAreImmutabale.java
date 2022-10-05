package MileStone1Lecture12;

public class StringsAreImmutabale {

    // here we learn about why we did not able to change the strings.
    public static void main(String args[]) {
        //here we learn about that strings are not changable or adable.
        //means we did not change the once stored string or did not add anything in that string.
      
        // these three strings are using the same refrence number because of the heap string poll storage system
        // String str="abc";
        String str1="abc";
        
        // String str3="abc";

        /// this string store on the different storage as compare to str or str1 and str3.
        //because here we cleary tells that we create a new string using (new)  functon.
        // String str2=new String("abc");

        // in this way are able to modify the string.
        // here we acutally did not modify the string . here we actually create a new string and use other strings elements.
        String str ="xyz";
        str1=str1+"def"+ str;
        System.out.println(str1);
        
        
    }
    
}
