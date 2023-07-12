package strings_test;
import java.util.Scanner;
public class trim {

	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String str=sc.nextLine();
	    char arr[]=str.toCharArray();
	    String str1="";
        
	    	for(int i=0;i<arr.length;i++)
	    	{
	    		 if(arr[i]!=' ')
	    		  {
	    		    for(int j=i;j<arr.length;j++)
	    		    {
	    		     str1=str1+arr[j];
	    		    }
	    		    break;
	              }
	    	}
	    	char arr1[]=str1.toCharArray();
	    	String str2="";
	    	
	    	for(int i=arr1.length-1;i>=0;i--)
	    	{
	    		if(arr1[i]!=' ')
	    		{
	    		 for(int j=i;j>=0;j--)
	    		    {
	    		     str2=arr1[j]+str2;
	    		    }

                  break;
	    		}
	    		
	    	}
	    	System.out.print(str2);
	    sc.close();
	}
}
