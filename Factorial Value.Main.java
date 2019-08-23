import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        int n,i=1,j=1;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter n");
        n=in.nextInt();
        for(i = 1; i<=n; i=i+1)
        {
            j=j*i;
        }
        System.out.println("Factorial Value= " +j);
    }
}