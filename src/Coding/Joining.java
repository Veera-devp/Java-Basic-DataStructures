package Coding;
import java.util.*;
class nodeA 
{
  Scanner s=new Scanner(System.in);
  nodeA start1=null, start2=null, ptr, preptr, next;
  int data;
  public void createforlist1() 
  {
    nodeA newnode=new nodeA();
    System.out.print("Enter data: ");
    newnode.data=s.nextInt();
    if(start1==null) 
    {
      start1=newnode;
      start1.next=null;
    }
    else 
    {
      ptr=start1;
      while(ptr.next!=null) 
      {
        ptr=ptr.next;
      }
      ptr.next=newnode;
      newnode.next=null;
    }
  }
  public void createforlist2() 
  {
    nodeA newnode=new nodeA();
    System.out.print("Enter data: ");
    newnode.data=s.nextInt();
    if(start2==null) 
    {
      start2=newnode;
      start2.next=null;
    }
    else 
    {
      ptr=start2;
      while(ptr.next!=null) 
      {
        ptr=ptr.next;
      }
      ptr.next=newnode;
      newnode.next=null;
    }
  }
  public void displayList1() 
  {
    ptr=start1;
    System.out.print("List 1: ");
    while(ptr!=null) 
    {
      System.out.print(ptr.data+" ");
      ptr=ptr.next;
    }
    System.out.println();
  }
  public void displayList2() 
  {
    ptr=start2;
    System.out.print("List 2: ");
    while(ptr!=null) 
    {
      System.out.print(ptr.data+" ");
      ptr=ptr.next;
    }
    System.out.println();
  }
  public void join2ndlistto1st() 
  {
    ptr=start1;
    while(ptr.next!=null) 
    {
      ptr=ptr.next;
    }
    ptr.next=start2;
  }
}
public class Joining 
{
  public static void main(String[] args) 
  {
    Scanner s=new Scanner(System.in);
    nodeA obj=new nodeA();
    while(true) 
    {
      System.out.println("1. Create newnode in List 1");
      System.out.println("2. Create newnode in List 2");
      System.out.println("3. Display List 1");
      System.out.println("4. Display List 2");
      System.out.println("5. Join 2nd List to 1st List");
      System.out.print("Enter your choice: ");
      int ch=s.nextInt();
      switch(ch) 
      {
      case 1: obj.createforlist1();
          obj.displayList1();
          break;
      case 2: obj.createforlist2();
          obj.displayList2();
          break;
      case 3: obj.displayList1();
          break;
      case 4: obj.displayList2();
          System.out.println("Lists Joined");
          break;
      case 5: obj.join2ndlistto1st();
          obj.displayList1();
          break;
      }
      System.out.println();
    }
  }
}