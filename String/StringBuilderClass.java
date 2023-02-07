import java.util.*;
class StringBuilderClass
{
    public static void main(String[] args)
    {
        StringBuilder sb=new StringBuilder("T");

        // Append the characters
        sb.append('o');
        System.out.println(sb);

        sb.append('n');
        System.out.println(sb);

        sb.append('y');
        System.out.println(sb);

        // Character at index 0
        System.out.println(sb.charAt(0));

        // Set character at index
        sb.setCharAt(0,'S');
        System.out.println(sb);

        // Insert character at index
        sb.insert(0,'T');
        System.out.println(sb);

        sb.insert(3,'n');
        System.out.println(sb);

        // Deleting the 0 index character
        sb.delete(0,1);
        System.out.println(sb);
    }
}