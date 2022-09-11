package Coding;
public class Heap_sort
{
    static void heap(int A[],int root,int last)
    {
        int largest=root;
        int L=2*root+1;
        int R=2*root+2;
        if(L<last && A[L]>A[largest])
            largest=L;
        if(R<last && A[R]>A[largest])
            largest=R;
     
        if(largest!=root)
        {
            int tmp=A[largest];
            A[largest]=A[root];
            A[root]=tmp;
            
            heap(A,largest,last);
        }
    }
    static void heapSort(int A[],int N)
    {
        for(int P=N/2-1;P>=0;P--)
            heap(A,P,N);
        for(int last=N-1;last>0;last--)
        {
            int tmp=A[last];
            A[last]=A[0];
            A[0]=tmp;
            
            heap(A,0,last);
        }
    }
	public static void main(String[] args) 
	{
	    int[] A={12,35,4,24,2};
	    heapSort(A, A.length);
	    for(int i:A)
	        System.out.print(i+" ");
	}
}