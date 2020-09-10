
// Different methods to Print Exception Information in Java

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

	  // ............ anything shouldnot be written between try and catch block ........

		catch(Exception e) // ArithmeticException e
		{
			System.out.println();
			System.out.println(" System.out.println(e) --------> " + e);
			System.out.println("------------------------------------------------------------------------");
			System.out.println(" System.out.println(e.toString()) --------> " + e.toString());
			System.out.println("------------------------------------------------------------------------");
			System.out.println(" e.printStackTrace() --------> ");
				e.printStackTrace();
			System.out.println("------------------------------------------------------------------------");
			System.out.println(" System.out.println(e.getMessage()) --------> " + e.getMessage());
		}
	}
}

/* Output :

 System.out.println(e) --------> java.lang.ArithmeticException: / by zero
------------------------------------------------------------------------
 System.out.println(e.toString()) --------> java.lang.ArithmeticException: / by zero
------------------------------------------------------------------------
 e.printStackTrace() -------->
java.lang.ArithmeticException: / by zero
        at Test.main(Test.java:12)
------------------------------------------------------------------------
 System.out.println(e.getMessage()) --------> / by zero


*/
