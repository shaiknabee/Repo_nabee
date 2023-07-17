package Git_test;
import java.util.Scanner;

//krishnamurthy number is a number you get by adding sum of factorial of its digits...
//if n=145, 1!+4!+5!=145 so 145 is krishnamurthy number

public class test
{
	public static void main(String[] args) 
	{
       int n=user();
       kmn(n);
	}
	public static int user()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		return n;
	}
	public static void kmn(int n)
	{
		int temp=n,prev=0;
		while(temp>0)
		{
			int rem=temp%10;
			int fact=1;
			for(int i=1;i<=rem;i++)
			{
				fact=fact*i;
			}
			prev=prev+fact;
			temp=temp/10;			
		}

		if(prev==n)
		{
			System.out.println(n+" is a krishnamurthy number");
		}
		else
		{
			System.out.println(n+" is not a krishnamurthy number");
		}

	}




}
