package strings_test;
import java.util.Scanner;
public class insertword {
	public static void main(String[]args)
	{

		Scanner sc=new Scanner(System.in);      //str=hi how are you  
		System.out.println("Enter a string");  //h i h o w a r e   y  o   u
		String str=sc.nextLine();             // 0 123 4 567 8 910 11 12  13
		char arr[]=str.toCharArray();          //word==hii
		System.out.println("Enter the word");   //h i i
		String str1=sc.nextLine();             // 0 1 2 
		char word[]=str1.toCharArray();          //position=how               
		System.out.println("Enter where you want to insert"); // h o w
		String str2=sc.nextLine();                           //  0 1 2
		char position[]=str2.toCharArray();
		int count=0,index=0,i,j;
		for( i=0;i<arr.length;i++)
		{
			count=0;
			for( j=0;j<position.length;j++)
			{

				if(arr[i+j]==position[j])
				{
					count++;                         
				}

				index=i+j+1;

			}

			if(count==position.length)
			{

				for( j=0;j<word.length;j++)
				{
					for(int k=arr.length-1;k>index;k--)
					{
						arr[k]=arr[k-1];
					}
				}
				break;
			}

		}

		index=index+1;

		for(int m=0;m<word.length;m++)
		{
			arr[index]=word[m];
			index++;
		}

		for( i=0;i<arr.length;i++)
		{

			System.out.print(arr[i]);
		}
	}

}
