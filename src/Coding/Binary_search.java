package Coding;
import java.util.Scanner;
class searching
{
		int[] a=new int[5];
		int end,front,mid,i,key,count=0,size=5;
		public void search()
		{
			Scanner k=new Scanner(System.in);
			System.out.println("Enter any 5 number into array");
			for(i=0;i<5;i++)
			{
				a[i]=k.nextInt();
			}
			System.out.println("Enter number to be searched");
			key=k.nextInt();
			front=0;
			end=size-1;
			while(front<=end)
			{
				mid=(front+end)/2;
				if(a[mid]==key)
				{
					count++;
					break;
				}
				else if(a[mid]>key)
				{
					end=mid-1;
				}
				else
				{
					front=mid+1;
				}
			}
			if(count==0)
			{
				System.out.println("Element is not found");
			}
			else
			{
				System.out.println("Element is found");
			}
		}
		
}
public class Binary_search 
{
      public static void main(String args[])
      {
    	  searching o=new searching();
    	  o.search();
      }
}
