package strings_test;
import java.util.Scanner;
public class duplicate 
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String str=sc.nextLine();
	    char arr[]=str.toCharArray();
	
	    for(int i=0;i<arr.length;i++)
	    {
	    	int count=0;
	    	for(int j=i+1;j<arr.length;j++)
	    	{
	    		if(arr[i]==arr[j])
	    		{
                    count++;
	    			arr[j]=' ';	
	    		}
	    		
	    	}	
	    	if(count>0&&arr[i]!=' ')
	    	{
	    		
	    		System.out.print(arr[i]+" ");
	    	}
	    	
	    	sc.close();
	    }
	    
	    
	}
}
