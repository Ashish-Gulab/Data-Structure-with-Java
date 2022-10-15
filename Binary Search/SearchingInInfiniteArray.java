class SearchingInInfiniteArray
{
    public static void main(String[] args)
    {
        int[] arr={5,8,9,12,34,45,56,67,68,78,89};
        int target=45;
        // int n=func(arr,target);
        System.out.println(func(arr,target));
    }
    public static int func(int[] arr,int target)
    {
        int start=0;
        int end=1;
        while(target>arr[end])
        {
            int temp=end+1;
            end=end+(end-start+1)*2;
            start = temp;
        }
        return binarySearch(arr,target,start,end);
    }
    public static int binarySearch(int[] arr,int target,int start,int end)
    {
        while(start<=end)
        {
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
        return -1;
    }
}