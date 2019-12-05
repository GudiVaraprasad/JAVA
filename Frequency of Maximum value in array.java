import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] a=new int[n];
        for(int i=0;i<a.length;i++)
        {
            a[i]=in.nextInt();
        }
        
        int max=a[0];
        int count=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
            else if(a[i]==max)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}