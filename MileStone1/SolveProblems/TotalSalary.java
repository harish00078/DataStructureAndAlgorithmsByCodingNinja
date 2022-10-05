package SolveProblems;

import java.util.Scanner;
import java.lang.Math; // this is the method that used in the java.when we want  to work on the mathematical functions.


public class TotalSalary {
    public static void main(String[] args)
    {
        double basic, totalsalary=0, hra,da,pf,allow=0;
        char grade;
    
		Scanner scan =new Scanner(System.in);
        // System.out.println("Enter a basic salary");
        
        basic=scan.nextInt();
        // System.out.print("Enter a grade");
        grade=scan.next().charAt(0);  // this is the new thing i learned here.that instead of converting a string into the char. i can direclty do this to convert string into the char.
        // System.out.print(basic+""+grade);
        hra=(20.0/100.0)*basic;
        da=(50.0/100.0)*basic;
        if (grade=='A')
            allow=1700.0;
        else if(grade=='B')
                 allow=1500.0;
        else
            allow=1300.0;
        pf=(11.0*basic)/100.0;
        totalsalary=basic+hra+da+allow-pf;
        System.out.println(Math.round(totalsalary));// (math.round) is the function of (Math) method. we use it for rounding off our total salar value.
    }    

}

    
    

