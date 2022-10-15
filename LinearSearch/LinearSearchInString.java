public class LinearSearchInString
{
    public static void main(String[] args)
    {
        String str="Hello";
        char target='e';
        boolean n=search(str,target);
        System.out.println(n);
    }

    static boolean search(String str,char target)
    {
        if(str.length()==0)
        {
            return false;
        }
        else
        {
            for(int i=0;i<str.length();i++)
            {
                if(target==str.charAt(i))
                {
                    return true;
                }
            }
        }
        return false;
    }
}
// For for-each loop
/*static boolean search(String str,char target)
    {
        if(str.length()==0)
        {
            return false;
        }
        else
        {
            for(char ch: str.toCharArray())
            {
                if(ch==target)
                {
                    return true;
                }
            }
        }
        return false;
    }*/
    //if we use in main function "System.out.println(Arrays.toString(str.toCharArray()));" then it will print the array of the string