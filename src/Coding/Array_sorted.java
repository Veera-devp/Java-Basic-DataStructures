package Coding;
import java.util.*;

public class Array_sorted 
{

    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter How many number of array elements to sort");
        int n = s.nextInt();
        System.out.println("Enter the elements");
        int a[] = new int[n];
        for(int i=0;i< n;i++)
        {
            a[i] = s.nextInt();
        }
        int xyz=0;
        for (int i = 0; i < n; i++) 
        {

            for (int j = 0; j < n - 1; j++) 
            {
                 if (a[j] > a[j + 1]) 
                 {
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    xyz++;
                }
            }
            if (xyz == 0) 
            {
                break;
            }
        }

        System.out.println("Array is sorted in "+xyz+" swaps.");
        System.out.println("First Element: "+a[0]);
        System.out.println("Last Element: "+a[a.length-1]);
    }


}