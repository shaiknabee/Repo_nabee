package arrays_test;
import java.util.Scanner;
public class prime 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}

		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}

		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			count=0;
			for(int j=1;j<=max;j++)
			{
				if(arr[i]%2==0&&arr[i]!=2)
				{
					break;
				}
				if(arr[i]%j==0)
				{

					count++;
				}

			}
			if(count==2)
			{
				System.out.print(arr[i]+" ");
			}

		}


	}
}


