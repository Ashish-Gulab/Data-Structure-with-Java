// It s also known as prefix tree, digital search tree and Retrieval tree.
// It is mostly used when the large numbers of words are there to search, insert.
// It is used for dictionary.
// Time complexity of search in Skewed BST is O(n), in AVL tree is O(logn), in trie O(L) where L is the Length of the largest word which is more better than the O(n) and O(logn) tie complexities.
// So for searching in the String we preffered trie.

class TrieImplementation
{
    static class Node
    {
        Node[] children;
        boolean endOfword;

        public Node()
        {
            children=new Node[26];
            for(int i=0;i<26;i++)
            {
                children[i]=null;
            }
            endOfword=false;
        }
    }

    static Node root=new Node();

    public static void insert(String word) // O(L)
    {
        Node curr=root;
        for(int i=0;i<word.length();i++)
        {
            int index=word.charAt(i)-'a';
            if(curr.children[index]==null)
            {
                curr.children[index]=new Node();
            }
            if(i==word.length()-1)
            {
                curr.children[index].endOfword=true;
            }
            curr=curr.children[index];
        }
    }

    public static boolean search(String key)  //O(L) L= Length of Key
    {
        Node curr=root;
        for(int i=0;i<key.length();i++)
        {
            int index=key.charAt(i)-'a';
            if(curr.children[index]==null)
            {
                return false;
            }
            if(i==key.length()-1 && curr.children[index].endOfword==false)
            {
                return false;
            }
            curr=curr.children[index];
        }
        return true;
    }

    public static void main(String[] args)
    {
        String words[]={"the","a","there","their","any"};
        for(int i=0;i<words.length;i++)
        {
            insert(words[i]);
        }

        System.out.println(search("their"));
        System.out.println(search("thor"));
        System.out.println(search("an"));
    }
}