class PrettyPrinting
{
    public static void main(String[] args)
    {
        float a=34.50443430f;
        System.out.println(a);
        System.out.printf("The value around two places is %.2f. \n",a);
        System.out.printf("The value of pi around two places is %.2f. \n",Math.PI);
        System.out.printf("Hello I am %s and I am feeling %s.","Ashish Gulab","Good");
        System.out.printf("Hello I am %s and I am feeling %.1s.","Ashish Gulab","Good");
    }
}