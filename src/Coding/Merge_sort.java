package Coding;
public class Merge_sort
{
    static void merge(int A[],int low,int mid,int high)
    {
        int temp[]=new int[100];
        int l1=low;
        int l2=mid+1;
        int c=low;
        while(l1<=mid && l2<=high)
        {
            if(A[l1]<A[l2]) 
                temp[c++]=A[l1++];
            else
                temp[c++]=A[l2++];
        }        
        while(l1<=mid)
            temp[c++]=A[l1++];

        while(l2<=high)
            temp[c++]=A[l2++];
        
        for(int i=low;i<=high;i++)
            A[i]=temp[i];
    }
    static void mergeSort(int A[],int low,int high)
    {
        if(low<high)
        {
            int mid=(low+high)/2;
            mergeSort(A,low,mid);
            mergeSort(A,mid+1,high);
            merge(A,low,mid,high);
        }
    }
    public static void main(String[] args) 
    {
	    int A[]={12,14,3,24,2};
	    mergeSort(A,0,A.length-1);
	    for(int i=0;i<A.length;i++)
	        System.out.print(A[i]+" ");
    }
}
