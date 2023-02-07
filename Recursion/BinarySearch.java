// Recurance Relation: F(N)=O(1) + F(N/2)
// O(1) is comparison and F(N/2) is dividing array into half.
 
// Types of Recurance Relation:
// 1) Linear Recurance Relation: Fibonacci Number
// 2) Divide and Conquerer Recurance Relation: Binary Search

class BinarySearch 
{
    public static void main(String[] args)
    {
        int[] arr={1,2,5,6,7,8,54,76,78,87,89,98,99};
        int target=78;
        System.out.println(search(arr, target, 0, arr.length-1));
    }

    public static int search(int[] arr, int target, int start, int end)
    {
        if(start>end)
        {
            return -1;
        }
        int mid=start+(end-start)/2;

        if(arr[mid]==target)
        {
            return mid;
        }
        if(target<arr[mid])
        {
            return search(arr, target, start, mid-1);
        }
        return search(arr, target, mid+1, end);
    }
}