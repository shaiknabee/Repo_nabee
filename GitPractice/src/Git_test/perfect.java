package Git_test;
import java.util.Scanner;
public class perfect 
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();

		for(int i=1;i<=n;i++)
		{
			int sum=0;

			for(int j=1;j<i;j++)
			{
				if(i%j==0)
				{
					sum=sum+j;
				}
			}
			if(sum==i)
			{
				System.out.println(sum+" ");
			}

		}	
		sc.close();	
	}

}
