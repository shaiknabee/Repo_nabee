package strings_test;
import java.util.Scanner;
public class wordcount {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String str=sc.nextLine();
		char arr[]=str.toCharArray();
		int count=1;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==' ')
			{
				if(!(i==0||i==arr.length-1))
				{
					count++;
				}
				if(arr[i+1]==' ')
				{
					count--;
				}
			}
		}
		System.out.println(count);
		sc.close();
	}
}
