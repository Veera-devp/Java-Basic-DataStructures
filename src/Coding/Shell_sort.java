package Coding;
public class Shell_sort
{
    static void shellSort(int[] A,int N)
    {
        for(int gap=N/2;gap>0;gap=gap/2)
        {
            for(int s=gap;s<N;s++)
            {
                int curPos=s;
                int prvPos=curPos-gap;
                while(prvPos>=0)
                {
                    if(A[prvPos]>A[curPos])
                    {
                        int tmp=A[prvPos];
                        A[prvPos]=A[curPos];
                        A[curPos]=tmp;
                    }
                    curPos=prvPos;
                    prvPos=curPos-gap;
                }
            }
        }
    }
    
	public static void main(String[] args) 
	{
	    int A[]={12,35,3,24,2};
	    shellSort(A,A.length);
	    for(int i=0;i<A.length;i++)
	        System.out.print(A[i]+" ");
	}
}
