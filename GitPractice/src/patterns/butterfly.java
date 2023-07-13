package patterns;

public class butterfly {
	public static void main(String[] args)
	{
		int n=6,sp;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			for(sp=(2*(n-i)-1);sp>=1;sp--)
			{ 
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				if(k<n)
				{
					System.out.print("*");
				}
			}
			System.out.println();	
		}


		for(int i=1;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				System.out.print("*");
			}
			for(sp=1;sp<2*i;sp++)
			{
				System.out.print(" ");
			}
			for(int k=i;k<n;k++)
			{
               System.out.print("*");
			}
			System.out.println();
		}
	}


}
