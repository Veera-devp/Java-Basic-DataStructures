package Coding;
import java.util.*;
class nodeC 
{
  nodeC ptr, left, right, root=null, pre, ptr2, pre2;
  int data;
  Scanner s=new Scanner(System.in);
  public void create() 
  {
    nodeC newnode=new nodeC();
    newnode.left=null;
    newnode.right=null;
    System.out.print("Enter data: ");
    newnode.data=s.nextInt();
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
  public void displayinorder(nodeC root) 
  {  
    if(root!=null) 
    {
      System.out.print(root.data+" ");
      displayinorder(root.left);
      displayinorder(root.right);
    }
   }
  public void delete() 
  {
    System.out.print("Enter value that needs to be deleted: ");
    int key=s.nextInt();
    ptr=root;
    while(ptr.data!=key) 
    {
      pre=ptr;
      if(key<ptr.data) 
      {
        ptr=ptr.left;
      }
      else if(key>ptr.data) 
      {
        ptr=ptr.right;
      }
    }
    if(ptr.left==null && ptr.right==null) 
    { 
      if(ptr==pre.left) 
      {
        pre.left=null;
      }
      else if(ptr==pre.right) 
      {
        pre.right=null;
      }
    }
    else if(ptr.left==null && ptr.right!=null) 
    { 
      if(ptr==pre.left) 
      {
        pre.left=ptr.right;
      }
      else if(ptr==pre.right) 
      {
        pre.right=ptr.right;
      }
    }
    else if(ptr.left!=null && ptr.right==null) 
    { 
      if(ptr==pre.left) 
      {
        pre.left=ptr.left;
      }
      else if(ptr==pre.right) 
      {
        pre.right=ptr.left;
      }
    }
    else if(ptr.left!=null && ptr.right!=null) 
    { 
      ptr2=ptr.left;
      while(ptr2.right!=null) 
      {
        pre2=ptr2;
        ptr2=ptr2.right;
      }
      ptr.data=ptr2.data;
      if(ptr.left.right==null) 
      { 
    	  ptr.left=null; 
      }
      else 
      { 
    	  pre2.right=ptr2.left; 
      }
    }
  }
}
public class Binary_tree 
{
  public static void main(String[] args) 
  {
	  Scanner s=new Scanner(System.in);
    nodeC o=new nodeC();
    while(true) 
    {
      System.out.println("Option 1. Create newnode");
      System.out.println("Option 2. Display in Root, Left, Right order");
      System.out.println("option 3. Delete a value");
      System.out.print("Enter your option: ");
      int ch=s.nextInt();
      switch(ch) 
      {
      case 1: o.create();
              break;
      case 2: System.out.print("RootLeftRight Order: ");
              o.displayinorder(o.root);
              break;
      case 3: o.delete();
              System.out.print("RootLeftRight Order(After Deletion):");
              o.displayinorder(o.root);
              break;
      default:System.out.println("Invalid option");
      }
      System.out.println("\n");
    }
  }
}