import java.util.HashSet;

class AllUniqueSubsequencesOfAString
{
    public static void uniqueSubsequences(String str, int index, String newStr, HashSet<String> set)
    {
        if(index==str.length())
        {
            if(set.contains(newStr))
            {
                return;
            }
            else
            {
                System.out.println(newStr);
                set.add(newStr);
                return;
            }
        }

        char curr=str.charAt(index);

        // To be
        uniqueSubsequences(str, index+1, newStr+curr,set);

        // Not to be
        uniqueSubsequences(str, index+1, newStr, set);
    }

    public static void main(String[] args)
    {
        HashSet<String> set=new HashSet<>();
        String str="aaa";
        uniqueSubsequences(str,0,"",set);
    }
}