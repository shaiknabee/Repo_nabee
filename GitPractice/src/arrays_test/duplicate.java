package arrays_test;
import java.util.Scanner;
public class duplicate 
{
	
		public static void main(String[]args)
		{


			Scanner sc=new Scanner(System.in);
			System.out.println("Enter size of array");
			int size=sc.nextInt();
			int arr[]=new int[size];

			System.out.print("Enter elements of array");

			for(int i=0;i<arr.length;i++)
			{
				arr[i]=sc.nextInt();
			}


			for(int i=0;i<arr.length;i++)
			{
				int count=0;
				for(int j=i+1;j<arr.length;j++)
				{
					if(arr[i]==arr[j])
					{
						count++;
						arr[j]=' ';
					}

				}
				if(count>0&&arr[i]!=' ')
				{
					System.out.print(arr[i]+" ");
				}


			}

			sc.close();
		}
	
}
