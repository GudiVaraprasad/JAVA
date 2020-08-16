
import java.util.*;
class Animal  // parent class
{
	void eat()
	{
		System.out.println("I AM EATING !!");
	}
}
class Dog extends Animal  // child class
{
	public static void main(String[] args)
	{
		Dog obj = new Dog();
		obj.eat();
	}
}

// output : I AM EATING !!  ( Inheritence concept )



/* 

import java.util.*;
class Animal  // parent class
{
	void eat()
	{
		System.out.println("I AM EATING !!");
	}
}
class Dog // child class
{
	public static void main(String[] args)
	{
		Animal obj = new Animal();
		obj.eat();
	}
}

// output : I AM EATING !!  (normal way)

*/
