import java.util.Arrays;
class DifferentOutputs
{
    public static void main(String[] args)
    {
        System.out.println(56);
        // Integer n=new Integer(56);
        // System.out.println(n);
        // System.out.println(n.toString());
        System.out.println("Hello");
        System.out.println(new int[]{2,3,4,5,6,7,8,9,10,11,12});
        System.out.println(Arrays.toString(new int[]{2,3,4,5,6,7,8,9,10,11,12}));

        String name=null;
        System.out.println(name);
    }
}