package Git_test;
import java.util.Scanner;
import java.util.*;
public class frequency_maps {
	public static void main(String[] args) 
	{
     Map <String,Integer>map=new HashMap<>();
     int m=1;
     while(m==1)
     {
    	 System.out.println("Enter a value");
    	 Scanner sc=new Scanner(System.in);
    	 String x=sc.nextLine(); 
    	 if(map.keySet().contains(x))
    	 {
    		 int temp=map.get(x);
    		 temp=temp+1;
    		 map.put(x, temp);
    	 }
    	 else
    	 {
    		 map.put(x, 1);
    	 }
    	 System.out.println("Enter 1 to continue");
    	 m=sc.nextInt();
     }
     for(String number:map.keySet())
     {
    	 System.out.println(number+" came for "+map.get(number)+" times");
     }
	}
}
