package strings_test;
import java.util.Scanner;
public class stringsubdivision {
public static void main(String[] args) {
		
		
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a string");
			String str=sc.nextLine();
			char arr[]=str.toCharArray();
			int count=0,count1=0,count2=0,count3=0;
			
			for(int i=0;i<arr.length;i++)
			{
				System.out.print("");
				count3++;
				
			}
			System.out.println();
			System.out.println("vowels are");
			for(int i=0;i<arr.length;i++)
			{
				if((arr[i]=='a')||(arr[i]=='e')||(arr[i]=='i')||(arr[i]=='o')||(arr[i]=='u'))
				{
					System.out.print(" "+arr[i]);
					count++;
				}
				
			}
			System.out.println();
			System.out.println("consonants are ");
			for(int i=0;i<arr.length;i++)
			{
				if((arr[i]!='a')&&(arr[i]!='e')&&(arr[i]!='i')&&(arr[i]!='o')&&(arr[i]!='u')&&arr[i]!=' ')
				{
					System.out.print(" "+arr[i]);
					count1++;
				}
			}
			
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]==' ')
				{
					count2++;
				}
			}
			
			System.out.println();
			System.out.println("no. of vowels are "+count);
			System.out.println("no. of consonants are "+count1);
			System.out.println("no. spaces are "+count2);
			System.out.println("total no. characters are "+count3);
			   sc.close();
		}
	}

}
