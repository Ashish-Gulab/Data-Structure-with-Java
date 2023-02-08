class MoveAllxToTheEndOfString
{
    public static void move(String str, String newstr, int index, int count)
    {
        if(index==str.length())
        {
            for(int i=0;i<count;i++)
            {
                newstr+='x';
            }
            System.out.println(newstr);
            return;
        }
        if(str.charAt(index)=='x')
        {
            count++;
            move(str,newstr,index+1,count);
        }
        else
        {
            newstr+=str.charAt(index);
            move(str,newstr,index+1,count);
        }
    }

    public static void main(String[] args)
    {
        String str="axbcxxd";
        move(str,"",0,0);
    }
}