package exceptiohandling;

public class outofbounds
{
	public static void main(String args[]){    
		try
		{    
			int a[]=new int[5]; 
			System.out.println(a[10]);
			
		}    
		catch(ArithmeticException e)
		{
			System.out.println("task1 is completed");
			throw e;
		} 
		 
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("task 2 completed");
			throw e;
		}    
		  
		catch(Exception e)
		{
			System.out.println("common task completed");
			throw e;
		} 
		System.out.println("rest of the code...");    
		

	}  
}
