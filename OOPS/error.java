
// Error in java program
class Test 
{
	public static void main(String[] args)
	{
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println("4");
		Syste.out.printl("error is not same as exception");   // syntax error
		System.out.println("5");
		System.out.println("6");
		System.out.println("7");
		System.out.println("8");
		System.out.println("9");
	}
}

/* output : compile error

Test.java:9: error: package Syste does not exist
                Syste.out.printl("error is not same as exception");   // syntax error
                     ^
1 error

*/
