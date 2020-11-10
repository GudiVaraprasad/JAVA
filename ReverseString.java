import java.util.*;

public class Main
{
    public static String rev(String str) 
    {
        String string = "";
        for (int i = str.length() - 1; i >= 0; i--) 
        {
            string += str.charAt(i);
        }
        return string;
    }
    
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = in.nextLine();
        System.out.println("Reverse the String :" + rev(str));
    }
}
