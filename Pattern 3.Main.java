import java.util.*;
class Main
{
    public static void main(String args[])
    {
        int i,j,n;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter n to find upto how many rows");
        n=in.nextInt();
        for(i=1;i<=n;i=i+1)
        {
            for(j=1;j<=i;j=j+1)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(i=1;i<=n;i=i+1)
        {
            for(j=n-1;j>=i;j=j-1)
            {
                System.out.print("*");
            }
        System.out.println();
        }
        
    }
}