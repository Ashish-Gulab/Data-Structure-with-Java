class AllCombinationsOfKeypadForAString
{
    public static String[] keypad=                  
    {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static void combinations(String str, int index, String combination)
    {
        if(index==str.length())
        {
            System.err.println(combination);
            return;
        }

        char curr=str.charAt(index);
        String mapping=keypad[curr-'0'];
        for(int i=0;i<mapping.length();i++)
        {
            combinations(str,index+1,combination+mapping.charAt(i));
        }
    }

    public static void main(String[] args)
    {
        String str="23";
        combinations(str,0,"");
    }
}