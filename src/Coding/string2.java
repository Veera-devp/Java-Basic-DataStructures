package Coding;
import java.util.Scanner;
class nodeZ 
{
  nodeZ ptr, preptr, start=null, next;
  String name;
  int marks;
  long id;
  public void createnewnode() 
  {
    nodeZ newnode=new nodeZ();
    Scanner s=new Scanner(System.in);
    System.out.print("Enter Employee Name: ");
    newnode.name=s.next();
    System.out.print("Enter Employee salary: ");
    newnode.marks=s.nextInt();
    System.out.print("Enter Employee id: ");
    newnode.id=s.nextLong();
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
  public void display() 
  {
    int count=0;
    ptr=start;
    while(ptr!=null) 
    {
      count++;
      System.out.println();
      System.out.println("Details of Employee "+count+": ");
      System.out.println("Name: "+ptr.name);
      System.out.println("Salary: "+ptr.marks);
      System.out.println("ID: "+ptr.id);
      ptr=ptr.next;
    }
  }
}
public class string2 
{
  public static void main(String[] args) 
  {
         nodeZ obj=new nodeZ();
         obj.createnewnode();
         obj.createnewnode();
         obj.createnewnode();
         obj.display();
    }
 }