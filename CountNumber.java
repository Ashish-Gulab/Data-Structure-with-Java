import java.util.Scanner;
class CountNumber
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=obj.nextInt();
        System.out.println("Enter the digit:");
        int d=obj.nextInt();
        int count=0;
        while(n>0)
        {
            int num=n%10;
            if(num==d)
            count++;
            n=n/10;
        }
        System.out.println("The number of "+d+"'s are:"+count);
    }
}