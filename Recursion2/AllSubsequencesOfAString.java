// TC: O(2^n)
class AllSubsequencesOfAString
{
    public static void subsequences(String str, int index, String newStr)
    {
        if(index==str.length())
        {
            System.out.println(newStr);
            return;
        }

        char curr=str.charAt(index);

        // To be
        subsequences(str,index+1,newStr+curr);

        // not to be
        subsequences(str,index+1,newStr);
    }

    public static void main(String[] args)
    {
        String str="abc";
        subsequences(str,0,"");
    }
}