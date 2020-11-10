import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String s = in .nextLine();
        System.out.println("Enter the choice\n1-SubString\n2-To lower case\n3-To Upper case");
        int n = in .nextInt();
        switch (n) 
        {
            case 1:
                {
                    System.out.println("Enter the indixes : ");
                    int o = in .nextInt();
                    int e = in .nextInt();
                    subString(s, e, o);
                }
                break;
                
            case 2:
                {
                    System.out.println(toLowerCase(s));
                }
                break;
                
            case 3:
                {
                    System.out.println(toUpperCase(s));
                }
                break;
                
            default:
                System.out.println("Try Again!");
        }
    }
    
    public static String subString(String s, int o, int e) 
    {
        String h = "";
        for (int i = o; i < e; i++)
        {
            h = h + s.charAt(i);
        }
        return h;
    }
    
    public static String toLowerCase(String s)
    {
        String h = "";
        for (int i = 0; i < s.length(); i++) 
        {
            char c = s.charAt(i);
            if (c >= 'A' && c <= 'Z') 
            {
                c = (char)(c + 32);
                h += c;
            } 
            else
            {
                h += c;
            }
        }
        return h;
    }
    
    public static String toUpperCase(String s) 
    {
        String h = "";
        for (int i = 0; i < s.length(); i++) 
        {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z') 
            {
                c = (char)(c - 32);
                h += c;
            } 
            else
            {
                h += c;
            }
        }
        return h;
    }
}
