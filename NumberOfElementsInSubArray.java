/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class NumberOfElementsInSubArray
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
		    arr[i]=obj.nextInt();
		}
		int value=0;
		int i=0;
		while(i<n)
		{
		    int count=0;
		    int j=0;
		    for( j=i;j<n;j++)
		    {
		        if(arr[j]!=0)
		        {
		            count++;
		        }
		        else 
		        {
		            j++;
		            break;
		        }
		    }
		    i=j;
		    if(count>value)
		    {
		        value=count;
		    }
		    else 
		    {
		        value=value;
		    }
		}
		System.out.println(value);
	}
}
