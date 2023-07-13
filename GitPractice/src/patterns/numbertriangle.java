package patterns;

public class numbertriangle {
	public static void main(String[]args)
	{
		int n=5,count=n;
		for(int i=1;i<=n;i++)
		{
			for(int sp=1;sp<=i-1;sp++)
			{
				System.out.print(" ");
			}
			for(int j=5;j>=i;j--)
			{

				System.out.print(count);
			}
			count--;
			System.out.println();
		}
	}

}
