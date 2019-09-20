import java.util.*;
class Main
{
	public static void main(String[] args) 
	{
		int b,n,ld,d=0,base=1;
    	System.out.println("Enter the binary number");
    	Scanner in = new Scanner(System.in);
    	b = in.nextInt();
    	n = b;
        while (n > 0) 
        { 
            ld = n % 10; 
            n = n / 10; 
            d = d + ld * base; 
            base = base * 2;   
        } 
    	System.out.println("The Decimal number is: " + d);  
	}
}