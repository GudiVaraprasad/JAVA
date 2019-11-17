import java.util.*;
class Main 
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int number=in.nextInt();
        reducebyone(number);
         
        
    }
    public static void reducebyone(int n)
    {
        int a=n;
      if(a>=0)
      {
      reducebyone(a-1);
      System.out.println(a +" ");
      }
    }
}