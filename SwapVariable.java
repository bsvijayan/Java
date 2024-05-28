import java.util.*;
public class SwapVariable
{
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st Number");
	    int i=sc.nextInt();
	    System.out.println("Enter 2st Number");
	    int j=sc.nextInt();
	    
	    i=i+j;
	    j=i-j;
	    i=i-j;
	    System.out.println("I value "+i);
	    System.out.println("I value "+j);
		
	}
}