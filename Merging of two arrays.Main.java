//MERGING OF TWO ARRAYS :

import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter n1 for no. of elements in an array a");
        int n1=in.nextInt();                  //no. of elements in an array a
        int[] a=new int[n1];
        System.out.println("Enter the elements of an array a");
        for(int i=0;i<a.length;i++)
        {
            a[i]=in.nextInt();                //enter elements of array a
        }
        System.out.println("Enter n2 for no. of elements in an array b");
        int n2=in.nextInt();                  //no. of elements in an array b
        int[] b=new int[n2];
        System.out.println("Enter the elements of an array b");
        for(int i=0;i<b.length;i++)
        {
            b[i]=in.nextInt();                //enter elements of array b
        }
        int n3=n1+n2;                         //total no. of elements in an array c is n3
        int[] c=new int[n3];
        for(int i=0;i<a.length;i++)
        {
            c[i]=a[i];
        }
        for(int i=0;i<b.length;i++)
        {
            c[a.length+i]=b[i];
        }
        System.out.println("Array after Merging is:");
        for(int i=0;i<c.length;i++)
        {
           System.out.print(c[i]+" ");
        }
        

    }
}