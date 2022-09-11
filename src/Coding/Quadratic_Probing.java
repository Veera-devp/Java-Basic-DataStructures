package Coding;
import java.util.*;
class Quadraticprobing
{
	int a[]=new int[20];
	int m=10;
	int key,x,i,count=0;
	public void insert()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the key that you want to insert");
		key=s.nextInt();
		x=key%m;
		if(a[x]==0)
		{
			a[x]=key;
		}
		else
		{
			for(i=1;i<a.length;i++)
			{
				x=(key+i*i)%m;
				if(a[m]!=0)
				{
					continue;
				}
				else
				{
					a[x]=key;
					break;
				}
			}
		}
	}
	public void deletion()
	{
		Scanner t=new Scanner(System.in);
		System.out.println("Enter key element for Deletion");
		key=t.nextInt();
		x=key%m;
		if(a[x]==key)
		{
			a[x]=0;
		}
		else
		{
			for(i=1;i<a.length;i++)
			{
				x=(key+i*i)%m;
				if(a[x]!=key)
				{
					continue;
				}
				else
				{
					a[x]=0;
					break;
				}
			}
		}
	}
	public void searching()
	{
		Scanner r=new Scanner(System.in);
		System.out.println("Enter the element to be searched");
		key=r.nextInt();
		x=key%m;
		if(a[x]==key)
		{
			count++;
		}
		else
		{
			for(i=1;i<a.length;i++)
			{
				x=(key+i*i)%m;
				if(a[x]!=key)
				{
					continue;
				}
				else
				{
					count++;
					break;
				}
			}
		}
			if(count==0)
			{
				System.out.println("Entered Element is not found");
			}
			else
			{
				System.out.println("Entered Element is found");
			}
		
	}
	public void display()
	{
		for(i=0;i<a.length;i++)
		{
			if(a[i]!=0)
			{
				System.out.println(a[i]);
			}
		}
	}
}
public class Quadratic_Probing 
{
     public static void main(String args[])
     {
    	 Quadraticprobing o=new Quadraticprobing();
    	 Scanner n=new Scanner(System.in);
    	 int ch;
     	while(true)
     	{
     		System.out.println("Option 1: For inserting");
     		System.out.println("Option 2: For Searching");
     		System.out.println("Option 3: For Deleting");
     		System.out.println("Option 4: For display");
     		System.out.println("Option 5: To exit");
     		ch=n.nextInt();
     		switch(ch)
     		{
     		case 1:o.insert();
     		break;
     		case 2:o.searching();
     		break;
     		case 3:o.deletion();
     		break;
     		case 4:o.display();
     		break;
     		default:System.exit(0);
     		}
     	}
     }
}
