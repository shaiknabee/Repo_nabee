package strings_test;
import java.util.Scanner;
public class substringend {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=sc.nextLine();
		char arr[]=str.toCharArray();
		System.out.println("Enter a substring");
		String sub=sc.nextLine();
		char arr1[]=sub.toCharArray();

		int count=0;
		
		
		for(int i=0;i<arr1.length;i++)
			{
			  if(arr[arr.length-1-i]==arr1[arr1.length-1-i])
			  {
			  	count++;
			  	
			   }
			}
		
		
		if(count==arr1.length)
		{
			System.out.println("substring is at ending position");
		}
		else
		{
			System.out.println("substring is not at ending position");
		}
		sc.close();
	}
}
