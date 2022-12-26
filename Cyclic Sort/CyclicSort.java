import java.util.*;
class CyclicSort
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        int[] arr={3,7,6,1,2,4,5};
        int n=arr.length;
        sort(n,arr);
        // for(int i=0;i<n;i++)
        // {
        //     System.out.print(arr[i]+" ");
        // }
        System.out.print(Arrays.toString(arr));
    }
    
    public static void sort(int n,int[] arr)
    {
        int i=0;
        while(i<n)
        {
            int cor_position=arr[i]-1;
            if(arr[cor_position]!=arr[i])
            {
                swap(arr,i,cor_position);
            }
            else
            {
                i++;
            }
        }
    }
    public static void swap(int[] arr,int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}