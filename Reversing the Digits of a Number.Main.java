import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        int n,r,sum=0;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter n");
        n=in.nextInt();
        System.out.println("Original Number=" +n);
        while(n>0) 
        {
            r=n%10;
            n=n/10;
            sum=sum*10+r;
        }
        System.out.println("Reversed Number=" +sum);
    }
}