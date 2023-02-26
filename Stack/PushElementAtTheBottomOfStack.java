import java.util.*;

class PushElementAtTheBottomOfStack
{
    public static void pushAtBottom(int data,Stack<Integer> s)
    {
        if(s.isEmpty())
        {
            s.push(data);
            return;
        }
        int topValue=s.pop();
        pushAtBottom(data,s);
        s.push(topValue);
    }

    public static void main(String[] args)
    {
        Stack<Integer> stack=new Stack<>();

        stack.add(1);
        stack.add(2);
        stack.add(3);
        
        pushAtBottom(4,stack);

        while(!stack.isEmpty())
        {
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}