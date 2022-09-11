package Coding;
import java.util.Scanner;
class NodeQ 
{
  int size=10, data;
  NodeQ start[]=new NodeQ[size];  
  NodeQ ptr, preptr, next, prev;
  public void insert() 
  {
    NodeQ newnode=new NodeQ();
    Scanner s=new Scanner(System.in);
    System.out.println("Enter value: ");
    newnode.data=s.nextInt();
    int index=(newnode.data)%size;
    if(start[index]==null) 
    {
      start[index]=newnode;
      newnode.next=null;
    }
    else 
    {
      ptr=start[index];
      while(ptr.next!=null ) 
      {
        ptr=ptr.next;
      }
      ptr.next=newnode;
      newnode.next=null;
    }
  }
  public void delete() 
  {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter key to delete: ");
    int value=s.nextInt();
    int index=value%size;
    if(start[index].data==value) 
    {
      start[index]=start[index].next;
    }
    else 
    {
      ptr=start[index];
      while(ptr.next!=null) 
      {
        prev=ptr;
        ptr=ptr.next;
        if(ptr.data==value) 
        {
          prev.next=ptr.next;
          break;
        }
      }
    }
  }
  public void search() 
  {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter key to search: ");
    int value=s.nextInt();
    int index=value%size;
    boolean check=false;
    ptr=start[index];
    while(ptr!=null) 
    {
      if(ptr.data==value) 
      {
    	  check=true;
      }
      ptr=ptr.next;
    }
  }
  public void display() 
  {
    for(int i=0; i<size; i++) 
    {
      ptr=start[i];
      System.out.print("\nList "+(i)+": ");
      while(ptr!=null) {
        System.out.print(ptr.data+" ");
        ptr=ptr.next;
      }
    }
  }
}
public class sep_chaining 
{
  public static void main(String[] args) 
  {
    Scanner s=new Scanner(System.in);
    NodeQ obj=new NodeQ();
    while(true) 
    {
      System.out.println("1. Create newnode");
      System.out.println("2. Delete a value");
      System.out.println("3. Display List");
      System.out.print("Enter your choice: ");
      int ch=s.nextInt();
      switch(ch) 
      {
      case 1: obj.insert();
          obj.display();
          break;
      case 2: obj.delete();
          obj.display();
          break;
      case 3: obj.display();
          break;
      default:System.out.println("Invalid option");
      }
    }
  }
}
