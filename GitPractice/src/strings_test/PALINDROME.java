package strings_test;
import java.util.Scanner;
public class PALINDROME {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String str=sc.nextLine();
	    char arr[]=str.toCharArray();
	    
	    char arr1[]=str.toCharArray();
	    char temp=0;
	    for(int i=0;i<arr.length/2;i++)
	    {
	    	temp=arr[i];
	    	arr[i]=arr[arr.length-1-i];
	    	arr[arr.length-1-i]=temp;
	    }
	    int count=0;
	    for(int i=0;i<arr.length;i++) 
	    {
	         if(arr[i]==arr1[i])
	         {
	         	count++;
	         }
	  
        }
	    if(count==arr.length)
	    {
	    	System.out.println("palindrome");
	    }
	    else
	    {
	    	System.out.println("not a palindrome");
	    }
	    
	    sc.close();
	}

}
