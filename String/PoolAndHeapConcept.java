class PoolAndHeapConcept
{
    public static void main(String[] args)
    {
        // Strings are immutable in java.
        // Strings uses pool in heap and store the value inside pool.
        // When we declare "String a="Hello"", then it means we are using the pool so that we use "==" comparison operator to identify whether the value of the strings are equal or not.
        // When we declare String a= new String("Hello"), then it means the value of string is outside the pool so we use ".equals" method to identify whether the value of the strings are equal or not.

        // These strings are inside the pool inside heap
        String a ="Hello";
        String b ="Hello";
        System.out.println(a==b);
        System.out.println(a.equals(b));

        // These strings are inside the heap not the pool
        String c=new String("Hello");
        String d=new String("Hello");
        System.out.println(c==d);
        System.out.println(c.equals(d));
        System.out.println(c.charAt(3));
    }
}