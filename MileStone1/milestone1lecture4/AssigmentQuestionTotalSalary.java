package milestone1lecture4;

import java.util.Scanner;

public class AssigmentQuestionTotalSalary {

    public static void main(String[] args) {
        double basic, totalsalary=0, hra,da,pf,allow=0;
        char grade;
    
		Scanner scan=new Scanner(System.in);
        // System.out.println("Enter a basic salary");
        
        basic=scan.nextFloat();
        // System.out.print("Enter a grade");
        grade=scan.next().charAt(0);
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
        System.out.println(Math.round(totalsalary));
    }
    
}
