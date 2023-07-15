package Git_test;
import java.util.Scanner;
public class squareroot
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				if(i*i==n)
				{
					System.out.println("The squareroot of "+n+"="+i);
				}
				
			}
			
		}
		
	}
}
