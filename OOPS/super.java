
//  " super "  keyword in java

class A
{
	int i=10;
}

class B extends A
{
	int i=20;

	void show(int i)
	{
		System.out.println("Printing the variable : "+i); // 30
		System.out.println("THIS KEYWORD : "+this.i);  // 10
		System.out.println("SUPER KEYWORD : "+super.i);  // 20
	}
	public static void main(String[] args) 
	{
		B obj = new B();
		obj.show(30);
	}

}


/*
Output :

Printing the variable : 30
THIS KEYWORD : 20
SUPER KEYWORD : 10

*/
