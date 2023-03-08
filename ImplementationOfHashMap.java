/*
    HashMap Functions
    1) put()
    2) get()
    3) containsKey()
    4) remove()
    5) size()
    6) keySet()
    It is implemented internally using Array Of LinkedList
*/

import java.util.*;

public class ImplementationOfHashMap
{
    public class HashMap<K,V>
    {
        class Node
        {
            K key;
            V value;

            Node(K key, V value)
            {
                this.key=key;
                this.value=value;
            }
        }

        int n;
        int N;
        LinkedList<Node> buckets[];

        @SuppressWarnings("unchacked")
        public HashMap()
        {
            this.N=4;
            this.buckets=new LinkedList[4];
            for(int i=0;i<4;i++)
            {
                this.buckets[i]=new LinkedList<>();
            }
        }

        public boolean containsKey(K key)
    }
}