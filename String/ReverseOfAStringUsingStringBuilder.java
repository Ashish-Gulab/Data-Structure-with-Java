class ReverseOfAStringUsingStringBuilder
{
    public static void main(String[] args)
    {
        StringBuilder sb=new StringBuilder("Hello");
        for(int i=0;i<(sb.length()/2);i++)
        {
            int first=i;
            int last=sb.length()-1-i;

            char front=sb.charAt(last);
            char back=sb.charAt(first);
            sb.setCharAt(first,front);
            sb.setCharAt(last,back);
        }
        System.out.println(sb);
    }
}