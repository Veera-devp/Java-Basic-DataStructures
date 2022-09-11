package Coding;
import java.util.*;
class Structure
{
	int n;
	Node start=null,ptr,pre,next,prev,ptr1;
	public void create()
	{
		Node newnode=new Node();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter creating a node value");
		int x=s.nextInt();
		newnode.n=x;
		if(start==null)
		{
			start=newnode;
			newnode.next=null;
			newnode.prev=null;
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
			newnode.prev=ptr;
		}
	}
	public void insert_beg() 
	{
	    Node newnode=new Node();
	    int x;
	    Scanner d=new Scanner(System.in);
	    System.out.println("Enter a number to insert at beginning");
	    x=d.nextInt();
	    newnode.n=x;
	    newnode.next=start;
	    start.prev=newnode;
	    newnode.prev=null;
	    start=newnode;
	}
	public void insert_at_position()
	{
		Node newnode=new Node();
		int x,count=0;
		Scanner f=new Scanner(System.in);
		System.out.println("Enter the value for inserting at the given position");
		x=f.nextInt();
		newnode.n=x;
		Scanner g=new Scanner(System.in);
		System.out.println("Enter a position for inserting a number");
		n=g.nextInt();
		ptr=start;
		while(count!=n)
		{
			pre=ptr;
			ptr=ptr.next;
			count=count+1;
		}
		pre.next=newnode;
		newnode.next=ptr;
		ptr.prev=newnode;
		newnode.prev=pre;
	}
	public void insert_end()
	{
		Node newnode=new Node();
		int x;
		Scanner h=new Scanner(System.in);
		System.out.println("Enter a number to insert at end");
		x=h.nextInt();
		newnode.n=x;
		ptr=start;
		while(ptr.next!=null)
		{
			ptr=ptr.next;
		}
		ptr.next=newnode;
		newnode.next=null;
		newnode.prev=ptr;
	}
	public void display()
	{
		ptr=start;
		while(ptr!=null)
		{
			System.out.println(ptr.n);
			ptr=ptr.next;
		}
	}
	public void delete_beg()
	{
		ptr=start;
		start=start.next;
		start.prev=null;
		ptr.next=null;
		ptr=null;
	}
	public void delete_end()
	{
		ptr=start;
		while(ptr.next!=null)
		{
			pre=ptr;
			ptr=ptr.next;
		}
		pre.next=null;
		ptr=null;
	}
	public void delete_at_position()
	{
		int count=0;
		ptr=start;
		Scanner c=new Scanner(System.in);
		System.out.println("Enter the position to delete");
		n=c.nextInt();
		while(count!=n)
		{
			pre=ptr;
			ptr=ptr.next;
			count++;
		}
		ptr1=ptr.next;
		pre.next=ptr1;
		ptr1.prev=pre;
		ptr.next=null;
		ptr.prev=null;
		ptr=null;
	}
}
public class Data_Double 
{
     public static void main(String args[])
     {
    	 Structure z=new Structure();
    	 z.create();
    	 z.create();
    	 z.insert_beg();
    	 z.insert_beg();
    	 z.insert_end();
    	 z.insert_end();
    	 z.insert_at_position();
    	 z.insert_at_position();
    	 z.delete_at_position();
    	 z.delete_beg();
    	 z.delete_end();
    	 z.display();
     }
}
