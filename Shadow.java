class Shadow
{
    static int x=90; // this will be shadowed at line 8
    public static void main(String[] args)
    {
        System.out.println(x);//90
        int x=40; //This value of x will prefer in main function block
        System.out.println(x); //40
        fun();
    }

    static void fun()
    {
        System.out.println(x);
    }
}