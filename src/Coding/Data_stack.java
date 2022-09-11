package Coding;
import java.util.*;
class stack
{
	int n;
	stack next,top=null,ptr;
	public void push()
	{
	  stack newnode=new stack();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number to push in stack");
		newnode.n=s.nextInt();
		if(top==null)
		{
			top=newnode;
			newnode.next=null;
		}
		else
		{
			newnode.next=top;
			top=newnode;
		}
	}
	public void pop()
	{
		if(top==null)
		{
			System.out.println("Your stack is empty");
		}
		else
		{
			ptr=top;
			top=top.next;
			ptr=null;
		}
	}
	public void peek()
	{
		System.out.println(top.n);
	}
	public void display()
	{
		ptr=top;
		while(ptr!=null)
		{
			System.out.println(ptr.n);
			ptr=ptr.next;
		}
	}
}
public class Data_stack 
{
     public static void main(String args[])
     {
    	 stack o=new stack();
    	 o.push();
    	 o.push();
    	 o.push();
    	 o.push();
    	 o.push();
    	 o.peek();
    	 o.pop();
    	 o.display();
     }
}
