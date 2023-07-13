package patterns;

public class ztoh {
	public static void main(String[]args)
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if((i==1)||(i==5)||(i==3&&j==3)||(i==2&&j==4)||(i==4&&j==2))

					System.out.print("Z ");
				else

					System.out.print("  ");
			}
			System.out.println();
		}
        
		int m=5;
		System.out.println();
		for(int k=1;k<=m;k++)
		{
			for(int l=1;l<=m;l++)
			{
				if((k==1)||(l==3))

					System.out.print("T ");
				else

					System.out.print("  ");
			}
			System.out.println();
		}
		
		int o=5;
		System.out.println();
		for(int a=1;a<=o;a++)
		{
			for(int b=1;b<=o;b++)
			{
				if((a==1)||(a==5)||(b==1)||(b==5))

					System.out.print("O ");
				else

					System.out.print("  ");
			}
			System.out.println();
		}

		int p=5;
		System.out.println();
		for(int c=1;c<=p;c++)
		{
			for(int d=1;d<=m;d++)
			{
				if((c==3)||(d==1)||(d==5))

					System.out.print("H ");
				else

					System.out.print("  ");
			}
			System.out.println();
		}
	}

}
