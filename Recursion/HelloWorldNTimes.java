/*  |                   |
    |     print5()      |
    |     print4()      |
    |     print3()      |
    |     print2()      |
    |     print1()      |   
    |       main()      |
    |___________________|

Stack insertion of various methods.
Requirement of Recursion:
* It helps us in solving bigger problems/ complex problems in a simple way.
* You can convert recursion solution into iteration and vice- versa.
* Space complexity is not constant because of recursive calls.
* It helps in breaking down bigger problems in smaller problems.
*/

class HelloWorldNTimes
{
    public static void main(String[] args)
    {
        print1();
    }

    public static void print1()
    {
        System.out.println("Hello World");
        print2();
    }

    public static void print2()
    {
        System.out.println("Hello World");
        print3();
    }

    public static void print3()
    {
        System.out.println("Hello World");
        print4();
    }

    public static void print4()
    {
        System.out.println("Hello World");
        print5();
    }

    public static void print5()
    {
        System.out.println("Hello World");
    }
}

// Now Recursion 
/*
class HelloWorldNTimes
{
    public static void main(String[] args)
    {
        print(1);
    }

    public static void print(int n)
    {
        if(n==6)
        {
            return;
        }
        System.out.println("Hello World");
        print(n+1);
    }
}
*/