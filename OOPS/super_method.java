
//  " super "  keyword in java
// " super " keyword can be used to invoke immediate parent class method


class A
{
	void m1()
	{
		System.out.println(" I am in class A ");
	}
}

public class B extends A
{
	void m1()
	{
		System.out.println(" I am in class B "); 
	}

	void show()
	{
		m1();  // current class
		super.m1();  // parent class
	}

	public static void main(String[] args) 
	{
		B obj = new B();
		obj.show();
	}

}



/*
Output :

 I am in class A
 I am in class B

*/
