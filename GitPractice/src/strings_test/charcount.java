package strings_test;
import java.util.Scanner;
public class charcount {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String str=sc.nextLine();
	    char arr[]=str.toCharArray();
	    int count=0;
	    for(int i=0;i<arr.length;i++)
	    {
	    	if(arr[i]!=' ')
	    	{
	    		count++;
	    	}
	    }
	    System.out.println(count);
	    sc.close();
	}
}
