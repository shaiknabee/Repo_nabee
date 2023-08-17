package arrays_test;
import java.util.Scanner;
public class secondlargest 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter array elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{

			for(int j=i;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}

		}
		System.out.println("Second largest number is "+arr[arr.length-2]);
	}
}
