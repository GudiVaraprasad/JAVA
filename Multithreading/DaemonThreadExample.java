import java.util.*;

class DaemonThreadExample extends Thread 
{
	@Override
	public void run()
	{
		System.out.println("Daemon Thread Check");

		if(Thread.currentThread().isDaemon())
		{
			System.out.println("This is a Daemon Thread");
		}
		else 
		{
			System.out.println("Child Thread");
		}
	}

	public static void main(String[] args) 
	{
		System.out.println("Main Thread");

		DaemonThreadExample object = new DaemonThreadExample();
		object.setDaemon(true);
		//object.setDaemon(false);
		object.start();


		//object.setDaemon(true);  // throws IllegalThreadStateException
		// object.start();

	}
}