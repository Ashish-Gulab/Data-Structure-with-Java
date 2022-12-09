class Palindrome
{
    public static void main(String[] args)
    {
        String s="abba";
        System.out.println(palindrome(s));
    }

    public static boolean palindrome(String str)
    {
        if(str.length()==0 || str==null)
        {
            return true;
        }
        str.toLowerCase();
        for(int  i=0;i<str.length();i++)
        {
            char start=str.charAt(i);
            char end=str.charAt(str.length()-1-i);

            if(start!=end)
            {
                return false;
            }

        }
        return true;
    }
}