
//  " super "  keyword in java
//  " super() " can be used to invoke immediate parent class constructor 


class A
{
	A()
	{
		System.out.println(" I am in class A ");
	}
}

public class B extends A
{
	B()
	{
		// super();  // both are the same output
		super();
		System.out.println(" I am in class B "); 
	}

	public static void main(String[] args) 
	{
		B obj = new B();
	}
}


/*
Output :

 I am in class A 
 I am in class B 

*/

 /*

super - keyword can be used to refer immediate parent class instance variable
super() - can be used to invoke immediate parent class constructor / methods

 */
