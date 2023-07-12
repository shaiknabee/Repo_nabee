package arrays_test;
import java.util.Scanner;
public class arraysum 
{
	public static void main(String[] args)
	{



		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of 1st array");
		int size1=sc.nextInt();
		int arr1[]=new int[size1];
		System.out.println("Enter size of 2nd array");
		int size2=sc.nextInt();
		int arr2[]=new int[size2];


		if(arr1.length==arr2.length)
		{
			System.out.println("Enter elements of 1st array");
			for(int i=0;i<arr1.length;i++)
			{

				arr1[i]=sc.nextInt();
			}
			System.out.println("Enter elements of 2nd array");
			for(int i=0;i<arr2.length;i++)
			{

				arr2[i]=sc.nextInt(); 
			}
			int size3=arr1.length;
			int arr3[]=new int[size3];
			for(int i=0;i<arr2.length;i++)
			{
				arr3[i]=arr1[i]+arr2[i];
				System.out.print(arr3[i]+" ");
			}

		}
		else
		{
			System.out.println("sizes not equal");
		}
		sc.close();
	}
}

