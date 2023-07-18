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
		for(int i=1;i<n1;i++)
		{
			int max=0,min=0;
			for(int j=1;j<n2;j++)
			{
				if((n1%i==0)&&(n2%j==0))
				{
					if(i==j)
					{
	                   
	                   m.add(i);
					}

				}
			
			}
			
		}
		System.out.println("GCD of "+n1+" & "+n2+" is "+Collections.max(m));
	}

}
