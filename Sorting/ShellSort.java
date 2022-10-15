import java.util.Scanner;
class ShellSort
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number of elements of the Array:");
        int n=obj.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of the Array:");
        for(int i=0;i<n;i++)
        {
            arr[i]=obj.nextInt();
        }
        System.out.println("The Array is:");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        shell_sort(arr,n);
        System.out.println();
        System.out.println("The Sorted Array is:");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    
    static void shell_sort(int[] arr,int length)
    {
        int gap=length/2;
        while(gap>0)
        {
            int j=0;
            for(int i=gap;i<length;i++)
            {
                int temp=arr[i];
                for(j=i;j>=gap && arr[j-gap]>temp;j=j-gap)
                {
                    arr[j]=arr[j-gap];
                }
                arr[j]=temp;
            }
            gap=gap/2;
        }
    }
}