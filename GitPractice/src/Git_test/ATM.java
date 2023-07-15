package Git_test;
import java.util.Scanner;
public class ATM {
	public static void main(String[] args) 
	{
        int balance=25000,menu=1;
        Scanner sc=new Scanner(System.in);
        while(menu==1)
        {
        	System.out.println("Welcome to SBI ATM");
        	System.out.println("Enter 1 for Balance Enquiry");
        	System.out.println("Enter 2 for Statement");
        	System.out.println("Enter 3 for Withdrawl");
        	System.out.println("Enter 4 for deposit");
        	
        	int option=sc.nextInt();
        	switch(option)
        	{
        	case 1: 
        		System.out.println("Your current balance is "+balance);
        		break;
        	case 2:
        		System.out.println("Please receive your Statement");
        		break;
        	case 3:
        		System.out.println("Enter the amount to withdraw");
        		int withdraw=sc.nextInt();
        		if(withdraw<=balance)
        		{
        			balance=balance-withdraw;
        			System.out.println("Your remianing Balance is: Rs."+balance+" ,Please collect your card");
        		}
        		else
        		{
        			System.out.println("Insufficient balance");
        		}
        		break;
        	case 4:
        		System.out.println("Enter the amount to deposit");
        		int deposit=sc.nextInt();
        		balance=balance+deposit;
        		System.out.println("Your current balance is: Rs."+balance);
        		break;
        	
        	}
        	System.out.println("Enter 1 to continue and 0 for exit");
        	menu=sc.nextInt();
        }
	}

}
