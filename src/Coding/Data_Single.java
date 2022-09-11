package Coding;
import java.util.*;
class Node
{
	int n;
	Node next,ptr,start=null,pre,prev;
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
	public void insert_at_beg()
	{
		Node newnode=new Node();
		Scanner l=new Scanner(System.in);
		System.out.println("Enter insert at beginning value");
		int x=l.nextInt();
		newnode.n=x;
		newnode.next=start;
		start=newnode;
	}
	public void insert_at_end()
	{
		Node newnode=new Node();
		Scanner k=new Scanner(System.in);
		System.out.println("Enter insert at end value");
		int x=k.nextInt();
		newnode.n=x;
		ptr=start;
		while(ptr.next!=null)
		{
			ptr=ptr.next;
		}
		ptr.next=newnode;
		newnode.next=null;
	}
	public void insert_at_position()
	{
		Node newnode=new Node();
		Scanner h=new Scanner(System.in);
		System.out.println("Enter insert a value in position which you are going to insert");
		int x=h.nextInt();
		newnode.n=x;
		int count=0;
		ptr=start;
		System.out.println("Enter a position number to insert a value");
		int j=h.nextInt();
		while(count!=j) 
		{
			pre=ptr;
			ptr=ptr.next;
			count++;
		}
		pre.next=newnode;
		newnode.next=ptr;
	}
	public void delete_at_beg()
	{
		ptr=start;
		start=start.next;
		ptr.next=null;
		ptr=null;
	}
	public void delete_at_end()
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
		Scanner u=new Scanner(System.in);
		System.out.println("Enter the Given position to delete an element");
		int c=u.nextInt();
		while(count!=c)
		{
			pre=ptr;
			ptr=ptr.next;
			count++;
		}
		pre.next=ptr.next;
		ptr=null;
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
	public void search()
	{
		Node newnode=new Node();
		int g,c=0;
		Scanner q=new Scanner(System.in);
		System.out.println("Enter element to be searched");
		g=q.nextInt();
		ptr=start;
		while(ptr!=null)
		{
			if(ptr.n==g)
			{
				c++;
			}
			ptr=ptr.next;
		}
		if(c>0)
		{
			System.out.println("Element is Found");
		}
		else
		{
		   System.out.println("Element not found");	
		}
	}
}
public class Data_Single
{
    public static void main(String args[])
    {
    	Node z=new Node();
    	Scanner n=new Scanner(System.in);
    	int ch;
    	while(true)
    	{
    		System.out.println("Enter option 1 for Creating");
    		System.out.println("Enter option 2 for inserting at beginning");
    		System.out.println("Enter option 3 for Inserting at given position");
    		System.out.println("Enter option 4 for Inserting at end");
    		System.out.println("Enter option 5 for Delete at beginning");
    		System.out.println("Enter option 6 for Delete at given position");
    		System.out.println("Enter option 7 for Delete at end");
    		System.out.println("Enter option 8 for For searching your element");
    		System.out.println("Enter option 9 for Displaying");
    		System.out.println("Enter any option for exit");
    		ch=n.nextInt();
    		switch(ch)
    		{
    		case 1:z.create();
    		break;
    		case 2:z.insert_at_beg();
    		break;
    		case 3:z.insert_at_position();
    		break;
    		case 4:z.insert_at_end();
    		break;
    		case 5:z.delete_at_beg();
    		break;
    		case 6:z.delete_at_position();
    		break;
    		case 7:z.delete_at_end();
    		break;
    		case 8:z.search();
    		break;
    		case 9:z.display();
    		break;
    		default:System.exit(0);
    		}
    	}
    }
}
