import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
        double c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number :");
		double a = sc.nextInt();
		System.out.println("Enter second number : ");
		double b = sc.nextInt();
		
		double d = add(a,b);
		System.out.println("Addition is : "+d);
		
		System.out.println("1. Addition 2. Subtraction 3. Multiplication 4. Division 5. Percentage");
		System.out.println("Enter choice : ");
		int ch = sc.nextInt();
		
		
		switch(ch)
		{
		    case 1 :  c = a+b;
		              System.out.println("Addition is : "+c);
		              break;
		              
		              
		    case 2 : c = a-b;
		    		System.out.println("Subtraction is : "+c);
		            break;
		            
		    case 3 : c = a*b;
    			System.out.println("Multiplication is : "+c);
    			break;
    	    
    			
		    case 4 : c = a/b;
		           System.out.println("Division is : "+c);
		           break;
		     
		    case 5 : c = (a/b)*100;
		    		System.out.println("Percentage is : "+c);
		    		break;
		         
		    default : System.out.println("Invalid ");
		    
		
		}
		
		
		
		
		
		
	}

	public static double add(double a, double b) {

		double sum = a+b;
		return 0.0;
	}

}
