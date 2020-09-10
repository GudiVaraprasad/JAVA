
// Exception Handling : Finally Block

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

	  // ............ anything shouldnot be written between try and catch block (or) catch and finally block (or) try and finally block ........

		catch(Exception e) // ArithmeticException e
		{
			System.out.println();
			System.out.println("Exception : " + e);
		}

		// ............ anything shouldnot be written between try and catch block (or) catch and finally block (or) try and finally block ........

		finally
		{
			System.out.println("I am in FINALLY BLOCK .... !! ");
		}

		System.out.println("I am in MAIN METHOD ..... !!");
	}
}


/* Output :

Exception : java.lang.ArithmeticException: / by zero
I am in FINALLY BLOCK .... !!
I am in MAIN METHOD ..... !!

*/
