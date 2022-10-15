import java.util.Scanner;
class Calculator
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        while(true)
        {
            System.out.println("Enter the operator (+,-,*,/,%) and to quit the  opertion , enter X or x");
            char op=obj.next().trim().charAt(0);
            if(op=='+'||op=='-'||op=='*'||op=='/'|| op=='%')
            {
                System.out.println("Enter the first number:");
                int n1=obj.nextInt();
                System.out.println("Enter the second number:");
                int n2=obj.nextInt();
                if(op=='*')
                {
                    System.out.println("Multiplication: "+(n1*n2));
                }
                if(op=='-')
                {
                    System.out.println("Subtraction: "+(n1-n2));
                }
                if(op=='+')
                {
                    System.out.println("Addition: "+(n1+n2));
                }
                if(op=='%')
                {
                    System.out.println("Modulus: "+(n1%n2));
                }
                if(op=='/')
                {
                    if(n2!=0)
                    {
                        System.out.println("Division: "+(n1/n2));
                    }
                    else
                    {
                        System.out.println("Not possible");
                    }
                }
            }
            else if(op=='X' || op=='x')
            {
                System.out.println("Calculation completed");
                break;
            }
            else
                {
                System.out.println("Enter the correct imput.");
                }
        }
    }
}