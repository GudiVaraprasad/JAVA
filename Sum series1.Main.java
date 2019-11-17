import java.util.Scanner;
class Main 
{
  public static void main(String[] args) 
  {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    double ans = Sum(n, sum);
    System.out.println(ans);
  }
  static double sum = 0;
  static double add = 0;
  public static int fact(int a) 
  {
    int c = 0;
    if (a == 0) 
    {
      c = 1;
    } 
    else 
    {
      c = a * fact(a - 1);
    }
    return c;
  }
  public static double Sum(int x, double sum) 
  {
    double p = (double) x / fact(x);
    sum = sum + p;
    if (x > 0)
    {
      add = add + p;
      Sum(x - 1, sum);
    }
    return add;
  }
}