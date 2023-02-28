class ImplementationOfQueueUsingLinkedList
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

    static class Queue
    {
        static Node head=null;
        static Node tail=null;

        public static boolean isEmpty()
        {
            return head==null && tail==null;
        }

        public static void add(int data)
        {
            Node newNode=new Node(data);
            if(isEmpty())
            {
                head=tail=newNode;
                return;
            }
            tail.next=newNode;
            tail=newNode;
        }

        public static int remove()
        {
            if(isEmpty())
            {
                System.out.println("Queue is Empty");
                return -1;
            }
            int startValue=head.data;
            head=head.next;
            if(head==tail)
            {
                tail=null;
            }
            return startValue;
        }

        public static int front()
        {
            if(isEmpty())
            {
                System.out.println("Queue is Empty");
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args)
    {
        Queue q=new Queue();

        q.add(1);
        q.add(2);
        q.add(3);
        
        while(!q.isEmpty())
        {
            System.out.println(q.front());
            q.remove();
        }
    }
}