package arrays_test;
import java.util.Scanner;
public class addmiddle {
	public static void main(String[]args)
	{
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter size of array");
	    int size=sc.nextInt();
	    int arr[]=new int[size];
	    System.out.println("Enter array elements");
	    for(int i=0;i<arr.length;i++)
	    {
	    	arr[i]=sc.nextInt();
	    }
	    System.out.println("Enter new elemnt");
	    int ins=sc.nextInt();
	    System.out.println("Enter the position you want to insert");
	    int pos=sc.nextInt();
	    for(int i=0;i<arr.length;i++)
	    {
	    	if(arr[i]==pos)
	    	{
	    		for(int j=arr.length-1;j>i;j--)
	    		{
	    			arr[j]=arr[j-1];
	    		}
	    		arr[i+1]=ins;
	    	}
	    	
	    }
	    
	    for(int i=0;i<arr.length;i++)
	    {
	    	System.out.print(arr[i]+" ");
	    }
	  
	}

}
