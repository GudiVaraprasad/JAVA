import java.util.*;
class Main
{
	public static void main(String[] args) 
	{
		int binary[] = new int[40];
     	int n,index=0,i;
     	Scanner in = new Scanner(System.in);
     	System.out.println("Enter the decimal number");
     	n = in.nextInt();
     	if(n == 0)
     	{
     		System.out.println("Please enter the number greater than zero");
      	}
     	else
     	{
	    	while(n > 0)
	    	{
	       		binary[index++] = n%2;
	       		n = n/2;
	     	}
	     	for(i = index-1;i >= 0;i=i-1)
	     	{
	       		System.out.print(binary[i]);
	     	}
     	}
	}
}