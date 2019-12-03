/*Input Format :
The first line contains a string . The second line contains another string . The strings are comprised of only lowercase English letters.

Output Format:
There are three lines of output:
For the first line, sum the lengths of  and .
For the second line, write Yes if  is lexicographically greater than  otherwise print No instead.
For the third line, capitalize the first letter in both  and  and print them on a single line, separated by a space.*/


import java.io.*;
import java.util.*;

public class Main 
{

    public static void main(String[] args)
    {
        
        Scanner in=new Scanner(System.in);
        String A=in.nextLine();
        String B=in.nextLine();
        int l=A.length()+B.length();
        System.out.println(l);
        int lex= A.compareTo(B);
        if(lex>0)
        System.out.println("Yes");
        if(lex<=0)
        System.out.println("No");
        String a=A.substring(0, 1).toUpperCase() + A.substring(1);
        String b=B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.println(a+ " " +b);
    }
}



