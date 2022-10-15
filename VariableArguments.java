import java.util.Arrays;
class VariableArguments
{
    public static void main(String[] args)
    {
        fun(2,5,7,6,9,87,9,7,97,99);
    }
    // "int...v" is used to any number of elements if we don't know how many elements should be taken. "int...v" represents a "array of integer values"
    // If we use String...v , it represents a "array of string values"
    static void fun(int...v)
    {
        System.out.println(Arrays.toString(v));
    }
}