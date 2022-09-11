package Coding;
import java.util.Scanner;
class data2
{
	int n;
	Node next,ptr,start=null,pre;
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
		System.out.println("Your searched element is Found");
	   }
	   else
	   {
	   System.out.println("Your searched element not found");	
	   }
}
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
}

public class Data_Search 
{
     public static void main(String args[])
     {
    	 data2 b=new data2();
    	 b.create();
    	 b.create();
    	 b.create();
    	 b.create();
    	 b.create();
    	 b.create();
    	 b.create();
    	 b.create();
    	 b.create();
    	 b.create();
    	 b.search();
    	 b.search();
     }
}
