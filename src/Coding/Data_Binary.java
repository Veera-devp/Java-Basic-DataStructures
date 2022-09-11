package Coding;
import java.util.Scanner;
class binary
{
	int n,mid,low,high,key,count=0,i;
	public void searching()
	{
		Scanner z=new Scanner(System.in);
	    System.out.println("Enter number of elements in an array");
	    n=z.nextInt();
	    int[] k=new int[n];  
	    System.out.println("Enter ur own elements into array");
	    for(int i=0;i<n;i++)
	      {
	         k[i]=z.nextInt();
	      }
	      System.out.println("Enter elements to be searched");
	      key=z.nextInt();
	      low=0;
	      high=(n-1);
	      while(low<=high)
	      {
	        mid=(low+high)/2;
	        if(k[mid]>key)
	      {
	          high=mid-1;  
	      }
	      else if(k[mid]<key)
	      {
	         low=mid+1;
	      }
	      else
	      {
	         count++;
	         break;
	      }
	   }
	   if(count==1)
	   {
	      System.out.println("Element found in the array");
	   }
	   else
	   {
	     System.out.println("Element not found in the arrays which you have given");
	   }
	}
}
public class Data_Binary
{
    public static void main(String[] args)
    {
       binary o=new binary();
       o.searching();
    }
}