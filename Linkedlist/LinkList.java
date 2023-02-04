// LinkedList as a collection Framework

import java.util.*;
class LinkList
{
    public static void main(String[] args)
    {
        LinkedList<String> list=new LinkedList<String>();

        list.addFirst("a");
        list.addFirst("is");

        System.out.println(list);

        list.addLast("LinkedList"); //Here for addLast() function, we can use the add() only but for adding in the first, we need to specify the addFirst() function in the LinkedList. 
        System.out.println(list);

        list.addFirst("This");
        System.out.println(list);

        System.out.println(list.size());

        for(int i=0;i<list.size();i++)
        {
            System.out.print(list.get(i)+" -> ");
        }
        System.out.println("NULL");

        list.removeFirst();
        System.out.println(list);

        list.removeLast();
        System.out.println(list);

        list.add("LinkedList");
        System.out.println(list);

        list.remove(2);
        System.out.println(list);
    }
}