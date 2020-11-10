import java.util.*;

public class Main 
{
    public static long factorial(int number) 
    {
        if (number <= 1) 
        {
            return 1;
        }
        return number * factorial(number - 1);
    }
    
    public static void main (String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a non negative integer : ");
        int number = in.nextInt();
        System.out.println("Factorial value : " + factorial(number));
    }
}
