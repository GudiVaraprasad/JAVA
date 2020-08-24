
// Sum and difference of two numbers using INTERFACE

import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	  Scanner in = new Scanner(System.in);
	  int a=in.nextInt();
	  int b=in.nextInt();
	    Addition obj=new Addition();
	    obj.Operation(a,b);
	    Subtraction obj1=new Subtraction();
	   obj1.Operation(a,b);
	}
}

	interface Arithmetic
  {
	  void Operation(int a, int b);
	}

class Addition implements Arithmetic
{
    @Override
    public void Operation(int a, int b)
    { 
        int k=a+b;
     System.out.println(k);
    }
}

class Subtraction implements Arithmetic
{
    @Override
    public void Operation(int a, int b)
    {
        int k=a-b;
        System.out.println(k);
    }
}
