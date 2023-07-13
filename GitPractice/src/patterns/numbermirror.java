package patterns;

public class numbermirror {
	public static void main(String[]args)
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int sp=4;sp>=i;sp--)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++)
			{

				System.out.print(i-j+1+" ");
			}
			for(int j=2;j<=i;j++)
			{

				System.out.print(j+" ");
			}

			System.out.println();
		}
	}

}
