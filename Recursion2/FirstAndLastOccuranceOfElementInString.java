// TC:O(n);
class FirstAndLastOccuranceOfElementInString
{
    public static int first=-1;
    public static int last=-1;

    public static void occurance(String str, char ch, int index)
    {
        if(index==str.length())
        {
            System.out.println(first);
            System.out.println(last);
            return;
        }
        if (str.charAt(index)== ch)
        {
            if(first==-1)
            {
                first=index;
                last=index;
            }
            else
            {
                last=index;
            }
        }
        occurance(str,ch,index+1);
    }
    public static void main(String[] args)
    {
        // String str="abaacdaefaah";
        String str="bcadef";
        occurance(str,'a',0);
    }
}