import java.util.*;
class Main
{
	public static void main(String[] args) 
	{
		int num, decimal;
		int octalNumber = 0, i = 1; 
		System.out.println("Enter the Decimal number");
    	Scanner in = new Scanner(System.in);
		num = in.nextInt();
		decimal = num;
        while (decimal>0)
        {
            octalNumber =octalNumber+ (decimal % 8) * i;
            decimal=decimal /8;
            i =i*10;
        }
        System.out.println(octalNumber);
	}
}