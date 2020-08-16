
// Heirarchical_Inheritence

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
}

class C extends A // child class
{
	void showC()
	{
		System.out.println("I AM IN METHOD C");
	}

	public static void main(String[] args)
	{
		A obj1 = new A();
		obj1.showA();
		System.out.println("------------------");
		B obj2 = new B();
		obj2.showA();
		obj2.showB();
		System.out.println("------------------");
		C obj3 = new C();
		obj3.showA();
		// obj3.showB();   --->  not possible as it extends from class A .... class B cannot be accessed
		obj3.showC();
	}
}

/* output :

I AM IN METHOD A
------------------
I AM IN METHOD A
I AM IN METHOD B
------------------
I AM IN METHOD A
I AM IN METHOD C

*/

