// Performing single task from single thread

class SingleTaskSingleThread extends Thread 
{
	@Override
	public void run()
	{
		System.out.println("Performing single task from single thread");
	}

	public static void main(String[] args) 
	{
		SingleTaskSingleThread object = new SingleTaskSingleThread();
		object.start();
	}
}