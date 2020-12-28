// Performing single task from multiple thread

class SingleTaskMultipleThread extends Thread 
{
	@Override
	public void run()
	{
		System.out.println("Performing single task from multiple thread");
	}

	public static void main(String[] args) 
	{
		SingleTaskMultipleThread object1 = new SingleTaskMultipleThread();
		object1.start();

		SingleTaskMultipleThread object2 = new SingleTaskMultipleThread();
		object2.start();

		SingleTaskMultipleThread object3 = new SingleTaskMultipleThread();
		object3.start();
	}
}