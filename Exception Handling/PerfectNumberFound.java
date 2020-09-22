
/* Write a program to accept the number from the user and throw a user defined exception 
" Perfect Number Found " if that number is perfect number.
" Perfect Number not Found " else that number is not perfect number. */

import java.util.*;
import java.io.*;
import java.lang.*;

class PerfectNumber
{
    static boolean perfectnumber(int n) throws Exception
    {
        int sum = 1;
        for (int i = 2; i * i <= n; i++)
        {
            if (n % i==0)
            {
                if(i * i != n)
                {
                    sum = sum + i + n / i; 
                }
                else
                {
                    sum = sum + i; 
                }
            }
        }

        if (sum == n && n != 1)
        {
            throw new Exception ("Perfect Number Found"); 
        }
        else
        {
            throw new Exception ("Perfect Number not Found");
        }
    }
}

public class Main 
{
    public static final PerfectNumber perfect_number = new PerfectNumber();
    public static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) 
    {
        System.out.println();
        System.out.println("Enter the number : ");
        while (in .hasNextInt())
        {
            int n = in .nextInt();

            try 
            {
                System.out.println(perfect_number.perfectnumber(n));
            } 
            catch (Exception e) 
            {
                System.out.println(e);
            }
            finally
            {
                System.out.println();
                System.out.println("Enter again a number to check : ");
            }
        }
    }
}
