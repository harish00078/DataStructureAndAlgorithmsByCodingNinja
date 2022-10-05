package MileStone2.MileStone2Lecture18;



public class ExceptionDemo {

    // this is from the Exception topic - 2;
    // we can also try other eaxmple of the exception handling or we can say that we can try more checked exceptions::
    // for example if i want to create error for the fractorial function: and can we handle this error or pass it to the main class for handle it:

        // public static int fact(int n)throws NegativeArraySizeException{  // we can handle through the exception by using pass function:



    // we can do is that we can handle it by our own self:using (try) and (catch) function:
    public static int fact(int n) throws NegativeNumberException{
        if(n < 0){
            // throw new NegativeNumberException();
        }
        int ans =1;
        for(int i = 2; i <= n; i++){
            ans = ans * i;
        }
            return ans;
        }

   



    // this is from the Exception topic -1;

    public static int divide(int a,int b) throws DivideByZeroException{
        if(b == 0){
            // throw new DivideByZeroException();/// here we use that Exception error that we created:
            // the Exception that we are created it is only a checked exception:
            // here we have two methods to deal with the checked Exception that we created:
            ///1. we can handle it by our owm self:
            // 2. or we can pass it to the main class that deal with our code error: because in main class we try to print this function:
            // throw new ArithmeticException();
        }
        return a/b;
    }

    // public static void main(String[] args) throws DivideByZeroException { /// here we use main class asm throws error:
        // but if i want that main class will handled the error by it self:
        // for this we can use the (try) and (catch) fucntion:


    public static void main(String[] args){

    


        // these are the unexpected error that were through  by system it slef:
        // System.out.println(4/0);
        // System.out.println("main");

        // divide(10, 0); // after creating our error or checked error we can see that:
        // it throw us a error before we start runing this code:
        // in this way can create our own error or use it:
        // know one how throughs the wrong input for the divide fucntion they  can see this erro before running its code:
        
        // working of our own error: in output we can see that this function  willl firstly call the main fucntion and then check the error:
        //  if In main class divide function throughs any error then.system will jump on the divide function for checking the error:
        // when it check the error in the divide function. if it found error then it will print the error that we created: for divide function: 

        // we can also use the main class to direclty throws the error: that we created


        // imp: we can also did not print any thing after the system throughs the error:
        // System.out.println("main"); // here we can clrealy see that:

        
        
        // here we use the (try) and (Catch) fucntion for handling the error:
        // what (try) and(catch) function will do it will basicallly Return  error as a output form.so in this way our system will not through any error  that will break our excution system.
        // in this way this will handle the error:
        // try and catch function also working acc to the  sequnce of write code pattern:

        // like: if divide function if working then it will working on the divide function not on the other factorail function;
        // so we have to also use try and catch fucntions carefully:
        try {
            divide(10, 5); // here if we have interger those can we divided with each other then try function will return the string that i write here:(withIN try)
            System.out.println(fact(-1)); // here we try to work on the factorial function:if it is workable then it will simply return output as (within try:)
            System.out.println("within try");
            
        } catch (DivideByZeroException e) {
            //TODO: handle exception
            System.out.println("divide by zero Exception");
        }catch (NegativeNumberException e) {
            //TODO: handle exception
            System.out.println("negative number Exception");
        }finally{ // finally: java finally block is a block that is used to execute important code such as closing connection, stream etc.
            // java finally block is always executed whether exception is handled or not:
            // basically used to tell that (our code is completed), (our function is completed), (our code sequnce is completed): through writing some commment in the finally function:
            System.out.println("finally");
        }
       
        
        
        System.out.println("main");// here we can clearly see that our output function is working fine:
        // because of the try and catch function:







   



   
    }
   
    
}
