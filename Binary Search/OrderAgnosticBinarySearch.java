import java.util.Scanner;
class OrderAgnosticBinarySearch
{
    public static void main(String[] args)
    {
        // In this binary search we have taken mostly the array in ascending order but if the array is not in ascending order , it is in descending order then we will obtain the wrong output, So We use "Order Agnostic binary search"
        // For Order Agnostic binary Search, the Array is always given sorted but it is not given whether theb given Array is in ascending order or descending order. 
        // We compare any two elements of the Array, so mostly we compare start and emd element, if both elements are same the all the elements are same otherwise if the end element is larger the array is in ascending order else the array is in descending order.
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number of elements of the Array:");
        int n=obj.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of th Array: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=obj.nextInt();
        }
        System.out.println("The Array is:");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Enter the element to be searhed:");
        int target=obj.nextInt();
        int n1=orderAgnosticBinarySearch(arr,target);
        System.out.println(n1);
    }

    public static int orderAgnosticBinarySearch(int[] arr, int target)
    {
        int start=0;
        int end=arr.length-1;
        // boolean bn=arr[start]<arr[end];
        boolean bn=false;
        if(arr[start]<arr[end])
        {
            bn=true;
        }
        else 
        {
            bn=false;
        }
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(target==arr[mid])
            {
                return mid;
            }
            if(bn)
            {
                if(target<arr[mid])
                {
                    end=mid-1;
                }
                else
                {
                    start=mid+1;
                }
            }
            else
            {
                if(target<arr[mid])
                {
                    start=mid+1;
                }
                else 
                {
                    end=mid-1;
                }
            }
        }
        return -1;
    }
}