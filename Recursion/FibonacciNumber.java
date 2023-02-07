// Recurrance Relation:
// Fibo(N)= Fibo(N-1)+Fibo(N-2)

// The tree formed during the different function calls is call Recursive tree.

class FibonacciNumber
{
    public static void main(String[] args)
    {
        System.out.println(Fibo(4));
    }
    public static int Fibo(int n)
    {
        if(n<2)
        {
            return n;
        }
        // This is not a tail recursion because it include a extra step of addtion at last and then returning.
        return Fibo(n-1)+Fibo(n-2);
    }
}
/*
How to Understand and approach the problem:
* Identify that we can break the problem into smaller problems.
* Write the recurrance relation if needed.
* Draw the recursive tree.
* About the tree:
    ** See the flow of functions, how they are getting into stack.
    ** Identify and focus on left tree calls and right tree calls.Drwa the and pointers again and again using pen & paper.
    ** Use the debugger to see the flow.
* Observe how the values are returned  at each step and where two function calls come out. In the end, we will come out of the function.
*/