// Program to print x^n with the Stack Height of logn in the binary Tree format.
class PrintxPowerNWithStackHeightLogN
{
    public static int power(int x,int n)
    {
        int pow;
        if(n==0)
        {
            return 1;
        }
        if(x==0)
        {
            return 0;
        }
        if(n%2==0)
        {
            pow= power(x,n/2)*power(x,n/2);
        }
        else
        {
            pow= power(x,n/2)*power(x,n/2)*x;
        }
        return pow;
    }

    public static void main(String[] args)
    {
        int x=2,n=5;
        int pow=power(x,n);
        System.out.println(pow);
    }
}