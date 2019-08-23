import java.util.Scanner;
 
class Main
{
   public static void main(String args[])
   {
      int a,b,c;
      System.out.println("Enter a and b");
      Scanner in = new Scanner(System.in);
     
      a = in.nextInt();
      b = in.nextInt();
     
      System.out.println("Before Swapping\na = "+a+"\nb = "+b);
     
      c=a;
      a=b;
      b=c;
     
      System.out.println("After Swapping\na = "+a+"\nb = "+b);
   }
}