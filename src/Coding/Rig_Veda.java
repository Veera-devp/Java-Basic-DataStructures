package Coding;
import java.util.*;
public class Rig_Veda
{
	static char a[]=new char[100];
	static int top=-1;
	public static void push(char c)
	{
		top++;
		a[top]=c;
	}
	public static char pop()
	{
		return a[top--];
	}
	public static int priority(char c)
	{
		if(c=='^')
		{
			return 3;
		}
		else if(c=='*'||c=='/'||c=='%')
		{
			return 2;
		}
		else if(c=='+'||c=='-')
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter infix Expression");
		String infix=s.next();
		String postfix=new String();
		for(int i=0;i<infix.length();i++)
		{
			char c=infix.charAt(i);
			if((c>='A' && c<='Z')||(c>='a' && c<='z'))
			{
				postfix=postfix+c;
			}
			else if(c=='(')
			{
				push(c);
			}
			else if(c=='*'||c=='%'||c=='+'||c=='^'||c=='-'||c=='/')
			{
				while(top!=-1 && priority(a[top])>=priority(c))
				{
					postfix=postfix+pop();
				}
				push(c);
			}
			else if(c==')')
			{
				char ch;
				while((ch=pop())!='(')
				{
					postfix=postfix+ch;
				}
			}
			}
				while(top!=-1)
				{
					postfix=postfix+pop();
				}
				System.out.println("Postfix= " +postfix);
		}
}
