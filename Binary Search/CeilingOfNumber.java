import java.util.Scanner;
// Ceiling of a target element is "smallest number >= target element" in the array
class CeilingOfNumber
{
    public static void main(String[] args)
    {
        Scanner obj =new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n=obj.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of the Array:");
        for(int i=0;i<n;i++)
        {
            arr[i]=obj.nextInt();
        }
        System.out.println("The sorted Array is:");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Enter the element to be searched: ");
        int target=obj.nextInt();
        int n1=ceilingNumber(arr,target);
        System.out.println(n1);
    }

    public static int ceilingNumber(int[] arr, int target)
    {
        int start=0;
        int end=arr.length-1;
        if(target>=arr[end])
        {
            return -1;
        }
        while(start<=end)
        {
            // int mid=(start+end)/2; //this might be possible that (start+end) exceeds the range of integers in Java
            int mid=start+(end-start)/2;
            if(target==arr[mid])
            {
                return mid;
            }
            else if(target<arr[mid])
            {
                end=mid-1;
            }
            else 
            {
                start=mid+1;
            }
        }
        return start;
    }   
}