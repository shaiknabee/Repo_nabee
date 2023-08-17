package strings_test;
import java.util.Scanner;
public class insertchar
{
	public static void main(String[] args) 
	{
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter a String");
       String str=sc.nextLine();
       System.out.println("Enter a Character");
       char ch=sc.next().charAt(0);
       System.out.println(str+ch);     
	}
}
