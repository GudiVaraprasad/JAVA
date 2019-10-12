import java.util.*;
class Main
{
  public static void main (String args[])
  {
    Scanner in = new Scanner (System.in);
    int n,factorial;
    n=in.nextInt();
    factorial=fact(n);
      System.out.println ("Factorial is=" + factorial);
  }
  public static int fact (int x)
  {
    int i;
    int Fact=1;
    for(i=1;i<=x;i++)
    Fact=Fact*i;
    return Fact;
  }
}
