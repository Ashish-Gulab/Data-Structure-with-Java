import java.util.*;
public class SearchIn2_DArray
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number of rows of the 2-D Array:");
        int r=obj.nextInt();
        System.out.println("Enter the number of column of the 2-D Array:");
        int c=obj.nextInt();
        int[][] arr=new int[r][c];
        System.out.println("Enter the elements of the 2-D Array:");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr[i][j]=obj.nextInt();
            }
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("Enter the number to be search");
        int target=obj.nextInt();
        int[] n=search(arr,r,c,target);
        System.out.println(Arrays.toString(n));   //Arrays.toString Mathod is required to print the output array
    }

    static int[] search(int[][] arr,int r,int c,int target)
    {
        if(arr.length==0)
        {
            return new int[]{-1,-1};
        }
        else
        {
            for(int i=0;i<r;i++)  // for(int i=0;i<arr.length;i++)
            {
                for(int j=0;j<c;j++)  // for(j=0;j<arr[i].length;j++)
                {
                    if(target==arr[i][j])
                    {
                        return new int[]{i,j};
                    }
                }
            }
        }
        return new int[]{-1,-1};
    }
}