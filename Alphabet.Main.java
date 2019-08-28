import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter an alphabet");
        char operator=in.next().charAt(0);
        char result;
        switch(operator)
        {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
            System.out.println("Vowel"); 
            break;
            default:
            System.out.println("Consonant");
            break;
        }
        
    }
}