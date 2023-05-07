class CircularlyLinkedList
{
    static int size;

    CircularlyLinkedList()
    {
        this.size=0;
    }

    class Node
    {
        int data;
        Node next;

        Node(int data)
        {
            this.data=data;
            this.next=null;
            size++;
        }
    }

    static Node head;
    static Node tail;

    public void addFirst(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            tail=newNode;
            tail.next=head;
            return;
        }

        newNode.next=head;
        head=newNode;
        tail.next=head;
    }

    public void addLast(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            tail=newNode;
            tail.next=head;
            return;
        }

        tail.next=newNode;
        tail=newNode;
        tail.next=head;
    }

    public void addMid(int index,int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            tail=newNode;
            tail.next=head;
            return;
        }
        if(index==0)
        {
            newNode.next=head;
            head=newNode;
            tail.next=head;
            return;
        }

        Node curr=head;
        for(int i=1;i<size;i++)
        {
            if(i==index)
            {
                Node nextNode=curr.next;
                curr.next=newNode;
                newNode.next=nextNode;
            }
            curr=curr.next;
        }

        if(index==size-1)
        {
            tail=newNode;
            tail.next=head;
            return;
        }
    }

    public void removeFirst()
    {
        if(head==null)
        {
            System.out.println("LinkedList is Empty.");
            return;
        }

        if(head==tail)
        {
            head=tail=null;
            return;
        }

        head=head.next;
        tail.next=head;
    }

    public void removeLast()
    {
        if(head==null)
        {
            System.out.println("LinkedList is Empty.");
            return;
        }

        if(head==tail)
        {
            head=tail=null;
            return;
        }

        Node curr=head;
        while(curr.next!=tail)
        {
            curr=curr.next;
        }
        tail=curr;
        tail.next=head;
    }

    public void removeMid(int index)
    {
        if(head==null)
        {
            System.out.println("LinkedList is Empty.");
            return;
        }

        if(head==tail)
        {
            tail=head=null;
            return;
        }

        if(index==0)
        {
            head=head.next;
            tail.next=head;
            return;
        }

        Node curr=head;
        for(int i=1;i<size;i++)
        {
            if(i==index)
            {
                curr.next=curr.next.next;
            }
            curr=curr.next;
        }
    }

    public void printList()
    {
        if(head==null)
        {
            System.out.println("LinkedList is Empty.");
            return;
        }

        Node curr=head;
        do
        {
            System.out.print(curr.data+"->");
            curr=curr.next;
        }
        while(curr!=head);
        System.out.println("head");
    }

    public static void main(String[] args)
    {
        CircularlyLinkedList list=new CircularlyLinkedList();
        list.addFirst(2);
        list.addFirst(1);
        list.addLast(4);
        list.addMid(2,3);
        list.addMid(4,5);
        list.addMid(0,0);
        list.printList();
        list.removeFirst();
        list.removeLast();
        list.removeMid(0);
        list.printList();
        System.out.println(list.size);
    }
}