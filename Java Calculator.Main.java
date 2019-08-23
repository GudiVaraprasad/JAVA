import java.util.Scanner;
class Main
{
    public static void main(String args[]) 
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers: ");

        double first = in.nextDouble();
        double second = in.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");

        char operator = in.next().charAt(0);

        double result;

        switch(operator)
        {
            case '+':
                result = first + second;
                break;
            case '-':
                result = first - second;
                break;
            case '*':
                result = first * second;
                break;
            case '/':
                result = first / second;
                break;
                
            default:
                System.out.printf("Error! operator is not correct");
                return;
        }
        System.out.println("Number 1=" +first);
        System.out.println("Number 2=" +second);
        System.out.println("result=" +result);
    }
}