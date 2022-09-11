package Coding;
import java.util.*;
class nodeia
{
  int sal;
  String name;
  nodeia start=null,ptr,next;
  public void create()
  {
    Scanner s=new Scanner(System.in);
    nodeia newnode=new nodeia();
    newnode.sal=s.nextInt();
    newnode.name=s.next();
    if (start==null)
    {
      start=newnode;
      newnode.next=null;
    }
    else
    {
      ptr=start;
      while (ptr.next!=null)
      {
        ptr=ptr.next;
      }
      ptr.next=newnode;
      newnode.next=null;
    }
  }
  public void display()
  {
    ptr=start;
    while (ptr!=null)
    {
      System.out.print(ptr.name+" ");
      System.out.println(ptr.sal);
      ptr=ptr.next;
    }
  }
}
public class string 
{

  public static void main(String[] args) 
  {
          nodeia k=new nodeia();
          k.create();
          k.create();
          k.display();
  }

}