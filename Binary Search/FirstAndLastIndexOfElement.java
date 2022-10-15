import java.util.*;
class FirstAndLastIndexOfElement {

    public static void main(String[] args)
    {
        int[] nums={2,5,7,7,7,7,8,9,34};
        int target=7;
        int[] a={-1,-1};
        int start=search(nums,target, true);
        int end=search(nums,target, false);
        a[0]=start;
        a[1]=end;
        System.out.println(Arrays.toString(a));
    }
    public static int search(int[] nums,int target,boolean findStartIndex)
    {
        int a=-1;
        int start=0;
        int end=nums.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(target<nums[mid])
            {
                end=mid-1;
            }
            else if(target>nums[mid])
            {
                start=mid+1;
            }
            else
            {
                a=mid;
                if(findStartIndex)
                {
                    end=mid-1;
                }
                else
                {
                    start=mid+1;
                }
            }
        }
        return a;
    }
}