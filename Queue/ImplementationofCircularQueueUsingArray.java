// Operation are performed int O(1)

class ImplementationofCircularQueueUsingArray
{
    static class Queue
    {
        static int arr[];
        static int front=-1;
        static int rear=-1;
        static int size;

        Queue(int n)
        {
            this.size=n;
            arr=new int[n];
        }

        public static boolean isEmpty()
        {
            return front==-1 && rear==-1;
        }

        public static boolean isFull()
        {
            return (rear+1)%size==front;
        }

        public static void add(int data)
        {
            if(isFull())
            {
                System.out.println("Queue is Full");
                return;
            }
            if(front==-1)
            {
                front=0;
            }
            rear=(rear+1)%size;
            arr[rear]=data;
        }

        public static int remove()
        {
            if(isEmpty())
            {
                System.out.println("Queue is Empty");
                return -1;
            }
            int startValue=arr[front];
            if(rear==front)
            {
                rear=front=-1;
            }
            else
            {
                front=(front+1)%size;
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
            return arr[front];
        }
    }

    public static void main(String[] args)
    {
        Queue q=new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        System.out.println("Elements removed from Queue are:");
        System.out.println(q.remove());
        q.add(6);

        System.out.println(q.remove());
        q.add(11);

        System.out.println("Elements Present in Queue are:");
        while(!q.isEmpty())
        {
            System.out.println(q.front());
            q.remove();
        }
    }
}