//find the sum of a Series a^1/1! + a^2/2! + a^3/3! +
//a^4/4! +…….+ a^n/n!using methods


import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int n,x;
    System.out.println("Enter the number of terms");
    n=in.nextInt();
    System.out.println("Enter the numerator");
    x=in.nextInt();
    double sum=sumseries(n,x);
    System.out.println("The sum is "+sum);
   }
   public static double sumseries(int N,int X)
   {
     double f,s=0;
     for(int i=1;i<=N;i++)
     {
       f=Math.pow(X,i)/fact(i);
       s=s+f;
     }
      return s;
   }
   public static int fact(int j)
   {
     if(j==0)
     return 1;
     else
     return j*fact(j-1);
   }
}