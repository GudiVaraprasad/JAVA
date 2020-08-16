
// Abstract Class in java

abstract class Vehicle
{
	int vehicles;
	abstract void start();
}

class Car extends Vehicle
{
	void start()
	{
		System.out.println("Car starts with a key");
	}
}

class Scooter extends Vehicle
{
	void start()
	{
		System.out.println("Scooter starts with kick");
	}

	public static void main(String[] args)
	{
		Car c = new Car();
		c.start();

		Scooter s = new Scooter();
		s.start();
		
	}
}

// cannot create object for an abstract class (remember)

/*

output : 

Car starts with a key
Scooter starts with kick

*/
