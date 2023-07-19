package exceptiohandling;

public class trycatch {
	public static void main(String args[])
	{  
		int a=20,b=8,c;
	    c=a+b;
	    System.out.println("the add of "+a+" and "+ b+" is "+c);
		try
		{  
			int d=0,e;
			e=a/d;
			System.out.println(d);

		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		} 
		
	}  

}
