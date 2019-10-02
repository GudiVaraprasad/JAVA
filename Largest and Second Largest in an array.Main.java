import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();                    //Enter no. of elements in array a
        int[] a=new int[n];
        for(int i=0;i<a.length;i++)
        {
            a[i]=in.nextInt();                 //Enter elements of an array a
        }
        int max1=a[0];
        for(int i=0;i<a.length;i++)
        {
            if(max1<a[i])
            {
                max1=a[i];
            }
        }
        int max2=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>max2 && a[i]<max1)
            {
                max2=a[i];
            }
        }
        System.out.println("Maximum value is "+max1);
        System.out.println("Second Maximum value is "+max2);
    }
}