package Git_test;
import java.util.Scanner;
public class notes {
	public static void main(String[]args)
	{
		int t1=2000,t2=500,t3=200,t4=100,t5=50,t6=20,t7=10;
		int n1,n2,n3,n4,n5,n6,n7,b1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter amount");
		int amt=sc.nextInt();
		if(amt>10)
		{
			n1=amt/t1;
			b1=n1*t1;
			System.out.println("2000 Notes: "+t1+"*"+n1+"="+b1 );
			
			n2=amt/t2;
			b1=n2*t2;
			System.out.println("500 Notes : "+t2+"*"+n2+"="+b1 );
			
			n3=amt/t3;
			b1=n3*t3;
			System.out.println("200 Notes : "+t3+"*"+n3+"="+b1 );
			
			n4=amt/t4;
			b1=n4*t4;
			System.out.println("100 Notes : "+t4+"*"+n4+"="+b1 );
			
			n5=amt/t5;
			b1=n5*t5;
			System.out.println("50 Notes  : "+t5+"*"+n5+"="+b1 );
			
			n6=amt/t6;
			b1=n6*t6;
			System.out.println("20 Notes  : "+t6+"*"+n6+"="+b1 );
			
			n7=amt/t7;
			b1=n7*t7;
            System.out.println("10 Notes  : "+t7+"*"+n7+"="+b1 );
		}

		else {
			System.out.println("Enter a valid amount");
		}
		sc.close();
	}

}
