import java.util.*;
class Operators
{
    public static void main(String[] args)
    {
        System.out.println('a'+'b'); //Give addition of their ASCII values

        System.out.println("a"+"b"); // Give ab, it merge

        System.out.println('a'+3); //Give 97+3=100
        System.out.println((char)('a'+3)); //Give d

        System.out.println("a"+1); // integer will be converted to the Integer that will call "toString()" method
        
        System.out.println("Hello" + new ArrayList<>()); // Give Hello[]
        System.out.println("Hello" + new Integer(56)); // Give Hello56
        System.out.println( new Integer(56)+""+new ArrayList<>()); // Give 56[]
    }
}