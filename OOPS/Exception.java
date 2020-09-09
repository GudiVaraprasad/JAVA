 
// Exception Handling in Java

class Test 
{
	public static void main(String[] args)
	{
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println("4");
		System.out.println(100/0);   // artimetic exception 
		// these will not print and flow of print has distrubed
		System.out.println("5");
		System.out.println("6");
		System.out.println("7");
		System.out.println("8");
		System.out.println("9");
	}
}

/* output :

1
2
3
4
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Test.main(Test.java:9)

*/
