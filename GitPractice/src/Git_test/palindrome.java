package Git_test;
import java.util.Scanner;
public class palindrome
{ 
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value");
		int n=sc.nextInt();
		int temp=n,tempo=n,sum=0,pre=0,mod;
		while(temp>0)
		{
			temp=temp/10;
			sum=sum+1;
		}
		while(tempo>0)
		{
			mod=tempo%10;
			pre=(pre*10)+mod;
			tempo=tempo/10;
		}
				if(pre==n)
				{
					System.out.println(n+ " is a palindrome");
				}
				else
				{
					System.out.println(n+ " is not a palindrome");
				}
//		System.out.println("The reverse of "+n+" is "+pre);
		sc.close();
	}
}
