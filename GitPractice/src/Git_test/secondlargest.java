package Git_test;

import java.util.Arrays;


public class secondlargest{
public static void main(String[] args) {
	
  int arr[]= {9,2,1,60,60,9,47,1,47};
  int large=0,seclarge=0;
  
  for(int i=0;i<arr.length;i++)
  {
	  if(arr[i]>large)
	  {
		  seclarge=large;
		  large=arr[i];
	  }
	  else if(arr[i]>seclarge)
	  {
		  seclarge=arr[i];
	  }
  }
  System.out.println(seclarge);
	    
}
}
