class Gen< T >
{
	T x; // int x

	Gen(T x)           // Gen(int x)
	{
		this.x=x;
	}

	void display()    // this for T
	{
		System.out.println("Type of T : "+x.getClass().getName());
	}

	T print()   // int print()
	{
		return x;
	}

}

class GenDemo
{
	public static void main(String[] args) 
	{
		Gen <Integer> integerobject;                 // creating            // Gen obj;   obj = new Gen();  
		integerobject = new Gen <Integer> (88);

		integerobject.display();

		// integerobject.print();

		int xintvalue = integerobject.print();
		System.out.println("Value of x : "+xintvalue);

		Gen <String> stringobject;
		stringobject = new Gen <String> ("Pranav");

		stringobject.display();

		// stringobject.print();

		String xstringvalue = stringobject.print();
		System.out.println("Value of x : "+xstringvalue);
	}
}
