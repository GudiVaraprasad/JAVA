//BRUTE FORCE METHOD :

import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();                  //no. of elements in an array a
        int[] a=new int[n];
        for(int i=0;i<a.length;i++)
        {
            a[i]=in.nextInt();                //enter elements of array a
        }
        System.out.println("Duplicate elements are:");
        for(int i=0;i<a.length-1;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if((a[i]==a[j]) & (i!=j))
                {
                    System.out.println(a[j]+" , ");
                }
                else
                {
                    System.out.println("No duplicate elements are found !!");
                }
            }
        }
        

    }
}