package strings_test;
import java.util.Scanner;
public class characteroccurence {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=sc.nextLine();
		char arr[]=str.toCharArray();
		int count=1,count1=1;
		for(int i=0;i<arr.length;i++)
		{
			count=1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					arr[j]='_';
				}
				else
				{
					count1=1;
				}
			}
			if(count>=2&&arr[i]!='_')
			{
				System.out.println(arr[i]+" :"+count);
			}
			else if(count1==1&&arr[i]!='_')
			{
				System.out.println(arr[i]+" :"+count1);
			}

		}
	}
}


