import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        double sum=0,count=0;
        for(double i=1.0;i<=n;i=i+2)
        {
           sum=sum+Math.pow(-1,count)*(4/i);
           count++;
        }
        System.out.println("The approximate value of Pi is " +sum);
    }
}