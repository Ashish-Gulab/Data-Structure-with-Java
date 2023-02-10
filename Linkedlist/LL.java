// In ArrayList the inserting time complexity is O(n) while in Linkedlist it is constant O(1). So at the time of insertion of elements we use the Linkedlist.
// At the time of searching we use the ArrayList (O(1)) while the time complexity of searching in Linkedlist is O(n). So Arraylist is preferred for the searching elements. 
class LL 
{
    Node head;
    private int size;

    LL()
    {
        this.size=0;
    }

    class Node
    {
        String data;
        Node next;

        Node(String data)
        {
            this.data=data;
            this.next=null;
            size++;
        }
    }

    public void addFirst(String data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            return;
        }

        newNode.next=head;
        head=newNode;
    }

    public void addLast(String data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            return;
        }

        Node cur_Node=head;
        while(cur_Node.next!=null)
        {
            cur_Node=cur_Node.next;
        }

        cur_Node.next=newNode;
    }

    public void printList()
    {
        if(head==null)
        {
            System.out.println("List is Empty");
            return;
        }
        Node cur_Node=head;
        while(cur_Node!=null)
        {
            System.out.print(cur_Node.data+" -> ");
            cur_Node=cur_Node.next;
        }
        System.out.println("null");
    }

    public void deleteFirst()
    {
        if(head==null)
        {
            System.out.println("List is Empty.");
            return;
        }

        size--;
        head=head.next;
    }

    public void deleteLast()
    {
        if(head==null)
        {
            System.out.println("List is Empty.");
            return;
        }

        size--;

        if(head.next==null)
        {
            head=null;
        }

        Node secondLast=head;
        Node lastNode=head.next;
        while(lastNode.next!=null)
        {
            lastNode=lastNode.next;
            secondLast=secondLast.next;
        }
        secondLast.next=null;
    }
    
    public int getSize()
    {
        return size;
    }

    public void addMiddle(int index, String data)
    {
        if(index<0 || index>size)
        {
            System.out.println("Enter the correct Index");
            return;
        }

        size++;

        if(head==null || index==0)
        {
            Node newNode=new Node(data);
            newNode.next=head;
            head=newNode;
            return;
        }

        Node curNode=head;

        Node newNode=new Node(data);

        for(int i=1; i<size;i++)
        {
            if(i==index)
            {
                Node nextNode=curNode.next;
                curNode.next=newNode;
                newNode.next=nextNode;
                break;
            }

            curNode=curNode.next;
        }
    }

    public void reverse()
    {
        if(head==null || head.next==null)
        {
            return;
        }

        Node prevNode=head;
        Node currNode=head.next;
        while(currNode!=null)
        {
            Node nextNode=currNode.next;
            currNode.next=prevNode;
            // Update
            prevNode=currNode;
            currNode=nextNode;
        }
        head.next=null;
        head=prevNode;
    }

    public static void main(String[] args)
    {
        LL list=new LL();
        list.addFirst("a");
        list.addFirst("is");
        list.printList();

        list.addLast("LinkedList");
        list.printList();

        list.addFirst("This");
        list.printList();

        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();

        System.out.println(list.getSize());

        list.addFirst("This");
        list.printList();
        System.out.println(list.getSize());

        list.addLast("LinkedList");
        list.printList();

        list.addMiddle(3,"new");
        list.printList();

        list.reverse();
        list.printList();
    }
}
