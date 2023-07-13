package strings_test;
import java.util.Scanner;
public class replaceword {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=sc.nextLine();      
		char arr[]=str.toCharArray();   
		System.out.println("Enter the word you want to insert");
		String str1=sc.nextLine();
		char word[]=str1.toCharArray(); 
		System.out.println("Enter the position you want to insert");
		String str2=sc.nextLine();
		char position[]=str2.toCharArray();
		int count=0,index=0;
		for(int i=0;i<arr.length-1;i++)
		{
			count=0;
			for(int j=0;j<position.length;j++)
			{
				if(arr[i+j]==position[j])
				{
					count++;
				}
				else
				{
					break;
				}
				index=i+j+1;
			}

			if(count==position.length)
			{
                int j=0;
				for(int k=i;k<index;k++)
				{
					arr[k]=word[j];
					j++;
					if(j>word.length)
					{
						break;
					}
				}


			}


		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}
	}

}
