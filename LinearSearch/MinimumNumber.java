public class MinimumNumber
{
    public static void main(String[] args)
    {
        int[] arr ={3,24,54,7,9,0,1,43,65,-3,3,565,43,685,788};
        System.out.println(minimum(arr));
    }

    static int minimum(int[] arr)
    {
        if(arr.length==0)
        {
            return -1;
        }
        else
        {
            int min=arr[0];
            for(int i=0;i<arr.length;i++)
            {
                if(arr[i]<min)
                {
                    min=arr[i];
                }
            }
            return min;
        }
    }
}