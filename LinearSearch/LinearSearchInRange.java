class LinearSearchInRange
{
    public static void main(String[] args)
    {
        int[] arr={3,35,3,222,453,13,23,6,65,52,5465,86,87};
        int target=3;
        System.out.println(search(arr,target,2,5));
    }

    static int search(int[] arr,int target, int s,int e)
    {
        if(arr.length==0)
        {
            return -1;
        }
        else
        {
            for(int i=s;i<=e;i++)
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