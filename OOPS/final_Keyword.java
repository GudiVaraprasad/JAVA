import java.util.*;
class Main 
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    final int n=in.nextInt();
    // n=n+1; <---- shows error if written
    System.out.println("this is final ---- "+n);
  }
}

/*  If n=n+1 is written, the error is : 
    Main.java:8: error: cannot assign a value to final variable n
       n=n+1;
       ^
 1 error
*/
