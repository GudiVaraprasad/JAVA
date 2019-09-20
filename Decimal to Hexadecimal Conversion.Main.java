import java.util.*;
class Main
{
	public static void main(String[] args) 
	{
		int r,decimal,n;  
     	String hex="";   
     	char hexchars[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};  
    	System.out.println("Enter the Decimal number");
    	Scanner in = new Scanner(System.in);
    	n = in.nextInt();
    	decimal = n;
    	while(decimal>0)  
     	{  
	       r=decimal%16;   
	       hex=hexchars[r]+hex;   
	       decimal=decimal/16;  
     	} 
     	System.out.println("The hexadecimal value is " +hex);
	}
}