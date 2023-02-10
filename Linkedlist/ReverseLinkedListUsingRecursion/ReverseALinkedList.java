import java.util.LinkedList;

class ReverseALinkedList
{
    static Node head;

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

    public static void printLL()
    {
        if(head==null)
        {
            System.out.println("LinkedList is empty");
            return;
        }
        Node curr=head;
        while(curr!=null)
        {
            System.out.print(curr.data+" ---> ");
            curr=curr.next;
        }
        System.out.println("null");
    }

    public static Node reverse(Node head)
    {
        if(head==null || head.next==null)
        {
            return head;
        }

        Node newHead=reverse(head.next);
        head.next.next=head;
        head.next=null;

        return newHead;

    }

    public static void main(String[] args)
    {
        // ReverseALinkedList list=new ReverseALinkedList();

        // Creating and inserting node data
        head=new Node(1);
        Node second=new Node(2);
        Node third=new Node(3);
        Node fourth=new Node(4);

        // Creating a connection
        head.next=second;
        second.next=third;
        third.next=fourth;
        
        ReverseALinkedList.printLL();

        head=reverse(head);
        ReverseALinkedList.printLL();

    }
}