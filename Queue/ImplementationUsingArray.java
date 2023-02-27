// Operations in Queue are:
// 1) Enque (Add)
// 2) Dequeue (Remove)
// 3) Front (Peek)
// Normal Queue implementation generally less preferred using Array than LinkedList.
// Circular Queue is implementation is preferred using Array because it done all operations int O(1).
// LinkedList is the already a preferred implementation og Queue in O(1)
// Front is the starting index and Rear is last index.
// This implementation is used

class ImplementationUsingArray
{
    static class Queue
    {
        static int arr[];
        static int rear=-1;
        static int size;

        Queue(int n)
        {
            this.size=n;
            arr=new int[n];
        }

        public static boolean isEmpty()
        {
            return rear==-1;
        }

        // Enqueue TC:O(1)
        public static void add(int data)
        {
            if(rear==size-1)
            {
                System.out.println("Queue is Full");
                return;
            }
            rear++;
            arr[rear]=data;
        }

        // Dequeue TC:O(N)
        public static int remove()
        {
            if(isEmpty())
            {
                System.out.println("Queue is Empty");
                return -1;
            }

            int startValue=arr[0];
            for(int i=0;i<rear;i++)
            {
                arr[i]=arr[i+1];
            }
            rear--;
            return startValue;
        }

        // Peek TC:O(N)
        public static int front()
        {
            if(isEmpty())
            {
                System.out.println("Queue is Empty");
                return -1;
            }
            return arr[0];
        }
    }

    public static void main(String[] args)
    {
        Queue q=new Queue(3);
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
