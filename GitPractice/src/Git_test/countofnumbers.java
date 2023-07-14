package Git_test;
import java.util.Scanner;
public class countofnumbers {
	public static void main(String[]args)
	{    
		Scanner sc=new Scanner(System.in);

		int option=1,a=0,b=0,c=0;
		while(option>0)
		{
			System.out.println("Enter a value");
			int n=sc.nextInt();
			if(n>0)
			{
				a++;

			}
			else if(n<0)
			{
				b++;

			}
			else
			{
				c++;

			}
			System.out.println("Enter option 1 to continue and 0 to exit");
			option=sc.nextInt();
		}
		System.out.println("positive numbers are "+a);
		System.out.println("negative numbers are "+b);
		System.out.println("zeroes are "+c);
		sc.close();
	}

}
