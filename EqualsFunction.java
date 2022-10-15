import java.util.Scanner;
class EqualsFunction
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the name of fruits:");
        String str=obj.next();
        if(str.equals("mango"))
        {
            System.out.println("This is the king of fruits.");
        }
        else if(str.equals("Apple"))
        {
            System.out.println("This is red in colour.");
        }
        else
        {
            System.out.println("This is another fruit");                     
        }
    }
}                  