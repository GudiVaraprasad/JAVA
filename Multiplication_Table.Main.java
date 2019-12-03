import java.util.Scanner;
public class Multiplication_Table
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
	    System.out.print("Enter number: ");        
	    int n=in.nextInt();
        for(int i=1; i <= 20; i++)
        {
            System.out.println(n+ " * " +i+ " = " +n*i);
        }
    }
}