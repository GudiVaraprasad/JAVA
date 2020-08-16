
  //   Single Inheritence


import java.util.*;
class A  // parent class
{
	void showA()
	{
		System.out.println("I AM IN METHOD A");
	}
}

class B extends A  // child class
{
	void showB()
	{
		System.out.println("I AM IN METHOD B");
	}

	public static void main(String[] args)
	{
		B obj = new B();
		obj.showA();
		obj.showB();
	}
}

/* output :

I AM IN METHOD A
I AM IN METHOD B

*/

