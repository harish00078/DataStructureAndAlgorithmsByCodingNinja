package MileStone2.MileStone2Lecture17;

// import java.util.Scanner;

public class Polynomial {

    private int polynomial_arr[] = new int[10]; // here we create a dynamic array for this problem:
    // because user can any long number polynomial equation as  a input so we have to the dynamic array:
    
	
	///  here we create setter function for  set the values for the degree and coefficient:
	public void setCoefficient(int degree, int coeff){
        if (degree >= polynomial_arr.length){
           int []arr2 = new int[degree+1];
            for(int i=0;i<this.polynomial_arr.length;i++){
                arr2[i] = this.polynomial_arr[i];
            }
            arr2[degree] = coeff;
            this.polynomial_arr = arr2;
        }
        else
            polynomial_arr[degree]=coeff;
        
        
		
	}
	
	// Prints all the terms(only terms with non zero coefficients are to be printed) in increasing order of degree. 
	public void print(){
		for (int i = 0; i<polynomial_arr.length; i++){
            if (polynomial_arr[i]!=0){
                System.out.print(polynomial_arr[i]+"x"+i+" ");
            }
        }
	}

	
	// Adds two polynomials and returns a new polynomial which has result
	public Polynomial add(Polynomial p){
        //int larger = Math.max(this.polynomial_arr.length,p.polynomial_arr.length);
        int n = this.polynomial_arr.length;
        int m = p.polynomial_arr.length;
        if(n>m){
            for(int i=0;i<m;i++){
                this.polynomial_arr[i]=this.polynomial_arr[i]+p.polynomial_arr[i];
            }
         }
        else{
            for(int i=0;i<n;i++)
                p.polynomial_arr[i]=this.polynomial_arr[i]+p.polynomial_arr[i];
            return p;
        }
        return this;
	}
	
	// Subtracts two polynomials and returns a new polynomial which has result
	public Polynomial subtract(Polynomial p){
	 	int n=this.polynomial_arr.length;
        int m=p.polynomial_arr.length;
        int k=Math.max(m,n);
        int sum[]=new int[k];
        if(n>m){
            for(int i=0;i<m;i++)
            {
                sum[i]=p.polynomial_arr[i];
            }
        }
        else
        {
            for(int i=0;i<n;i++)
                sum[i]=this.polynomial_arr[i];
        }
   
        if(n>m)
        {
            for(int i=0;i<k;i++)
                this.polynomial_arr[i]=this.polynomial_arr[i]-sum[i];
        }
        else
        {
            for(int i=0;i<k;i++)
                p.polynomial_arr[i]=sum[i]-p.polynomial_arr[i];
            
            return p;
        }
        return this;	
	}
	
	// Multiply two polynomials and returns a new polynomial which has result
	public Polynomial multiply(Polynomial p){
		int m=this.polynomial_arr.length;
        int n=p.polynomial_arr.length;
        int arr2[]=new int[m+n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr2[i+j]+=this.polynomial_arr[i]*p.polynomial_arr[j];
            }
                
        }
        this.polynomial_arr = arr2;
        return this;
	}

   

   
    // public static void main(String[] args) {
		
	// 	Scanner s = new Scanner(System.in);
	// 	int n = s.nextInt();
	// 	int degree1[] = new int[n];
	// 	for(int i = 0; i < n; i++){
	// 		degree1[i] = s.nextInt();
	// 	}
	// 	int coeff1[] = new int[n];
	// 	for(int i = 0; i < n; i++){
	// 		coeff1[i] = s.nextInt();
	// 	}
	// 	Polynomial first = new Polynomial();
	// 	for(int i = 0; i < n; i++){
	// 		first.setCoefficient(degree1[i],coeff1[i]);
	// 	}
	// 	n = s.nextInt();
	// 	int degree2[] = new int[n];
	// 	for(int i = 0; i < n; i++){
	// 		degree2[i] = s.nextInt();
	// 	}
	// 	 int coeff2[] = new int[n];
	// 	for(int i = 0; i < n; i++){
	// 		coeff2[i] = s.nextInt();
	// 	}
	// 	Polynomial second = new Polynomial();
	// 	for(int i = 0; i < n; i++){
	// 		second.setCoefficient(degree2[i],coeff2[i]);
	// 	}
	// 	int choice = s.nextInt();
	// 	Polynomial result;
	// 	switch(choice){
	// 	// Add
	// 	case 1: 
	// 		 result = first.add(second);
	// 		result.print();
	// 		break;
	// 	// Subtract	
	// 	case 2 :
	// 		 result = first.subtract(second);
	// 		result.print();
	// 		break;
	// 	// Multiply
	// 	case 3 :
	// 		 result = first.multiply(second);
	// 		result.print();
	// 		break;
	// 	}

	// }
   
    
}
