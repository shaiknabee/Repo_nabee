package Git_test;
import java.util.Scanner;
import java.util.*;
public class gcd 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int n1=sc.nextInt();
		System.out.println("Enter second number");
		int n2=sc.nextInt();
		List<Integer>m=new ArrayList<>();
		int  gcd=0;

		for(int i=1;i<=n1;i++)
		{			
			for(int j=1;j<=n2;j++)

			{
				if((n1%i==0)&&(n2%j==0))
				{
					if(i==j)
					{
	                  if(i>gcd)
	                  {
	                	  gcd=i;
	                  }
	                }
				}			
			}			
		}
		System.out.println("GCD of "+n1+" & "+n2+" is "+gcd);
	}

}

