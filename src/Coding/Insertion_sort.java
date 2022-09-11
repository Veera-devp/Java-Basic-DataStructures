package Coding;
public class Insertion_sort
{
    static void insertionSort(int[] A,int N)
    {
        for(int i=1;i<N;i++)
        {
            int input=A[i];
            int j=i-1;
            while(j>=0 && A[j]>input)
            {
                A[j+1] = A[j--];
            }
            A[j+1]=input;
        }
    }
    
	public static void main(String[] args) 
	{
	    int A[]={12,35,3,24,2};
	    insertionSort(A,A.length);
	    for(int i=0;i<A.length;i++)
	        System.out.print(A[i]+" ");
	}
}
