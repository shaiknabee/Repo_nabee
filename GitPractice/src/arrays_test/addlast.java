package arrays_test;
import java.util.Scanner;
public class addlast
{
	public static void main(String[]args)
	{


		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int size=sc.nextInt();

		int arr[]=new int[size];
		System.out.println("Enter elements of array");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("enter a new element");
		int ele=sc.nextInt();

		for(int i=0;i<arr.length-1;i++)
		{
			arr[i]=arr[i+1];
		}
		arr[arr.length-1]=ele;
		System.out.println("new array is ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(" "+arr[i]);
		}
		sc.close();
	}
}
