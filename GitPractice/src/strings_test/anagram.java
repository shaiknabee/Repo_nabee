package strings_test;
import java.util.Scanner;
public class anagram 
{
	public static void main(String[] args) 
	{
		
		String str1="LISTEN";
		char []arr1=str1.toCharArray();
		String str2="SILENT";
		char []arr2=str2.toCharArray();
		if(arr1.length==arr2.length)
		{
			for(int i=0;i<arr1.length;i++)
			{
				for(int j=i+1;j<arr1.length;j++)
				{
					if(arr1[i]>arr1[j])
					{
						char temp=arr1[i];
						arr1[i]=arr1[j];
						arr1[j]=temp;
					}
				}
			}
			for(int i=0;i<arr2.length;i++)
			{
				for(int j=i+1;j<arr2.length;j++)
				{
					if(arr2[i]>arr2[j])
					{
						char temp=arr2[i];
						arr2[i]=arr2[j];
						arr2[j]=temp;
					}
				}
			}
			int count=0;
			for(int i=0;i<arr1.length;i++)
			{
				
				if(arr1[i]==arr2[i])
				{
					count++;
				}
			}
			if(count==arr1.length)
			{
				System.out.println(str1+" is an anagram to "+str2);
			}
			else
			{
				System.out.println(str1+" is not an anagram to "+str2);
			}
				
			
		}

		else
		{
		}

	}
}
