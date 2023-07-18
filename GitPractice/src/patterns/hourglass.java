package patterns;

public class hourglass 
{
	public static void main(String[] args) 
	{
		int n=10;
		for(int i=1;i<=n;i++)
		{
			for(int sp=1;sp<i;sp++)
			{
				System.out.print(" ");
			}
			for(int j=n;j>=i;j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

		for(int i=1;i<=n;i++)
		{
			for(int sp=n-1;sp>=i;sp--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}
}
