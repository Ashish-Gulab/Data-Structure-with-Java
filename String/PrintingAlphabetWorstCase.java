class PrintingAlphabetWorstCase
{
    public static void main(String[] args)
    {
        String series="";
        for(int i=0;i<26;i++)
        {
            char ch=(char)('a'+i);
            System.out.print(ch+" ");
            series=series+ch;
        }
            System.out.print("\n" +series);
    }
}
// Here, it is creating a new object every time, so it creates another object with the copying of previous object with some value. So that it creates extra strings as a,ab,abc,abcd,abcde,....,abcdefghijklmnopqrstuvwxyz. But we require only last object. So it is a worst case 
// We acn remove this problem using StringBuilder because it is immutable