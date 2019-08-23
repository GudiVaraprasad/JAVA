import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        int n,i=0,sum=0;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter maximum value of n");
        n=in.nextInt();
        System.out.println("Sum of Whole Numbers");
        for(i = 0; i<=n ; i=i+1)
        {
            sum=sum+i;
        }
        System.out.println("Sum = " + sum);
    }
}