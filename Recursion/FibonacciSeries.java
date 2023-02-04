class FibonacciSeries
{
    public static void fibo(int a,int b,int n)
    {
        if(n==0)
        {
            return;
        }

        int c=a+b;
        System.out.print(c+" ");
        fibo(b,c,n-1);
    }

    public static void main(String[] args)
    {
        int a=0,b=1,n=8;
        System.out.print(a+" "+b+" ");
        fibo(a,b,n-2);
    }
}

