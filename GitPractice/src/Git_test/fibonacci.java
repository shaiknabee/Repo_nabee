package Git_test;
import java.util.Scanner;
public class fibonacci {

	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value");
		int n=sc.nextInt();
		int a=0,b=1;
		System.out.print(a+" ");
		System.out.print(b+" ");
		int c=0;
		for(int i=1;i<=n-2;i++)
		{

			c=a+b;
			a=b;
			b=c;
			if(c<=90)
			{
			System.out.print(c+" ");
            }
		}

	}

}
