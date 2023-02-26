import java.util.*;

class ReverseOfAStack
{
    public static void pushAtBottom(Stack<Integer> s, int data)
    {
        if(s.isEmpty())
        {
            s.push(data);
            return;
        }
        int topValue=s.pop();
        pushAtBottom(s,data);
        s.push(topValue);
    }

    public static void reverse(Stack<Integer> s)
    {
        if(s.isEmpty())
        {
            return;
        }

        int topValue=s.pop();
        reverse(s);
        pushAtBottom(s,topValue);
    }

    public static void main(String[] args)
    {
        Stack<Integer> stack=new Stack<>();
        stack.add(1);
        stack.add(2);
        stack.add(3);
        stack.add(4);

        reverse(stack);
        while(!stack.isEmpty())
        {
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}