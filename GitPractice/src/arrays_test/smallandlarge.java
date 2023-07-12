package arrays_test;
import java.util.Scanner;
public class smallandlarge 
{
	public static void main(String[]args)
	{


		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.print("Enter elements of array");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int min=arr[0];
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];

			}
			if(arr[i]>max)
			{
				max=arr[i];

			}

		}

		System.out.println("minimum value in the array  is "+min+" maximum value in the array  is "+max);

		sc.close();
	}
}

