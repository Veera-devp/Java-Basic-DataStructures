package Coding;
import java.util.*;
public class maha 
{
   static char a[]=new char[100];
   static int top=-1;
   public static void push(char c)
   {
	   top++;
	   a[top]=c;
   }
   public static void main(String args[])
   {
	   Scanner s=new Scanner(System.in);
	   System.out.println("Enter an Expression which includes brackets");
	   String exp=s.next();
	   int count=0;
	   for(int i=0;i<exp.length();i++)
	   {
		   char c=exp.charAt(i);
		   if(c=='+'||c=='*'||c=='/'||c=='%'||c=='^'||c>=65 && c<=90|| c>=97 && c<=122)
		   continue;
		   else if(c=='('||c=='{'||c=='[')
		   {
			   push(c);
		   }
		   else if((c==')' && a[top]=='(')||(c=='}' && a[top]=='{')||(c==']' && a[top]=='['))
		   {
			   top--;
		   }
		   else
		   {
			   count++;
			   break;
		   }
	   }
	   if(count==0 && top==-1)
	   {
		   System.out.println("Valid Expression");
	   }
	   else
	   {
		   System.out.println("Invalid Expression");
	   }
   }
}
