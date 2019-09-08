import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int m,n,i=2,j=2,sum1=0,sum2=0;
        m=in.nextInt();
        n=in.nextInt();
        while(i>1 && i<m)
        {
            if(m%i==0)
            {
            sum1=sum1+i;
            }
            i++;
        }
        while(j>1 && j<n)
        {
            if(n%j==0)
            {
            sum2=sum2+j;
            }
            j++;
        }
        if(sum1>sum2)
        {
            System.out.println(m);
        }
        else
        {
            System.out.println("No dominance");
        }
    }
}