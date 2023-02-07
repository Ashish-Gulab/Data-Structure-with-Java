/*  |                   |
    |     print5()      |
    |     print4()      |
    |     print3()      |
    |     print2()      |
    |     print1()      |   
    |       main()      |
    |___________________|

Stack insertion of various methods.
* While the function is not finished executing, it will remains in Stack.
* When the function is finished execution, it will removed from Stack and the flow of program is restored where the function is called.
* Base condition in Recursion : condition where are recursion will stop making function calls.
* Base condition not there: function will keep calling again and again, so that the limit of memory exceeds. This will results in Stack Over Flow Condition.
*/

class Numbers5Times
{
    public static void main(String[] args)
    {
        print1(1);
    }

    public static void print1(int n)
    {
        System.out.println(n);
        print2(2);
    }
      
    public static void print2(int n)
    {
        System.out.println(n);
        print3(3);
    }
      
    public static void print3(int n)
    {
        System.out.println(n);
        print4(4);
    }
      
    public static void print4(int n)
    {
        System.out.println(n);
        print5(5);
    }
      
    public static void print5(int n)
    {
        System.out.println(n);
    }
      
}

// Now recursion 
/*
class Numbers5Times
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
        System.out.println(n);
    // If we call a function again and again then it will be treated as a seperate call in the stack.
    // This is a tail recursion because this is the last step in function call and returning.
        print(n+1);
    }
}
*/