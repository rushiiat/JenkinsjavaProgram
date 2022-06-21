import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
        int c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number :");
		int a = sc.nextInt();
		System.out.println("Enter second number : ");
		int b = sc.nextInt();
		
		System.out.println("1. Addition 2. Subtraction 3. Multiplication 4. Division");
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
		           
		         
		    default : System.out.println("Invalid ");
		    
		
		}
		
		
		
		
		
		
	}

}
