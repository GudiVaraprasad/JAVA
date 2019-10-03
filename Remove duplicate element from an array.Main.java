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
            a[i]=in.nextInt();                //enter elements of only a sorted array a
        }
        int[] temp=new int[a.length];
        int j=0;
        System.out.println("Array after removing duplicate elements");
        for(int i=0;i<a.length-1;i++)
        {
            if(a[i]!=a[i+1])
            {
                temp[j]=a[i];
                j++;
            }
        }
        temp[j]=a[a.length-1];
        for(int i=0;i<temp.length;i++)
        {
            System.out.print(temp[i]+" ");
        }

    }
}