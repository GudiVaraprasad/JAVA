// Performing multiple task from multiple thread

class MultipleTaskMultipleThread1 extends Thread 
{
	@Override
	public void run()
	{
		System.out.println("Performing multiple task from multiple thread 1");
	}
}

class MultipleTaskMultipleThread2 extends Thread 
{
	@Override
	public void run()
	{
		System.out.println("Performing multiple task from multiple thread 2");
	}
}

class MultipleTaskMultipleThread3 extends Thread 
{
	@Override
	public void run()
	{
		System.out.println("Performing multiple task from multiple thread 3");
	}
}

public class MainThread
{
	public static void main(String[] args) 
	{
		MultipleTaskMultipleThread1 object1 = new MultipleTaskMultipleThread1();
		object1.start();

		MultipleTaskMultipleThread2 object2 = new MultipleTaskMultipleThread2();
		object2.start();

		MultipleTaskMultipleThread3 object3 = new MultipleTaskMultipleThread3();
		object3.start();
	}
}