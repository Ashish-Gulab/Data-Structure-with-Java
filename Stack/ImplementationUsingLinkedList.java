// Stack performs push(O(1)), pop(O(1)) and peek(O(1))
// Stack is Last in First Out(LIFO)
// Stack can be implemented using Array, ArrayList and LinkedList. But practically Array is not preferred.
// Stacks are two types:
// 1) Implicit Stack (made by the memory at the time of recursive calls)
// 2) Explicit Stack (stack we are implemented)

class ImplementationUsingLinkedList
{
    static class Node
    {
        int data;
        Node next;

        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }

    static class Stack
    {
        static Node head;

        public static boolean isEmpty()
        {
            return head==null;
        }

        public static void add(int n)
        {
            Node newNode=new Node(n);
            if(head==null)
            {
                head=newNode;
                return;
            }

            newNode.next=head;
            head=newNode;
        }

        public static int pop()
        {
            if(head==null)
            {
                System.out.println("Stack is Empty");
                return -1;
            }

            int topValue=head.data;
            head=head.next;
            return topValue;
        }

        public static int peek()
        {
            if(head==null)
            {
                System.out.println("Stack is Empty");
                return -1;
            }
            return head.data;
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