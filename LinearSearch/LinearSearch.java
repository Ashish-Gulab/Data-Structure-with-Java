public class LinearSearch
{
    public static void main(String[] args)
    {
        int[] arr={23,5,7,43,5,76,3,232,75,32,546,889};
        int n=search(arr,23);
        System.out.println(n);
    }

    static int search(int[] arr, int target)
    {
        if(arr.length==0)
        {
            return -1;
        }
        else
        {
            for(int i=0;i<arr.length;i++)
            {
                if(target==arr[i])
                {
                    return i;
                }
            }
        }
        return -1;
    }
}