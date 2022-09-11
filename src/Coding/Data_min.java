package Coding;
import java.util.*;
class minimum
{
	int n;
	minimum next,ptr,start=null,pre;
	public void find()
	{
	int key,min;
	ptr=start;
	min=ptr.n;
	{
		while(ptr!=null)
		{
		if(ptr.n<min)
		{
			min=ptr.n;
		}
		ptr=ptr.next;
		}
	}
	System.out.println("The minimum number in the following node is:"+min);
  }
	public void create()
	{
	    minimum newnode=new minimum();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter creating a node value");
		int x=s.nextInt();
		newnode.n=x;
		if(start==null)
		{
			start=newnode;
			newnode.next=null;
		}
		else
		{
			ptr=start;
			while(ptr.next!=null)
			{
				ptr=ptr.next;
			}
			ptr.next=newnode;
			newnode.next=null;
		}
	}
}
public class Data_min 
{
     public static void main(String args[])
     {
    	 minimum o=new minimum();
    	 o.create();
    	 o.create();
    	 o.create();
    	 o.create();
    	 o.create();
    	 o.create();
    	 o.find();
     }
}
