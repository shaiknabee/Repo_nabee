package Git_test;
import java.util.Scanner;
public class primeupto1000 
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value");
		int n=sc.nextInt();
        System.out.println("Prime numbers within: "+n+" are ");
		for(int i=2;i<=n;i++)
		{
			int sum=0;
			{
				for(int j=2;j<i;j++)
				{
					if(i%j==0)
					{
						sum++;
					}
				}
				if(sum==0)
				{
					System.out.print(i+" ");

				}
				
			}
		}
		sc.close();
	}
}
