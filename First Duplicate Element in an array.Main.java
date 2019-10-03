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
         int temp=0;
         for(int i=0;i<a.length;i++)
         {
             for(int j=i+1;j<a.length;j++)
             {
                if((a[i]==a[j]) && (i!=j))
                {
                    System.out.println("The first Duplicate element is "+a[j]);
                    temp=temp+1;
                    break;
                }
             }
         if(temp>0)
         {
             break;
         }
         }

    }
}