// TC: O(1) for insertion, deletion and  search

import java.util.HashSet;
import java.util.Iterator;
class Hashset
{
    public static void main(String[] args)
    {
        // Creating HashSet 
        HashSet<Integer> set=new HashSet<>();

        // insert elements - add()
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        System.out.println(set);
        System.out.println("Size Of Set is:"+set.size());

        // Search- contains()
        if(set.contains(1))
        {
            System.out.println("HashSet contain 1");
        }
        if(!(set.contains(4)))
        {
            System.out.println("HashSet does not contain 4 ");
        }

        // delete - remove();
        set.remove(1);
        System.out.println(set);
        if(!(set.contains(1)))
        {
            System.out.println("HashSet does not contain 1 ");

        }

        set.add(1);
        System.out.println(set);

        Iterator it=set.iterator();
        // Order of iteration does not guarenteed
        // hasNext and next methods and works as unordered form
        // hasNext- return true or false
        // next- return the next Element.
        while(it.hasNext())
        {
            System.out.println(it.next());
        }

    }
}