import java.util.*;
public class Main 
{

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the expression : ");
        String s = in .nextLine();
        String expression[]= {"",""};
        
        int str_ind = 0;
        char c = ' ';
        for (int i = 0; i < s.length(); i++) 
        {
            if (s.charAt(i) == '+' || s.charAt(i) == '-' || s.charAt(i) == '*' || s.charAt(i) == '/') 
            {
                c = s.charAt(i);
                str_ind++;
            } 
            else 
            {
                expression[str_ind] = expression[str_ind] + s.charAt(i);
            }
        }
        
        if (c == '+')
            System.out.println("Result is : " + addition(expression[0], expression[1]));
        else if (c == '-')
            System.out.println("Result is : " + subtraction(expression[0], expression[1]));
        else if (c == '*')
            System.out.println("Result is : " + multiplication(expression[0], expression[1]));
        else
            System.out.println("Result is : " + division(expression[0], expression[1]));
    }

    static int addition(String x, String y) 
    {
        int A = Integer.parseInt(x);
        int B = Integer.parseInt(y);

        return A + B;
    }

    static int subtraction(String x, String y) 
    {
        int A = Integer.parseInt(x);
        int B = Integer.parseInt(y);
        return A - B;
    }

    static int multiplication(String x, String y)
    {
        int A = Integer.parseInt(x);
        int B = Integer.parseInt(y);
        return A * B;
    }

    static double division(String x, String y) 
    {
        int A = Integer.parseInt(x);
        int B = Integer.parseInt(y);
        return A / B;
    }
}
