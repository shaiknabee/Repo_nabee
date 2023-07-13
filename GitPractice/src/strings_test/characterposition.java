package strings_test;
import java.util.Scanner;
public class characterposition {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String str=sc.nextLine();
	    char arr[]=str.toCharArray();
	    System.out.println("Enter a character you want to find");
	    char ch=sc.next().charAt(0);
	    
	    for(int i=0;i<arr.length;i++)
	    {
	    	if(arr[i]==ch)
	    	{
	    		System.out.print((i+1)+" ");
	    	}
	    }
	    
	    sc.close();
	}
}
