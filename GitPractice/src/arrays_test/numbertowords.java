package arrays_test;
import java.util.Scanner;
public class numbertowords {
	public static void main(String[] args) 
	{ 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a 3 digit number");
		int n=sc.nextInt();
        if(n<1||n>999)
        {
        	System.out.println("Invalid input,please enter 3 digit number only");
        }
        else
        {
        	int a=n%10;   //last digit
        	int ab=n/10;int b=ab%10;
        	int c=n/100;
        	
        	String aw[]= {" ","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
            String bw[]= {" ","Ten","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninty"};
            String cw="Hundred";
            
            if(n<20)
            {
            	System.out.print(aw[a]);
            }
            else if(n<100)
            {
            	
            	System.out.print(bw[b]+" "+aw[a]);
            }
            else
            {
            	System.out.print(aw[c]+" "+cw+" and "+bw[b]+" "+aw[a]);
            }
        }
        	
	}

}
