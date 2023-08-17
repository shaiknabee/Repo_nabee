package arrays_test;

import java.util.Scanner;

public class maxoccurance 
{
	public static void main(String[] args)
	{
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter size of array");
      int size=sc.nextInt();
      int arr[]=new int [size];
      int count=0;
      int maxcount=0;
      System.out.println("Enter elements of array");
      for(int i=0;i<arr.length;i++)
      {
    	  arr[i]=sc.nextInt();
      }
      for(int i=0;i<arr.length;i++)
      {
    	  count=0;
    	  for(int j=i;j<arr.length;j++)
    	  {
    		  if(arr[i]==arr[j])
    		  {
    			  count++;
     			 
    		  }
    		
    	  }
    	

      }
      System.out.println(count);
      
	}
}
