package strings_test;
import java.util.Scanner;
public class substring 
{ 
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=sc.nextLine();
		char arr[]=str.toCharArray();
		System.out.println("Enter a substring");
		String sub=sc.nextLine();
		char arr1[]=sub.toCharArray();

		int count;
		for(int i=0;i<arr.length;i++)
		{
			count=0;
			for(int j=0;j<arr1.length;j++)
			{
				if(arr[i+j]==arr1[j])
				{
					count++;

				}
				else
				{
					break;
				}
			}
			if(count==arr1.length)
			{
				System.out.println("substring is at middle position");
            }
			
		}
		
	}
}
