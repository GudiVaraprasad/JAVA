import java.util.*;
class Main
{
    public static void main(String args[])
    {
        int n,i=1,j,sum=0;
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        for(i=1;i<=n;i++)
        {
            sum=0;
            for(j=i;j<=i+3;j++)
            {
                sum=sum+j;
            }
            if(sum==n)
            {
             break;
            }
        }    
        if(sum!=n)
        {
            System.out.println("0");
        }
            else
            {
        System.out.println("1");
            }
    }
}