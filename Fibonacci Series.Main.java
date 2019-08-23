import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        int a=0,b=1,r=0,n;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter n");
        n=in.nextInt();
        System.out.print(" " +a);
        System.out.print(" " +b);
        while(r<=n)
        {
            a=b;
            b=r;
            r=a+b;
        System.out.print(" " +r);
        }
    }
}