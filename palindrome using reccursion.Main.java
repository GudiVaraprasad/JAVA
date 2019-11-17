import java.util.Scanner;
public class Main 
{
  static int reversed = 0, digit, num;
  public static int palindrome(int N) 
  {
    if (N > 0) 
    {
      digit = N % 10;
      reversed = (reversed * 10) + digit;
      N = N / 10;
      palindrome(N);
    }
      return reversed;
  }
  public static void main(String args[]) 
  {
    int n;
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a number: ");
    n = in.nextInt();
    int ans = palindrome(n);
    if (ans == n)
    System.out.println("It is a palindrome");
    else
    System.out.println("It is not a palindrome");
  }
}