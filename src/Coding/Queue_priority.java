package Coding;
import java.util.*;
class Queue
{
	int n,ptre;
	Queue start=null,ptr,next;
	public void enqueue()
	{
		int x,pr;
		Queue newnode=new Queue();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the values in queue");
		x=s.nextInt();
		pr=s.nextInt();
		newnode.n=x;
		newnode.ptre=pr;
		if(start==null)
		{
			start=newnode;
			newnode.next=null;
		}
		else if(newnode.ptre<start.ptre)
		{
			newnode.next=start;
			start=newnode;
		}
		else
		{
			ptr=start;
			while(ptr.next!=null && ptr.next.ptre<newnode.ptre)
			{
				ptr=ptr.next;
			}
			newnode.next=ptr.next;
			ptr.next=newnode;
		}
	}
	public void dispaly()
	{
		ptr=start;
		while(ptr.next!=null)
		{
			ptr=ptr.next;
			System.out.println(ptr.n);
		}
	}
}
public class Queue_priority 
{
    public static void main(String args[])
    {
    	Queue o=new Queue();
    	o.enqueue();
    	o.enqueue();
    	o.enqueue();
    	o.dispaly();
    }
}
