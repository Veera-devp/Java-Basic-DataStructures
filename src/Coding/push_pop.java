package Coding;
import java.util.*;
class stackes
{
	int n;
	stackes top=null,ptr,next,pre;
	String name;
	int id;
	float salary;
	public void push()
	{
		stackes newnode=new stackes();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your name in the stack");
		newnode.name=s.next();
		System.out.println("Enter your ID");
		newnode.id=s.nextInt();
		System.out.println("Enter your salary");
		newnode.salary=s.nextFloat();
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
			System.out.println("Stack is empty");
		}
		else
		{
			pre=top;
			top=top.next;
			ptr.next=null;
			ptr=null;
		}
	}
	public void display()
	{
		int count=0;
		if(top==null)
		{
			System.out.println("Cannot Display");
		}
		else
		{
			ptr=top;
			while(ptr!=null)
			{
				count++;
				System.out.println("Details of Employee "+count+": ");
				System.out.println("Your name:"+ptr.name);
				System.out.println("Your ID:"+ptr.id);
				System.out.println("Your Salary:"+ptr.salary);
				ptr=ptr.next;
			}
		}
	}
}
public class push_pop 
{
     public static void main(String args[])
     {
    	 stackes o=new stackes();
    	 o.push();
    	 o.push();
    	 o.display();
     }
}
