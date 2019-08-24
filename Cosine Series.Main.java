import java.util.*;
class Main
{
    public static void main (String[] args) 
    {
     int i=1,n;
     double sum=1,term=1,x1,x;
     Scanner in=new Scanner(System.in);
     System.out.println("Enter n");
     n=in.nextInt();
     System.out.println("Enter x1");
     x1=in.nextInt();
     x=x1*3.14159/180;
     while(i<=n)
     {
         term=term*(-1)*x*x/(2*i*(2*i-1));
         sum=sum+term;
         i=i+1;
     }
     
    System.out.println("Cosine Series is " +sum);
}
    
}