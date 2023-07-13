package patterns;

public class pascal {

	public static void main(String[]args)
	{
		int n=5,res=0;
		for(int i=0;i<=n;i++)
		{

			for(int sp=n-1;sp>=i;sp--)
			{
				System.out.print(" ");
			}

			for(int j=0;j<=i;j++)
			{
				int ifact=1;
				for(int k=1;k<=i;k++)
				{
					ifact=ifact*k;
				}

				int ijfact=1;
				for(int l=1;l<=i-j;l++)
				{
					ijfact=ijfact*l;
				}

				int jfact=1;
				for(int m=1;m<=j;m++)
				{
					jfact=jfact*m;
				}

				res=ifact/(ijfact*jfact);
				System.out.print(res+" ");
			}
			System.out.println();

		}
	}
}
