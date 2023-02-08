// Check the array id sorted (Strictly Increasing)
// (1,2,2,4) is not strictly increasing 
// (1,2,3,4) is strictly increasing.
// TC:O(n)

class ArrayIsSorted
{
    public static boolean sort(int[] arr, int index)
    {
        if(index==arr.length-1)
        {
            return true;
        }
        if(arr[index]<arr[index+1])
        {
            return sort(arr,index+1);
        }
        else
        {
            return false;
        }

        // It's reverse condition is:
        // if(arr[index]>=arr[index+1])
        // {
        //     return false;
        // }
        // return sort(arr,index+1);
    }

    public static void main(String[] args)
    {
        int[] arr={1,2,3};
        System.out.println(sort(arr,0));
    }
}