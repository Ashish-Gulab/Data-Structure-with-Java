// Given an input string and a dictionary of words, find out if the input string can be broken into a space separated sequence of dictionary words
import java.util.*;
class WordBreakProblem
{
    static class Node
    {
        Node children[];
        boolean endOfWord;

        public Node()
        {
            children=new Node[26];
            for(int i=0;i<26;i++)
            {
                children[i]=null;
            }

            endOfWord=false;
        }
    }

    static Node root=new Node();

    public static void insert(String word)
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
                curr.children[index].endOfWord=true;
            }
            curr=curr.children[index];
        }
    }

    public static boolean search(String word)
    {
        Node curr=root;
        for(int i=0;i<word.length();i++)
        {
            int index=word.charAt(i)-'a';
            if(curr.children[index]==null)
            {
                return false;
            }
            if(i==word.length()-1 && curr.children[index].endOfWord==false)
            {
                return false;
            }
            curr=curr.children[index];
        }
        return true;
    }

    public static boolean wordBreak(String key)
    {
        Map<String,Boolean> map=new HashMap<>();
        if(key.length()==0)
        {
            return true;
        }
        if(map.containsKey(key))
        {
            return map.get(key);
        }
        for(int i=1;i<=key.length();i++)
        {
            String first=key.substring(0,i);
            String second=key.substring(i);
            if(search(first) && wordBreak(second))
            {
                map.put(key,true);
                return true;
            }
        }
        map.put(key,false);
        return false;
    }

    public static void main(String[] args)
    {
        String[] words={"i","like","sam","samsung","mobile","ice"};
        for(int i=0;i<words.length;i++)
        {
            insert(words[i]);
        }

        System.out.println(search("like"));
        System.out.println(search(words[3]));

        System.out.println(wordBreak("ilikesam"));
        System.out.println(wordBreak("ilikesamsung"));
        System.out.println(wordBreak("ilikesung"));
    }
}