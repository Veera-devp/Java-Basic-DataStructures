package Coding;
import java.util.*;
public class Picking_Number 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter how many elements you want");
        int n=s.nextInt();
        System.out.println("Enter the elements");
        int[] a=new int[100];
        for(int i=0; i < n; i++)
        {
            a[s.nextInt()]++;
        }
        int m=0;
        for (int i = 0;i < 99;i++) 
        {
            m=Math.max(m, a[i]+a[i+1]);
        }
        System.out.println("There are "+m+" common numbers in the given list");
    }
}