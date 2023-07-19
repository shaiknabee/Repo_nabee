package exceptiohandling;

public class arithmaticexception {
	public static void main(String args[]){    
		try
		{    
			int a=28,b=0,c;
			c=a/b;
			System.out.println(c);
			
			
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
