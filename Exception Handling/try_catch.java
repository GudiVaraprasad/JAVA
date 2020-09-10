
// try catch Java | Control Flow in try catch

class Test
{
	public static void main(String[] args)
	{
		try
		{
			int a=100;
			int b=0;
			int c=a/b;
			System.out.println(c);
		}
		catch(Exception e) // ArithmeticException e
		{
			System.out.println(e);
			System.out.println("you can't divide by zero");
		}
		System.out.println("Code is successfully excecuted and exception is  handled...");
	}
}

/* Output :

java.lang.ArithmeticException: / by zero
you can't divide by zero
Code is successfully excecuted and exception is  handled...

*/
