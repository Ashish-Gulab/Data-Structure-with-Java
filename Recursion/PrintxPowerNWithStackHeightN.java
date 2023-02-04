class PrintxPowerNWithStackHeightN
{
    public static int power(int x,int n)
    {
        if(n==0)
        {
            return 1;
        }
        if(x==0)
        {
            return 0;
        }
        return x*power(x,n-1);
    }

    public static void main(String[] args)
    {
        int x=2,n=5;
        int pow=power(x,n);
        System.out.println(pow);
    }
}