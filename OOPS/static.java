
import java.util.*;
class Example 
{
  static int n=155;
  int k=65;
  final int x=457;
}
class Main 
{
  public static void main(String args[])
  {
    Example obj=new Example();
    System.out.println("this is static ---- "+Example.n); 
    System.out.println("this is local ---- "+obj.k);
    System.out.println("this is final ---- "+obj.x);
  }
}
 
 // static variables can be accesed directly by classname.variablename
 // local variable cannot be accesed by classname.variablename ... we have to create object of that class
