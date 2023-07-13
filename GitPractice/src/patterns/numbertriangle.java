package patterns;

public class numbertriangle {
	public static void main(String[]args)
	{
		int n=4 ,count=0;
		for(int i=1;i<=n;i++)
		{
			for(int sp=3;sp>=i-1;sp--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				count=count+1;
				System.out.print(count+" ");
			}
			System.out.println();
		}
	}

}
