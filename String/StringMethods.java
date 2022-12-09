import java.util.*;
class StringMethods
{
    public static void main(String[] args)
    {
        String name= "Ashish Gulab";
        System.out.println(Arrays.toString(name.toCharArray()));
        name.toLowerCase();
        System.out.println(name); // Strings are immutable so that it remains as same, it does not change into lowercase.
        System.out.println(name.indexOf('i')); 
        System.out.println("  Ashish   ".strip()); 
        System.out.println(Arrays.toString(name.split(" ")));
    }
}