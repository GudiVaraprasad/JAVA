
// Multilevel Inheritence

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

class C extends B // child class
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
		C obj = new C();
		obj.showA();
		obj.showB();
		obj.showC();
	}
}

/* output :

I AM IN METHOD A
------------------
I AM IN METHOD A
I AM IN METHOD B
------------------
I AM IN METHOD A
I AM IN METHOD B
I AM IN METHOD C

*/

