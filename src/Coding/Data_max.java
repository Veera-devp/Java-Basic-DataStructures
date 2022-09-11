package Coding;
import java.util.*;
class maximum
{
	int n;
	maximum next,ptr,start=null,pre;
	public void find()
	{
	int key,max;
	ptr=start;
	max=ptr.n;
	{
		while(ptr!=null)
		{
		if(ptr.n>max)
		{
			max=ptr.n;
		}
		ptr=ptr.next;
		}
	}
	System.out.println("The maximum number in the following node is:"+max);
  }
	public void create()
	{
		maximum newnode=new maximum();
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
public class Data_max 
{
     public static void main(String args[])
     {
    	 maximum o=new maximum();
    	 o.create();
    	 o.create();
    	 o.create();
    	 o.create();
    	 o.create();
    	 o.create();
    	 o.find();
     }
}
