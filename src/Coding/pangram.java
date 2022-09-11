package Coding;
import java.io.*;
import java.util.*;
class Design
{
    public void program()
    {
    	Scanner s = new Scanner(System.in);
        int n=26;
		int[] Letter = new int[n];
        String upper = s.nextLine();
        String lower = upper.toLowerCase();
        for(char character:lower.toCharArray())
        {
            if(character!= ' ')
            {
                Letter[character-'a']++;
            }
        }
        int c=0;
        for(int j =0;j<26;j++)
        {
            if(Letter[j] >0)
            {
                c++;
            }
        }
        if(c==n)
        {
            System.out.print("pangram");
        }
        else
        {
            System.out.print("not pangram");
        }
    }
}
public class pangram 
{
    public static void main(String[] args) 
    {
       Design object=new Design();
        object.program();
    }
}