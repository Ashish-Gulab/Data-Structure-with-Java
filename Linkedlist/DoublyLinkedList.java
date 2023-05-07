class DoublyLinkedList
{
    static int size;
    DoublyLinkedList()
    {
        this.size=0;
    }

    class Node
    {
        int data;
        Node prev;
        Node next;

        Node(int data)
        {
            this.data=data;
            this.prev=null;
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
            return;
        }

        if(head.next==null)
        {
            newNode.next=head;
            head.prev=newNode;
            head=newNode;
            tail.prev=head;
            return;
        }

        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }

    public void addLast(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            tail=newNode;
            return;
        }

        tail.next=newNode;
        newNode.prev=tail;
        tail=newNode;
    }

    public void addMid(int index, int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            tail=newNode;
            return;
        }

        if(head.next==null)
        {
            newNode.next=head;
            head.prev=newNode;
            head=newNode;
            tail.prev=head;
            return;
        }

        if(index==0)
        {
            newNode.next=head;
            head.prev=newNode; 
            return;
        }

        Node curr=head;
        for(int i=1;i<size;i++)
        {
            if(index==i)
            {
                Node nextNode=curr.next;
                curr.next=newNode;
                newNode.prev=curr;
                newNode.next=nextNode;
                nextNode.prev=newNode;
            }
            curr=curr.next;
        }

        if(index==size-1)
        {
            tail=newNode;
        }
    }

    public void removeFirst()
    {
        if(head==null)
        {
            System.out.println("LinkedList is Empty.");
            return;
        }

        size--;
        if(head==tail)
        {
            head=tail=null;
            return;
        }

        head=head.next;
        head.prev=null;
    }

    public void removeLast()
    {
        if(head==null)
        {
            System.out.println("LinkedList is Empty.");
            return;
        }

        size--;
        if(head==tail)
        {
            head=tail=null;
            return;
        }
        if(tail.prev==head)
        {
            head.next=null;
        }
        tail=tail.prev;
        tail.next=null;
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
            head=tail=null;
            size--;
            return;
        }

        if(index==0)
        {
            head=head.next;
            head.prev=null;
            size--;
            return;
        }

        if(index==size-1)
        {
            tail=tail.prev;
            tail.next=null;
            size--;
            return;
        }

        Node curr=head;
        for(int i=1;i<size;i++)
        {
            if(i==index)
            {
                Node nextNode=curr.next.next;
                curr.next=nextNode;
                nextNode.prev=curr;
            }
            curr=curr.next;
        }
        size--;
    }

    // Using head 
    public void printList()
    {
        if(head==null)
        {
            System.out.println("LinkedList is Empty.");
            return;
        }

        Node curr=head;
        while(curr!=null)
        {
            System.out.print(curr.data+"->");
            curr=curr.next;
        }
        System.out.println("Null");
    }

    // Using tail 
    public void printListTail()
    {
        if(tail==null)
        {
            System.out.println("LinkedList is Empty.");
            return;
        }

        Node curr=tail;
        System.out.print("Null");
        while(curr!=null)
        {
            System.out.print("<-"+curr.data);
            curr=curr.prev;
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        DoublyLinkedList list=new DoublyLinkedList();
        list.addFirst(2);
        list.addFirst(1);
        list.addLast(4);
        list.addLast(5);
        list.addLast(6);
        list.addMid(2,3);
        list.printList();
        list.removeFirst();
        list.printList();
        list.removeLast();
        list.printList();
        list.removeMid(2);
        list.printList();
        // list.printListTail();
        System.out.println(list.size);
        System.out.println(tail.prev.data);
    }
}