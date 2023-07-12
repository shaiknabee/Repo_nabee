package arrays_test;
import java.util.Scanner;
public class palindrome
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
		int count=0;
		for( int i=0;i<arr.length;i++)
		{
			if(arr[i]==arr[arr.length-1-i])
			{
				count++;

			}
		}

		if(count==(arr.length))
		{
			System.out.println("palindrome");

		}

		else
		{
			System.out.println("not palindrome");
		}
		sc.close();
	}  

}
