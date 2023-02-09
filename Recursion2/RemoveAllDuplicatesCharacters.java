class RemoveAllDuplicatesCharacters
{
    public static boolean[] map=new boolean[26];
    public static void remove(String str, int index, String newStr)
    {
        if(index==str.length())
        {
            System.out.println(newStr);
            // System.err.println(newStr);
            return;
        }

        char curr=str.charAt(index);
        if(map[curr-'a'])
        {
            remove(str,index+1, newStr);
        }
        else
        {
            newStr+=curr;
            map[curr-'a']=true;
            remove(str,index+1,newStr);
        }

    }

    public static void main(String[] args)
    {
        String str="abbcda";
        remove(str,0,"");
    }
}