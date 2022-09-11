package Coding;
import java.util.Scanner;

class St {
  St next, top=null, ptr, preptr;
  String name;
  String gender;
  long phone;
  public void create() {
    Scanner s=new Scanner(System.in);
    St newnode=new St();
    System.out.print("Enter Name: ");
    newnode.name=s.next();
    System.out.print("Enter Gender(M or F): ");
    newnode.gender=s.next();
    System.out.print("Enter Phone number: ");
    newnode.phone=s.nextLong();
    if(top==null) {
      top=newnode;
      newnode.next=null;
    }
    else {
      newnode.next=top;
      top=newnode;
    }
  }
  public void display() 
  {
    ptr=top;
    while(ptr!=null) 
    {
      if(ptr.gender.charAt(0)=='F') 
      {
        System.out.print(ptr.name+": ");
        System.out.println(ptr.phone+" ");
      }
      ptr=ptr.next;
    }
    System.out.println();
  }
}
public class string3 
{

  public static void main(String[] args) 
  {
    St obj=new St();
    Scanner s=new Scanner(System.in);
    while(true) {
      System.out.println("1. Create newnode");
      System.out.println("2. Display List");
      System.out.print("Enter your choice: ");
      int ch=s.nextInt();
      switch(ch) {
      case 1: obj.create();
          obj.display();
          break;
      case 2: obj.display();
          break;
      }
      System.out.println();
  }

}}