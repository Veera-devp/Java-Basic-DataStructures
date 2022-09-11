package Coding;
import java.util.*;
public class Ramayan
{
	static int a[]=new int[100];
	static int top=-1;
	public static void push(int c)
	{
		top++;
		a[top]=c;
	}
	public static int pop()
	{
		return a[top--];
	}
    public static void main(String args[])
    {
	     Scanner k=new Scanner(System.in);
	     System.out.println("enter postfix expression");
	     String postfix=k.next();
	     for(int i=0;i<postfix.length();i++)
	     {
		       char c=postfix.charAt(i);
		       if((c>=65 &&c<=122)||(c>='a'&&c<='z'))
		       {
			       System.out.println("Enter "+c+" value");
			       int z=k.nextInt();
			       push(z);
		       }
		       else if(c=='+'||c=='-'||c=='*'||c=='/'||c=='%'||c=='^')
		       {
			        int m=pop();
     		        int n=pop();
			        switch(c)
			        {
			            case '+': push(n+m);
			            break;
			            case '-':push(n-m);
			            break;
			            case '*':push(n*m);
			            break;
			            case '/':push(n/m);
			            break;
			            case '%':push(n%m);
			            break;
			            default:System.out.println("invalid expression");
			        }
		       }
	      }
	      System.out.println("value ="+pop());
    }
}