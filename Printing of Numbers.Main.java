import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {        
		Scanner in = new Scanner(System.in);
        System.out.println("Enter the limit: ");
        int n=in.nextInt();
        System.out.println("Numbers are: ");
        for(int i=1; i<=n; i=i+1) 
            System.out.print(" " +i);
    }
}