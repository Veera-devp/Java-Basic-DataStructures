package Coding;
import java.util.*;
class nodeB 
{
  Scanner s=new Scanner(System.in);
  nodeB left, right, ptr, pre, root=null;
  int data;
  public void create() 
  {
    nodeB newnode=new nodeB();
    System.out.print("Enter data: ");
    newnode.data=s.nextInt();
    newnode.left=null;
    newnode.right=null;
    if(root==null) 
    {
      root=newnode;
    }
    else 
    {
      ptr=root;
      while(ptr!=null) 
      {
        pre=ptr;
        if(newnode.data<ptr.data) 
        {
          ptr=ptr.left;
        }
        else if(newnode.data>=ptr.data) 
        {
          ptr=ptr.right;
        }
      }
      if(newnode.data<pre.data) 
      {
        pre.left=newnode;
      }
      else if(newnode.data>=pre.data) 
      {
        pre.right=newnode;
      }
    }
  }
  public void displayinorder(nodeB root) 
  { 
    if(root!=null) 
    {
      System.out.print(root.data+" ");
      displayinorder(root.left);
      displayinorder(root.right);
    }
   }
  public void search() 
  {
    boolean check=false;
    System.out.print("Enter data to search: "); 
    int key=s.nextInt();
    ptr=root;
    while(ptr!=null) 
    {
      if(ptr.data==key) 
      {
        check=true;
        break;
      }
      else if(key<ptr.data) 
      {										
        ptr=ptr.left;
      }
      else if(key>=ptr.data) 
      {
        ptr=ptr.right;
      }
    }
    if(check==false) 
    {
      System.out.print("Data not Found");
    }
    else if(check==true) 
    {
      System.out.print("Data Found");
    }
  }
}
public class Binary_Tree_Search 
{
  static Scanner s=new Scanner(System.in);
  public static void main(String[] args) 
  {
    nodeB o=new nodeB();
    while(true) 
    {
      System.out.println("1. Create newnode");
      System.out.println("2. Display in Root, Left, Right order");
      System.out.println("3. Search a value");
      System.out.print("Enter your option: ");
      int ch=s.nextInt();
      switch(ch) 
      {
      case 1: o.create();
              o.displayinorder(o.root);
              break;
      case 2: System.out.print("RootLeftRight Order: ");
              o.displayinorder(o.root);
              break;
      case 3: o.search();
              break;
      default:System.out.println("Invalid option");
      }
    }
  }
}