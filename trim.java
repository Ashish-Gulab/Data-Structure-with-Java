import java.util.Scanner;
class trim
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        char ch=obj.next().trim().charAt(0);
        // trim is used to remove the extra spaces between two words
        if(ch>='A' && ch<='Z')
        {
            System.out.println("This is UpperCase  Alphabet");
        }
        else
        {
            System.out.println("This is UpperCase  Alphabet");
        }
    }
}