// Merge Sort is used when we can use an extra space O(nlogn) 
// Quick Sort is used when we cannot use an extra space (O(nlogn) for best and average case and O(n^2) for worst case
import java.util.*;
class MergeSort
{
    public static void conquer(int[] arr, int si, int mid, int ei)
    {
        int[] merged=new int[ei-si+1];
        int i=si,j=mid+1,x=0;
        while(i<=mid && j<=ei)
        {
            if(arr[i]<=arr[j])
            {
                merged[x]=arr[i];
                i++; x++;
            }
            else
            {
                merged[x]=arr[j];
                j++; x++;
            }
        }

        while(i<=mid)
        {
            merged[x]=arr[i];
            x++;i++;
        }
        while(j<=ei)
        {
            merged[x]=arr[j];
            j++; x++;
        }

        for(int k=0,m=si;k<merged.length;k++,m++)
        {
            arr[m]=merged[k];
        }
    }

    public static void divide(int[] arr, int si, int ei)
    {
        if(si>=ei)
        {
            return;
        }

        int mid=si+(ei-si)/2;
        divide(arr,si,mid);
        divide(arr,mid+1,ei);
        conquer(arr,si,mid,ei);
    }

    public static void main(String[] args)
    {
        int[] arr={5,3,7,1,4,9,6,3};
        int n=arr.length;
        divide(arr,0,n-1);
        System.out.print(Arrays.toString(arr));
        // for(int i=0;i<n;i++)
        // {
        //     System.out.print(arr[i]+" ");
        // }
    }
}