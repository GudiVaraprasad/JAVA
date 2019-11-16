import java.util.*;
class Main
{
   public static int ArmstrongNumber(int n)
   {
       int r,sum=0;
       while(n>0)
       {
           r=n%10;
           n=n/10;
           sum=sum+r*r*r;
       }
       return sum;
       
   }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int number=in.nextInt();
        int ans= ArmstrongNumber(number);
        Main main=new Main();
        if(number==ans)
        {
        System.out.println(number + " is an Armstrong number.");
        }
        else
        {
           System.out.println(number + " is not an Armstrong number.");  
        }
    }
}