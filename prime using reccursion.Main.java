import java.util.Scanner;
class Main 
{
  static int i = 2, digit, num;
 public static int prime(int m) 
 {
   if (m % i == 0) 
   {
    return 1;
   }
   i++;
   if (i < m)
   prime(m);
   return -1;
 }
 public static void main(String args[]) 
 {
   int n;
   Scanner input = new Scanner(System.in);
   System.out.println("Enter a number: ");
   n = input.nextInt();
   int ans = prime(n);
   if (ans == 1)
   System.out.println("It is a not a prime number");
   else
   System.out.println("It is a prime number");
 }
}