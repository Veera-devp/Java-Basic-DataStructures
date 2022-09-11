package Coding;
public class Quick_sort
{
    static void quickSort(int A[],int low,int high)
    {
        if(low<high)
        {
            int pivot=high;
            int L=low-1;
            int H=high;
            while(true)
            {
                while(L<H && A[++L]<=A[pivot]);
                while(L<H && A[--H]>A[pivot]);
                if(L<H)
                {
                    int tmp=A[L];
                    A[L]=A[H];
                    A[H]=tmp;
                }
                else
                    break;   
            }
            int tmp=A[pivot];
            A[pivot]=A[H];
            A[H]=tmp;
            quickSort(A,low,H-1);
            quickSort(A,H+1,high);
        }
    }
	public static void main(String[] args)
	{
	    int A[]={29,35,3,24,2};
	    quickSort(A,0,A.length-1);
	    for(int i=0;i<A.length;i++)
		    System.out.print(A[i]+" ");
	}
}
