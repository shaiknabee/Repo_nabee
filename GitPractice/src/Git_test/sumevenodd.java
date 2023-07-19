package Git_test;
import java.util.Scanner;
public class sumevenodd {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value");
		int n=sc.nextInt();
		int temp=n,a=0,b=0,mod;
		while(temp>0)
		{
			mod=temp%10;
			if(mod%2==0)
			{
				a=a+mod;

			}
			else
			{
				b=b+mod;
			}

			temp=temp/10;	
		}
		System.out.println("Sum of even integers is "+a);
		System.out.println("Sum of odd integers is "+b);
		sc.close();
	}
}
