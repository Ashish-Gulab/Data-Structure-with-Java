import java.util.*;

class ImplementationUsingArrayList
{
    static class Stack
    {
        static ArrayList<Integer> list=new ArrayList<>();

        public static boolean isEmpty()
        {
            return list.size()==0;
        }

        public static void add(int data)
        {
            list.add(data);
        }

        public static int pop()
        {
            if(list.isEmpty())
            {
                System.out.println("Stack is Empty");
                return -1;
            }
            int topValue=list.get(list.size()-1);
            list.remove(list.size()-1);
            return topValue;
        }

        public static int peek()
        {
            if(list.isEmpty())
            {
                System.out.println("Stack is Empty");
                return -1;
            }
            return list.get(list.size()-1);
        }
    }

    public static void main(String[] args)
    {
        Stack s=new Stack();
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);

        while(!s.isEmpty())
        {
            System.out.println(s.peek());
            s.pop();
        }
    }
}