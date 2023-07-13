package strings_test;
import java.util.Scanner;
public class stringafterchar {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=sc.nextLine();
		char arr[]=str.toCharArray();

		System.out.println("Enter a character after which you want to print the string");
		char ch=sc.next().charAt(0);
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==ch)
				{
					System.out.print(arr[j]);
				}
				
			}


		}
		sc.close();
	}


}
