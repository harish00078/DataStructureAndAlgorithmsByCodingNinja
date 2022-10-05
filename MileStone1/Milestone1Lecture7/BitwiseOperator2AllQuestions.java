package Milestone1Lecture7;



public class BitwiseOperator2AllQuestions {

    public static void main(String[] args) {


        // Question number (6).
        int x = 10;
        int y = 20;
        
        if(x++ > 10 || ++y > 20){
            System.out.println("inside if");
        }else{
            System.out.println("inside else");
        }
        System.out.println(x + " " + y);
        
      

        
        
        // Question number (5).

        // int x = 10;
        // int y = 20;

        // if(x++ > 10 && ++y > 20){
        //     System.out.println("inside if");
        // }else{
        //     System.out.println("inside else");
        // }
        // System.out.println(x + " " + y);
        

        // Question number(4)
        int g = 3;
        System.out.println(++g * 8); // here it will gave us a value of (32).
        // beacuse (++g) will convert 3 to 4. and then 4 * 8 = 32.
        

        // // question number 3;
        // int x = 15;
        // int y = x++;  // here x become (16) the value of y

        // int z = ++x; // but here it will chnage the value by (17) and also change the varaible from y to z
        // System.out.println(y + " " + z);   // here x = 15 and y = 17;




        // // question number (2):
        // int x, y= 1;
        // x = 10;
        // if(x != 10 && x/0 == 0){
        //     System.out.println(y);
        // }else{
        //     System.out.println(++y); // else is the right statement here it will print the value of(2)
        }





    //     // Question number (1)
    //     int a = 42; // firslty it will convert value 42 into binary number and change it into (~a) compliment operater and then print the output of (-43);

    //     int b = ~a;   //(there is  a tilde sign before a )
    //     System.out.println(a + " " + b);
    // }
    
}
