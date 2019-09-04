import java.util.Scanner;
class Main
{    
    public static void main(String args[]) 
    {
        Scanner in=new Scanner(System.in);
         
        System.out.println("Enter positive number :");
        int n=in.nextInt();
        int a=0,b=1,c=0;
        while (c<n)
        {
            c=a+b;
            a=b;
            b=c;
        }
         
        if(c==n)
        {
            System.out.println(n +" belongs to Fibonacci series");
        }
        else
        {
            System.out.println(n +" doesn't belongs to Fibonacci series");
        }
    }   
}